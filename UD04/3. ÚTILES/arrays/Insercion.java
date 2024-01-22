package arrays;
import java.util.Arrays;
import java.util.Random;

public class Insercion {
    public static void insertarEnPosicion(int[] array, int valor, int posicion) {
        array = Arrays.copyOf(array, array.length + 1);

        // Asegurarse de que la posición es válida
        if (posicion < 0 || posicion > array.length) {
            System.out.println("Posición no válida. No se puede insertar el valor.");
            return;
        }

        // Desplazar elementos para hacer espacio para el nuevo valor
        for (int i = array.length - 1; i > posicion; i--) {
            array[i] = array[i - 1];
        }

        // Insertar el nuevo valor en la posición especificada
        array[posicion] = valor;
    }

    public static void insertarOrdenado(int[] array, int numero) {
        int indice = array.length - 1;

        // Desplazar elementos para hacer espacio para el nuevo número
        while (indice >= 0 && array[indice] > numero) {
            array[indice + 1] = array[indice];
            indice--;
        }

        // Insertar el nuevo número en la posición correcta
        array[indice + 1] = numero;
    }

    public static int[] insertarNumRandom() {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        int[] t = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            int num;
            boolean repetido;
            do {
                num = (int) (Math.random() * (numFin - numInicio + 1) + numInicio);
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (t[j] == num) {
                        repetido = true;
                    }
                }
            } while (repetido);
            t[i] = num;
        }
        return t;
    }
}
