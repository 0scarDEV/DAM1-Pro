package ejerciciosapuntes;

import java.util.Arrays;
import java.util.Scanner;

/*E0509. Diseña una aplicación para gestionar un campeonato de programación donde se introduce la puntuación obtenida por 5 programadores, conforme van terminando la prueba, en forma de números enteros. La aplicación debe mostrar las puntuaciones ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato programadores de exhibición cuyas puntuaciones se incluyen con el resto. La forma de especificar que no intervienen más programadores de exhibición es introducir como puntuación un -1. Por último, la aplicación debe mostrar los puntos ordenados de todos los participantes.*/
public class E0509 {
    public static void main(String[] args) {
        // Leer y almacenar puntuación de 5 programadores
        int[] t = new int[5];
        int[] t2 = new int[0];
        int i = 0;
        for (i = 0; i < t.length; i++) {
            System.out.print("Introduce la puntuación del programador " + (i + 1) + ":");
            t[i] = new Scanner(System.in).nextInt();
        }

        // Mostrar puntuaciones ordenadas
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        // Añadir puntuaciones de exhibiciión, hasta introducir -1
        int puntuacion = 0;
        int numProgrExh = 0;
        t2 = Arrays.copyOf(t, t.length + numProgrExh);
        do {
            System.out.print("Introduce la puntuación del programador de exhibición " + (1 + numProgrExh) + ":");
            puntuacion = new Scanner(System.in).nextInt();
            if (puntuacion != -1) {
                // Con cada puntuación válida obtenida aumentamos en un hueco el array.
                numProgrExh++;
                t2 = Arrays.copyOf(t2, t.length + numProgrExh);
                // Añadimos en t2 la nueva puntuación.
                t2[t.length + numProgrExh - 1] = puntuacion;
            }
        } while (puntuacion != -1);

        // Mostrar todos ordenados
        Arrays.sort(t2);
        System.out.println(Arrays.toString(t2));
    }
}