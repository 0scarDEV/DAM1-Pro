package coleccionesapuntes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
public class E1206 {
    /* E1206. Implementar una aplicación donde se insertan 100 números enteros aleatorios entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. Después se eliminan todos los elementos que valen 5. Mostrar la colección antes y después de la eliminación. */
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> coleccion = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            coleccion.add(random.nextInt(0, 11));
        }

        System.out.println("Elementos de la colección:");
        for (int n: coleccion) {
            System.out.print(n + " ");
        }

        System.out.println("\nEliminando elementos...");
        Iterator<Integer> it = coleccion.iterator();
        while (it.hasNext()) {
            if (it.next() == 5) {
                it.remove();
            }
        }

        System.out.println("Elementos de la colección:");
        for (int n: coleccion) {
            System.out.print(n + " ");
        }
    }
}