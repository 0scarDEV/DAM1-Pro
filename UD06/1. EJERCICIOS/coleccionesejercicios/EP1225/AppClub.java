package coleccionesejercicios.EP1225;
import java.time.LocalDate;
import java.util.*;
/* Óscar Fernández Pastoriza */
public class AppClub {
    /* EP1225. Implementa una aplicación que gestione un club donde se identifica a los socios por un apodo personal y único. De cada socio, además del apodo, se guarda el nombre y su fecha de ingreso en el club. Utiliza un mapa donde las claves serán los apodos y los valores, objetos de la clase ficherosbinariosapuntes.Socio. Los datos se guardarán en un fichero llamado “club.dat”, de donde se leerá el mapa al arrancar y donde se volverá a guardar actualizado al salir. Las operaciones se mostrarán en un menú que tendrá las siguientes opciones:
    * 1. Alta socio.
    * 2. Baja socio.
    * 3. Modificación socio.
    * 4. Listar socios por apodo.
    * 5. Listar socios por antigüedad.
    * 6. Listar los socios con alta anterior a un año nado.
    * 7. Salir.
    * */
    static Map<String, Socio> m = new TreeMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 7) {
            switch (opcion) {
                case 1 -> darAltaSocio();
                case 2 -> darBajaSocio();
                case 3 -> modificarSocio();
                case 4 -> listarSocios();
                case 5 -> listarSocios(new ComparadorSocioAntiguedad());
                case 6 -> listarSocioAnho();
                default -> System.out.println("Opción inválida, inténtelo de nuevo.");
            }

            mostrarMenu();
            opcion = sc.nextInt();
        }
    }
    private static void darAltaSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();

        if (m.containsKey(apodo)) {
            System.out.println("ERROR. Ya existe un socio con ese apodo.");
        } else {
            putSocio(apodo);
            System.out.println("ficherosbinariosapuntes.Socio dado de alta correctamente.");
        }
    }
    private static void darBajaSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();
        if (m.containsKey(apodo)) {
            m.remove(apodo);
            System.out.println("ficherosbinariosapuntes.Socio eliminado correctamente.");
        } else {
            System.out.println("ERROR. No existe un socio con ese apodo.");
        }
    }
    private static void modificarSocio() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el apodo: ");
        String apodo = sc.nextLine();

        if (!m.containsKey(apodo)) {
            putSocio(apodo);
            System.out.println("ficherosbinariosapuntes.Socio modificado correctamente.");
        } else {
            System.out.println("El socio no existe.");
        }
    }
    public static void mostrarMenu() {
        System.out.println("[------- MENÚ -------]");
        System.out.println("1. Alta socio.");
        System.out.println("2. Baja socio.");
        System.out.println("3. Modificación socio.");
        System.out.println("4. Listar socios por apodo.");
        System.out.println("5. Listar socios por antigüedad.");
        System.out.println("6. Listar los socios con alta anterior a un año nado.");
        System.out.println("7. Salir.");
    }
    private static void listarSocios() {
        List<Socio> listaSocios = new ArrayList<>(m.values());
        System.out.println(listaSocios);
    }
    private static void listarSocios(Comparator<Socio> comparador) {
        List<Socio> listaSocios = new ArrayList<>(m.values());
        listaSocios.sort(comparador);
        System.out.println(listaSocios);
    }
    private static void putSocio(String apodo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la fecha de alta (aaaa-mm-dd): ");
        String fechaAlta = sc.nextLine();
        LocalDate fechaIngreso = LocalDate.parse(fechaAlta);
        m.put(apodo, new Socio(apodo, nombre, fechaIngreso));
    }
    private static void listarSocioAnho() {
        System.out.print("Introduce el anho: ");
        int anho = new Scanner(System.in).nextInt();
        List<Socio> listaSocios = new ArrayList<>(m.values());

        System.out.println("[");
        for (Socio socio: listaSocios) {
            int anhoSocio = socio.fechaIngreso.getYear();
            if (anhoSocio < anho) {
                System.out.println(socio + ", ");
            }
        }
        System.out.println("]");
    }
}