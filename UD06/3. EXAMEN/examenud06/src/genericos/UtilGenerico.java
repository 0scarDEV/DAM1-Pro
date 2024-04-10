package genericos;
import java.util.*;

/* Óscar Fernández Pastoriza */
public class UtilGenerico {
    static <E> Collection<E> sinRepetidos(Collection<E> coleccion) {
        return new LinkedHashSet<>(coleccion);
    }
    static <E> Map<E, Integer> contarRepetidos(Collection<E> colleccion) {
        Map<E, Integer> mapa = new HashMap<>();
        for (E entrada : colleccion) {
            if (mapa.containsKey(entrada)) {
                int cont = mapa.get(entrada);   // Obtener el valor que ya tiene la entrada
                cont++;                         // Sumarle uno
                mapa.put(entrada, cont);        // Sustituir la entrada
            } else {
                mapa.put(entrada, 1);
            }
        }
        return mapa;
    }
    static <T, E> Map<T, E> iniciarMapa(Set<T> conjunto, List<E> lista) {
        // Ordenamos la lista de manera descendente
        lista.sort((Comparator<? super E>) Comparator.naturalOrder().reversed());

        // Ordenamos el conjunto de manera ascendente
        TreeSet<T> conjuntoOrdenado = (TreeSet<T>) new TreeSet<>(Comparator.naturalOrder());
        conjuntoOrdenado.addAll(conjunto);

        // Calculo de nulos necesarios.
        int numNulls = conjuntoOrdenado.size() - lista.size();
        // Bucle para llenar la lista de nulos, solo si hay nulos que añadir (numNulls positivo).
        if (numNulls > 0) {
            for (int i = 0; i < numNulls; i++) {
                lista.add(null);
            }
        }

        // Creamos el mapa y sus iteradores
        Map<T, E> mapa = new LinkedHashMap<>();
        Iterator<T> keyIt = conjuntoOrdenado.iterator();
        Iterator<E> valueIt = lista.iterator();

        // Como el valor bandera es el iterador de la clave, si hubiera más values, no se añadirán.
        while (keyIt.hasNext()) {
            mapa.put(keyIt.next(), valueIt.next());
        }

        return mapa;
    }

    public static void main(String[] args) {
        /*        SIN REPETIDOS         */
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        System.out.println(sinRepetidos(list1));        // Muestra solo un uno.

        /*       CONTAR REPETIDOS       */
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        System.out.println(contarRepetidos(list1));     // uno (x2); dos (x3); 3 (x1)

        /*          INICIAR MAPA        */
        Set<String> conjunto1 = new LinkedHashSet<>();
        conjunto1.add("Hola");
        conjunto1.add("Buenos");
        conjunto1.add("Días");

        System.out.println(iniciarMapa(conjunto1, list1));  // Se descartan los valores si no hay suficientes keys.
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        System.out.println(iniciarMapa(conjunto1, list2));  // Se rellena con nulls
    }
}
