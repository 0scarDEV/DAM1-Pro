package coleccionesapuntes;
import java.util.*;
public class E1205 {
    /*E1205. Implementar una aplicación en la que se insertan en una colección 100 números enteros aleatorios entre 1 y 10 (incluídos), que pueden estar repetidos. A continuación, se crea una lista con los mismos elementos sin repeticiones.*/
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>(100);

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            coleccion.add(random.nextInt(0, 11));
        }

        System.out.println("Elementos de la colección:");
        for (int n: coleccion) {
            System.out.print(n + " ");
        }

        System.out.println("Elementos de la lista");
        List<Integer> lista = new ArrayList<>();
        for (int n: coleccion) {
            if (!lista.contains(n)) {
                lista.add(n);
                System.out.print(n + " ");
            }
        }
    }
}