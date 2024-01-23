package arrays;

import java.util.Arrays;

public class Busqueda {
    /**
     * @return Devuelve una tabla con todos los índices de los elementos donde se encuentra la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t, la función devolverá una tabla vacía.
     */
    public static int[] buscarTodos(int[] t, int clave) {
        int[] t2 = new int[0];
        int i, numCoincidencias = 0;

        for (i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                t2 = Arrays.copyOf(t2, numCoincidencias + 1);
                t2[numCoincidencias] = i;
                numCoincidencias++;
            }
        }
        return t2;
    }
}
