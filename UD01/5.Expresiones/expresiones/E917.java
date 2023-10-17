package expresiones;

import java.util.Scanner;

public class E917 {
    public static void main(String[] args) {
        // Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
        Scanner sc = new Scanner(System.in);

        double precio = 9;
        System.out.println("Este programa comprueba si el precio es igual o mayor que 10€ y menor que 50€. Introduzca a continuación un precio:");
        precio = sc.nextDouble();

        boolean cierto = precio >= 10 && precio < 50;
        System.out.println("¿La variable precio es igual o mayor que 10 y menor que 50? " + cierto);

        sc.close();
    }
}
