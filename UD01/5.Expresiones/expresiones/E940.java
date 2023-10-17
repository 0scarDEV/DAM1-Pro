package expresiones;

import java.util.Scanner;

public class E940 {
// Dado un número N de 4 cifras, asigna a una variable X las dos primeras cifras del número.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación el valor de la variable N, debe ser un número de 4 cifras:");
        int N = sc.nextInt();

        System.out.println("El número N introducido es: " + N);

        // Sacamos las dos primeras cifras:
        int X = N / 100;

        System.out.println("Las dos primeras cifras son: " + X);

        sc.close();
    }
}