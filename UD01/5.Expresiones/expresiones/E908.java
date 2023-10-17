package expresiones;

import java.util.Scanner;

public class E908 {
    public static void main(String[] args) {
        // Comprobar si un número entero N es múltiplo de 2 y de 3
        Scanner sc = new Scanner(System.in);

        double numero;
        System.out.println("Este programa comprueba si un número entero es múltiplo de 2y3. Introduzca a continuación un número:");
        numero = sc.nextInt();

        boolean resultado = numero % 2 == 0 && numero % 3 == 0;
        System.out.println("¿El número N (" + numero + ") es múltiplo de 2 y de tres? " + resultado);

        sc.close();
    }
}
