package apuntesfunciones;

import java.util.Scanner;

public class E0401 {
    // E0401. Diseñar la función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje “Eco…”.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Entrada de datos
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();
        sc.close();

        // Llamamos a la función eco, pasando como parámetro formal la variable número.
        eco(numero);
    }

    static void eco(int numero) {
        int i;
        // Bucle y salida   
        for (i = 1; i <= numero; i++) {
            System.out.println(i + " Eco...");
        }
    }
}