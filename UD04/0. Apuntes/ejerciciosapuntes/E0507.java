package ejerciciosapuntes;

import java.util.Arrays;

/*  E0507. Implementar la función int[] sinRepetidos(int t[]) que construye y devuelve una tabla de la longitud apropiada, con los elementos de t, donde se han eliminado los datos repetidos.

    Implementa una función que genere y devuelva un array de n números enteros aleatorios usando el siguiente prototipo:

    int[] tablaRandom(int n)*/
public class E0507 {
    public static void main(String[] args) {
        int[] t = tablaRandom(10);
        System.out.println(Arrays.toString(t));

        int[] t2 = sinRepetidos(t);
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

    // esto no vaaaaaaa
    static int[] sinRepetidos(int[] t) {
        int numRepetidos = 0;
        int numeroRepetidos = numRepetidos - 1;
        for (int i = 0; i < t.length; i++) {                    // Recorremos todas las posiciones
            for (int j = 0; j < t.length; j++) {            // Recorremos todas las posiciones
                if (t[i] == t[j]) {                         // Comprobamos si un número es repetido
                    numRepetidos++;
                    int ultNumSinRepetir = t.length - numeroRepetidos;
                    // Intercambiamos la posición del valor repetido con el último número no repetido.
                    int x = ultNumSinRepetir;
                    ultNumSinRepetir = t[i];
                    t[i] = x;
                }
            }
        }
        int[] nuevaTabla = Arrays.copyOf(t, t.length - numRepetidos);
        return nuevaTabla;
    }
}