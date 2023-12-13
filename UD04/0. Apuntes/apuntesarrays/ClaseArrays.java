package apuntesarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClaseArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de números a introducir: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Existe el método fill() de la clase java.util.Arrays, sirve para rellenar las posiciones de una Array.

        Arrays.fill(numeros, 0);        // Llenamos todas las posiciones del array "numeros" con el valor 0.
        System.out.println("Imprimir array");
        ArrayNumeros.imprimir(numeros);
        System.out.println();

        Arrays.fill(numeros, 10, 20, n);        // Llenamos las posiciones 10 a 19 del array "numeros" con el valor n.
                                                                // Si el array no tiene índice 19 generará una excepción.
        System.out.println("Imprimir array v1");
        ArrayNumeros.imprimir(numeros);
        System.out.println();

        // Existe una versión extendida del for, o for-each para los arrays. Esto es equivalente al método ArrayNumeros.imprimir()
        System.out.println("Imprimir array v2");
        for (int j : numeros) {
            System.out.print(j + " ");
        }

        // Existe el método toString() de la clase java.util.Arrays, devuelve todos los elementos del Array.
        System.out.println();
        System.out.println("Arrays to String");
        System.out.println(Arrays.toString(numeros));

        // Existe el método sort() de la clase java.uti.Arrays, sirve para mostrar de manera ordenada todos los elementos del Array.
        System.out.println("Arrays sort");
        Arrays.sort(numeros);
        ArrayNumeros.imprimir(numeros);
        System.out.println();

        /*
        // Mostramos todos los números pares del 0 al 10
        System.out.println("Numeros pares");
        System.out.println(Arrays.toString(rellenaPares(n, 10)));
        */

        // Existe el método binarySearch(array, clave) de la clase java.uti.Arrays, devuelve la posición de la clave indicada.
        System.out.println("BinarySearch");
        System.out.println(Arrays.binarySearch(numeros, 25));

        // Existe el método binarySearch(array, posMin, posMax, clave) sobrecargado de la clase java.uti.Arrays, devuelve la posición de la clave indicada si se encuentra dentro del rango.
        System.out.println("BinarySearch SobreCargado");
        System.out.println(Arrays.binarySearch(numeros, 5, 10, 25));
    }
    static int[] rellenaPares(int longitud, int fin) {
        int[] t = new int[longitud];

        for (int i = 0; i < t.length; i++) {
            t[i] = (int) ((Math.random() * fin / 2) * 2 + 2);
        }
        return t;
    }
}