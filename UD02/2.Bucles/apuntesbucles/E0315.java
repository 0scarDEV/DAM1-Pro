package apuntesbucles;

import java.util.Scanner;

public class E0315 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int numero;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();
        sc.close();
        
        // Proceso & Salida
        for (int i = numero; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        } 
    }
}