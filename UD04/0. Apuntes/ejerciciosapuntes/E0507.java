package ejerciciosapuntes;

import java.util.Arrays;

/*  E0507. Implementar la función int[] sinRepetidos(int t[]) que construye y devuelve una tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.

    Implementa una función que genere y devuelva un array de n números enteros aleatorios usando el siguiente prototipo:

    int[] tablaRandom(int n)*/
public class E0507 {
    public static void main(String[] args) {
        int[] t = tablaRandom(10);
        System.out.println(Arrays.toString(t));

        int[] t2 = eliminarNumerosRepetidos(t);
        System.out.println(Arrays.toString(t2));
    }

    static int[] tablaRandom(int n) {
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            // final int MAX_INT = 2147483647;
            t[i] = (int) (Math.random() * 10);
        }
        return t;
    }

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
}