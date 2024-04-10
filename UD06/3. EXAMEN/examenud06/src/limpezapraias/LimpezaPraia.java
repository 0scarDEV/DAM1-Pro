package limpezapraias;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

public class LimpezaPraia implements Serializable {
    LocalDate fecha;
    String equipo;
    Praia praia;
    double kilos;

    public LimpezaPraia() {
    }
    public LimpezaPraia(LocalDate fecha, String equipo, Praia praia, double kilos) {
        this.fecha = fecha;
        this.equipo = equipo;
        this.praia = praia;
        this.kilos = kilos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Al iniciarse, la aplicación cargará el listado de todas las playas de Galicia como se muestra en el código de ejemplo del fichero AppEjemplo.java.
        Praia[] praias = Util.importarPraias("praias.json");

        //  Al iniciarse, la aplicación buscará un fichero de nombre limpiezas.dat registros de anteriores limpiezas de playas y, si si existen se cargarán en la aplicación.
        Map<Praia, List<LimpezaPraia>> mapaPlayas = Util.leerFichero("limpeza.dat",
                new TreeMap<Praia, List<LimpezaPraia>>());

        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 8) {
            switch (opcion) {
                case 1 -> {
                    String equipo = new Scanner(System.in).nextLine();
                    mostrarLimpiezasEquipo(equipo, mapaPlayas);
                }
                case 2 -> {
                    System.out.println("Introduce el ID de la praia");
                    int id = sc.nextInt();
                    int posPraia = Arrays.binarySearch(praias, new Praia(id));
                    mostrarLimpiezasPlaya(praias[posPraia], mapaPlayas);
                }
                case 3 -> mostrarUltLimpiezas(mapaPlayas);
                case 4 -> mostrarPlayasMasSucias(mapaPlayas);
                case 5 -> {
                    // No me dió tiempo a implementar el método de esta opción
                }
                case 6 -> {
                    // No me dió tiempo a implementar el método
                }
                case 7 -> {
                    System.out.println("Introduce el ID de la praia");
                    int id = sc.nextInt();
                    int posPraia = Arrays.binarySearch(praias, new Praia(id));
                    anhadirLimpieza(praias[posPraia], mapaPlayas);
                }
                default -> System.out.println("Opción no válida.");
            }

            mostrarMenu();
            opcion = sc.nextInt();
        }

