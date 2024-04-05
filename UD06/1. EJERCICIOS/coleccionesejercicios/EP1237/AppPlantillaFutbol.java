package coleccionesejercicios.EP1237;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AppPlantillaFutbol {
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (!plantilla.containsKey(dorsal)) {
            plantilla.put(dorsal, jugador);
            System.out.println("Jugador dado de alta correctamente.");
        } else {
            System.out.println("ERROR. El dorsal indicado ya está ocupado.");
        }
    }
    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.remove(dorsal);
    }
    static void mostrar (Map<Integer, Jugador> plantilla) {
        Set<Map.Entry<Integer, Jugador>> jugadores = plantilla.entrySet();
        Iterator<Map.Entry<Integer, Jugador>> it = jugadores.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Jugador> jugador = it.next();
            System.out.print(jugador.getKey() + " - " + jugador.getValue());
        }
    }
    static void mostrar (Map<Integer, Jugador> plantilla, String posicion) {
        Set<Map.Entry<Integer, Jugador>> jugadores = plantilla.entrySet();
        Iterator<Map.Entry<Integer, Jugador>> it = jugadores.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Jugador> jugador = it.next();
            if (jugador.getValue().posicion.toString().equals(posicion)) {
                System.out.print(jugador.getKey() + " - " + jugador.getValue().nombre);
            }
        }
    }
    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {
        if (plantilla.containsKey(dorsal)) {
            if (jugador.dni.equals(plantilla.get(dorsal).dni)) {
                plantilla.put(dorsal, jugador);
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Map<Integer, Jugador> plantilla = new TreeMap<>();
        plantilla.put(1, new Jugador("1111","Pepe", Jugador.Posicion.DEFENSA, 178));
        plantilla.put(2, new Jugador("2222","Pepa", Jugador.Posicion.DEFENSA, 178));
        System.out.println("MOSTRAR 1");
        mostrar(plantilla);
        System.out.println("ALTAJUGADOR");
        altaJugador(plantilla, 3, new Jugador("3333","Santi", Jugador.Posicion.CENTROCAMPISTA, 176));
        System.out.println("MOSTRAR DEFENSA");
        mostrar(plantilla, "DEFENSA");
        System.out.println("ELIMINAR");
        eliminarJugador(plantilla, 2);
        editarJugador(plantilla, 1, new Jugador("1111", "Pepe", Jugador.Posicion.DELANTERO, 176));
        System.out.println("MOSTRAR 2");
        mostrar(plantilla);
    }
}
