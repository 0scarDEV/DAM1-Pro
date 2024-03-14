package coleccionesapuntes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
public class E1207 {
    /* E1207. Repetir la actividad E1206 usando métodos globales. */
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> coleccion = new ArrayList<>(100);
        Collection<Integer> cincos = new ArrayList<>();
        cincos.add(5);

        for (int i = 0; i < 100; i++) {
            coleccion.add(random.nextInt(0, 11));
        }

        System.out.println("Elementos de la colección:");
        for (int n: coleccion) {
            System.out.print(n + " ");
        }

        System.out.println("\nEliminando elementos...");
        coleccion.removeAll(cincos);

        System.out.println("Elementos de la colección:");
        for (int n: coleccion) {
            System.out.print(n + " ");
        }
    }
}