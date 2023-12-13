package ejerciciosapuntes;

import java.util.Arrays;

/*
E0506. Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la combinación ganadora. La función devolverá el número de aciertos.

static int numAciertos(int[] apuesta, int[] ganadora)
 */
public class E0506 {
    public static void main(String[] args) {
        int[] apuesta = tablaAleatoria(1, 49, 6);
        int[] combinacionGanadora = tablaAleatoria(1, 49, 6);
        Arrays.sort(combinacionGanadora);

        System.out.println("La apuesta es: " + Arrays.toString(apuesta));
        System.out.println("La combinación ganadora es: " + Arrays.toString(combinacionGanadora));

        System.out.println("Aciertos: " + numAciertos(apuesta, combinacionGanadora));
    }

    static int numAciertos(int[] apuesta, int[] ganadora) {
        return 0;
    }

    static int[] tablaAleatoria(int numInicio, int numFin, int longitud) {
        int[] t = new int[longitud];
        for (int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * (numFin - numInicio + 1) + numInicio);
        }
        return t;
    }
}