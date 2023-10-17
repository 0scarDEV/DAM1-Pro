package expresiones;

import java.util.Scanner;

public class E929 {
    public static void main(String[] args) {
        // Dado un número N de cuatro cifras, comprobar si la primera cifra(la más a la izquierda) es impar.
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa comprueba si la primera cifra de un número de 4 cifras es impar. Introduzca a continuación un número:");
        int N = sc.nextInt();

        boolean resultado = (N / 1000) % 2 != 0;
        System.out.println("¿La primera cifra es impar? " + resultado);

        sc.close();
    }
}