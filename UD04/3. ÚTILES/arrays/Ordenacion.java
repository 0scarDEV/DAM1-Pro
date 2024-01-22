package arrays;
import java.util.Arrays;
public class Ordenacion {
    static void desordenar(int[] t) {
        // Cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.*/
        for (int i = 0; i < t.length; i++){
            int pos = (int) (Math.random() * t.length);
            int ch = t[i];
            t[i] = t[pos];
            t[pos] = ch;
        }
    }

    static int[] desordenarTabla(int[] t) {
        // la función no modifica la tabla que se pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los valores de los elementos.
        for (int i = 0; i < t.length; i++){
            int pos = (int) (Math.random() * t.length);
            int ch = t[i];
            t[i] = t[pos];
            t[pos] = ch;
        }
        return t;
    }

    public static double[] sortInvertido(double[] t){
        // Variables
        double[] arrayInvertido = new double[t.length];
        int j = 0;

        // Ordenamos el array
        Arrays.sort(t);

        // Creamos un array invertido
        for (int i = t.length -1; i >= 0; i--){
            arrayInvertido[j] = t[i];
            j++;
        }

        return arrayInvertido;
    }

    public static int[] fusionOrdenada(int[] t1, int[] t2) {
        int[] tablaCombinada = new int[t1.length + t2.length];
        int i = 0, j = 0, k = 0;

        // Mientras el contador sea menor que la longitud de ambas tablas
        while (i < t1.length && j < t2.length) {
            if (t1[i] < t2[j]){  // y si el valor de la tabla 1 es menor que el de la tabla 2
                tablaCombinada[k] = t1[i];    // asignamos en la posición k el valor de la tabla 1.
                i++;
            } else {             // y si el valor de la tabla 1 es mayor o igual que el de la tabla 2
                tablaCombinada[k] = t2[j];    // asignamos en la posición k el valor de la tabla 2.
                j++;
            }
            k++;
        }

        // Una vez el contador sea mayor que la longitud de alguna de las tablas:
        // Comprobaremos si aun quedan huecos en la tabla 1 y los recorremos a la vez que asignamos en la tablaCombinada
        while (i < t1.length){
            tablaCombinada[k] = t1[i];
            i++;
            k++;
        }
        // Comprobamos si aun quedan huecos en la tabla 2 y los recorremos a la vez que asignamos en la tablaComibada
        while (j < t2.length){
            tablaCombinada[k] = t2[j];
            j++;
            k++;
        }

        // Devolvemos la tabla combinada.
        return tablaCombinada;
    }
}
