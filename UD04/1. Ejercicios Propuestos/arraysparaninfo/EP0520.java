package arraysparaninfo;
import java.util.Arrays;
/*
    EP0520. La fusión de dos tablas ordenadas consiste en copiar todos sus elementos (de ambas tablas) en una tercera que deberá seguir ordenada. Podemos realizar una fusión ineficiente copiando los elementos de ambas tablas (sin tener en cuenta el orden) en la tabla final y ordenar esta.
    Existe una manera óptima de realizar la fusión en la que se elige en cada momento el primer elemento no copiado de alguna de las tablas y se añade a la tabla final, que seguirá ordenada sin necesidad de ordenación alguna. Busca información sobre el algoritmo de fusión e impleméntalo en Java.
 */
public class EP0520 {
    public static void main(String[] args) {
        int[] t1 = {2, 3, 5, 7, 8, 8, 10, 15, 24, 30};
        int[] t2 = {3, 7, 9, 11, 12, 13, 14};
        System.out.println(Arrays.toString(fusionOrdenada(t1, t2)));
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