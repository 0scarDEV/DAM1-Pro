package ejerciciosapuntes;

import java.util.Arrays;

public class E0508 {
    static int[] tablaRandom(int n) {
        int[] t = new int[n];
        for (int i = 0; i < t.length; i++) {
            // final int MAX_INT = 2147483647;
            t[i] = (int) (Math.random() * 10);
        }
        return t;
    }
    private static void mostrarParesEimpares(int[] t){
        int[] impares = new int[0];
        int[] pares = new int[0];

        for (int n : t) {
            if (n % 2 != 0) {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = n;
            } else {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = n;
            }
        }
        System.out.println(Arrays.toString(impares));
        System.out.println(Arrays.toString(pares));
    }
    private static int[] getImpares(int[] t){
        int[] impares = new int[0];
        for (int n : t) {
            if (n % 2 != 0) {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = n;
            }
        }
        return impares;
    }
    private static int[] getPares(int[] t){
        int[] pares = new int[0];
        for (int n : t) {
            if (n % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = n;
            }
        }
        return pares;
    }
    public static void main(String[] args) {
        int[] t = tablaRandom(10);
        System.out.println(Arrays.toString(t));

        mostrarParesEimpares(t);
        System.out.println(Arrays.toString(getImpares(t)));
        System.out.println(Arrays.toString(getPares(t)));
    }
}
