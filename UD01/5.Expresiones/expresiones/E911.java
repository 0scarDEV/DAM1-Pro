package expresiones;

import java.util.Scanner;

public class E911 {
    public static void main(String[] args) {
        // Comprobar si la primera cifra de un número entero N de 4 cifras es par
        Scanner sc = new Scanner(System.in);

        double N;
        System.out.println("Este programa comprueba si la primera cifra de un número de 4 cifras es par. Introduzca a continuación un número:");
        N = sc.nextDouble();

        boolean resultado = (N/1000) % 2 == 0;
        System.out.println("¿La última cifra del número N (" + N + ") de cuatro cifras es par? " + resultado);
        
        sc.close();
    }
}