        // Al finalizar la aplicación, si se han registrado nuevas limpiezas, se actualizará el contenido del fichero limpiezas.dat.
        Util.escribirFichero(mapaPlayas, "limpeza.dat");
    }
    private static void anhadirLimpieza(Praia praia, Map<Praia, List<LimpezaPraia>> mapaPlayas) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Introduza a fecha (AAAA-MM-DD): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());
        System.out.println("Introduza o equipo: ");
        String equipo = sc.nextLine();
        System.out.println("Introduza o número de kilos recollidos: ");
        double kilos = sc2.nextDouble();

        Set<Map.Entry<Praia, List<LimpezaPraia>>> entradas = mapaPlayas.entrySet();
        for (Map.Entry<Praia, List<LimpezaPraia>> e : entradas) {
            if (e.getKey().equals(praia)) {
                List<LimpezaPraia> nuevaLista = new ArrayList<>(e.getValue());
                nuevaLista.add(new LimpezaPraia(fecha, equipo, praia, kilos));
                mapaPlayas.put(praia, nuevaLista);
            }
        }
    }
    private static void mostrarPlayasMasSucias(Map<Praia, List<LimpezaPraia>> mapaPlayas) {
        Set<Praia> praias = mapaPlayas.keySet();
        Set<Map.Entry<Praia, List<LimpezaPraia>>> entradas = mapaPlayas.entrySet();
        Map<Praia, Double> playasSucias = new TreeMap<>();
        List<Praia> praiasMasSucias = new ArrayList<>();

        // Obtener los kilos de basura de cada playa y añadirlos a un mapa.
        for (Praia p : praias) {
            double suciedad = 0;
            for (Map.Entry<Praia, List<LimpezaPraia>> m : entradas) {
                for (int i = 0; i < m.getValue().size(); i++) {
                    if (m.getKey().equals(p)) {
                        suciedad += m.getValue().get(i).kilos;
                    }
                }
            }
            playasSucias.put(p, suciedad);
        }

        // Obtener las praias(claves) con más suciedad(values)
        Set<Map.Entry<Praia, Double>> entradaSucias = playasSucias.entrySet();

        // Obtener una lista ordenada por suciedad.
        List<Double> listaKilos = new ArrayList<>();
        for (Map.Entry<Praia, Double> p : entradaSucias) {
            listaKilos.add(p.getValue());
        }
        Collections.sort(listaKilos);

        Object[] arrayKilos = listaKilos.toArray();

        // Obtener las 10 mayores cantidades de kilos
        List<Double> aux = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aux.add((Double) arrayKilos[i]);
        }

        listaKilos = aux;

        for (Map.Entry<Praia, Double> p : entradaSucias) {
           if (listaKilos.contains(p.getValue())) {
                praiasMasSucias.add(p.getKey());
            }
        }

        System.out.println(praiasMasSucias);
    }
    private static void mostrarUltLimpiezas(Map<Praia, List<LimpezaPraia>> mapaPlayas) {
        List<LimpezaPraia> listadoUltLimpezas = new ArrayList<>();
        Set<Map.Entry<Praia, List<LimpezaPraia>>> entradas = mapaPlayas.entrySet();

        for (Map.Entry<Praia, List<LimpezaPraia>> m : entradas) {
            for (int i = 0; i < 10; i++) {
                listadoUltLimpezas.add(m.getValue().get(i));
            }
        }

        System.out.println(listadoUltLimpezas);
    }
    private static void mostrarLimpiezasPlaya(Praia praia, Map<Praia, List<LimpezaPraia>> mapaPlayas) {
        List<LimpezaPraia> listadoLimpezas = new ArrayList<>();

        Set<Map.Entry<Praia, List<LimpezaPraia>>> entradas = mapaPlayas.entrySet();

        for (Map.Entry<Praia, List<LimpezaPraia>> m : entradas) {
            if (m.getKey().equals(praia)) {
                listadoLimpezas = m.getValue();
            }
        }

        listadoLimpezas.sort((o1, o2) -> o1.fecha.compareTo(o2.fecha));

        System.out.println(listadoLimpezas);
    }
    private static void mostrarLimpiezasEquipo(String equipo, Map<Praia, List<LimpezaPraia>> mapaPlayas) {
        List<LimpezaPraia> listadoLimpezas = new ArrayList<>();

        Set<Map.Entry<Praia, List<LimpezaPraia>>> entradas = mapaPlayas.entrySet();

        for (Map.Entry<Praia, List<LimpezaPraia>> m : entradas) {
            for (int i = 0; i < m.getValue().size(); i++) {
                if (m.getValue().get(i).equipo.equals(equipo)) {
                    listadoLimpezas.add(m.getValue().get(i));
                }
            }
        }

        listadoLimpezas.sort((o1, o2) -> o2.fecha.compareTo(o1.fecha));

        System.out.println(listadoLimpezas);
    }
    private static void mostrarMenu() {
        System.out.println("1. Listado de limpiezas de un equipo concreto, ordenado por fecha ascendentemente.");
        System.out.println("2. Listado de limpiezas de una playa concreta, ordenado por fecha descendentemente.");
        System.out.println("3. 10 últimas limpiezas realizadas en cualquier playa.");
        System.out.println("4. 10 playas con más kilos de basura recogidos.");
        System.out.println("5. 10 primeros equipos con más limpiezas realizadas");
        System.out.println("6. 10 primeros equipos con más kilos recogidos");
        System.out.println("7. Añadir una nueva limpieza.");
        System.out.println("8. Salir.");
    }
}
