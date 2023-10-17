package expresiones;

import java.util.Scanner;

public class E916 {
    public static void main(String[] args) {
        // Comprobar si el contenido de la variable N termina en 0 ó en 7
        Scanner sc = new Scanner(System.in);

        double N = 57;
        System.out.println("Este programa comprueba si el número introducido termina en 0 ó 7. Introduzca a continuación un número:");
        N = sc.nextDouble();

        boolean resultado = ((N%10) == 0) || ((N%10) == 7);
        System.out.println("¿La última cifra del número N (" + N + ") es cero o siete? " + resultado);

        sc.close();
    }
}