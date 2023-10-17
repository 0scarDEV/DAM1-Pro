package expresiones;

import java.util.Scanner;

public class E910 {
    public static void main(String[] args) {
        // Comprobar si la primera cifra de un número entero N de 3 cifras es impar
        Scanner sc = new Scanner(System.in);

        double N;
        System.out.println("Este programa comprueba si la primera cifra de un número de 3 cifras es impar. Introduzca a continuación un número:");
        N = sc.nextDouble();

        boolean resultado = (N/100) % 2 != 0;
        System.out.println("¿La primera cifra del número N (" + N + ") de tres cifras es impar? " + resultado);

        sc.close();
    }
}
