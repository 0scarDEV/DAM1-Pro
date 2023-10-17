package expresiones;

import java.util.Scanner;

public class E930 {
    public static void main(String[] args) {
        // Dado un número N de cinco cifras, comprobar si la primera cifra (la más a la izquierda) es igual a la segunda.
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa comprueba si la primera cifra de un número de 5 cifras es igual a la segunda. Introduzca a continuación un número:");
        int N = sc.nextInt();
        
        boolean resultado = (N / 10000) == ((N % 10000) / 1000);
        System.out.println("¿La primera cifra es igual a la segunda? " + resultado);

        sc.close();
    }
}