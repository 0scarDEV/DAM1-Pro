package expresiones;

import java.util.Scanner;

public class E907 {
    public static void main(String[] args) {
        // La suma de la última cifra de los números enteros N y M
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Introduzca a continuación un número entero de 2 cifras:");
        N = sc.nextInt();

        int M;
        System.out.println("Introduzca a continuación un número entero de 2 cifras:");
        M = sc.nextInt();

        int resultado = (N % 10) + (M % 10);
        System.out.println("La suma de la última cifra de los números N(" + N + ") y M(" + M + ") es: " + resultado);

        sc.close();
    }
}