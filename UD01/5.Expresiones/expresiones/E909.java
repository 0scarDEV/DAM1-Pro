package expresiones;

import java.util.Scanner;

public class E909 {
    public static void main(String[] args) {
        // Comprobar si la última cifra de un número entero N es par
        Scanner sc = new Scanner(System.in);

        double N;
        System.out.println("Este programa comprueba si la última cifra de un número entero es par. Introduzca a continuación un número:");
        N = sc.nextDouble();

        boolean resultado = (N%10) % 2 == 0;
        System.out.println("¿La última cifra del número N (" + N + ") es par? " + resultado);
        sc.close();
    }
}
