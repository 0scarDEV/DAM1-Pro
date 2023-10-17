package operadores;

import java.util.Scanner;

public class E0112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroEntero;

        System.out.print("Introduce a continuación un número entero: ");
        numeroEntero = sc.nextLong();

        long numeroAbsoluto = Math.abs(numeroEntero);

        System.out.println("El número absoluto de " + numeroEntero + " es " + numeroAbsoluto);
        sc.close();
    }
}
