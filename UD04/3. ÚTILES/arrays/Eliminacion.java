package arrays;

import java.util.Arrays;

public class Eliminacion {
    public static int[] eliminarNumerosRepetidos(int[] array) {
        int longitudOriginal = array.length;
        int[] arraySinRepetidos = new int[longitudOriginal];
        int contador = 0;

        for (int i = 0; i < longitudOriginal; i++) {
            boolean esRepetido = false;
            for (int j = 0; j < contador; j++) {
                if (array[i] == arraySinRepetidos[j]) {
                    esRepetido = true;
                    break;
                }
            }

            if (!esRepetido) {
                arraySinRepetidos[contador] = array[i];
                contador++;
            }
        }

        // Redimensionar el array resultante
        arraySinRepetidos = Arrays.copyOf(arraySinRepetidos, contador);

        return arraySinRepetidos;
    }
    static int[] eliminarMayores(int t[], int valor) {
        int[] aux = new int[0];

        for (int val : t) {
            if (val <= valor) {
                aux = Arrays.copyOf(aux, aux.length + 1);
                aux[aux.length - 1] = val;
            }
        }

        return aux;
    }
}
