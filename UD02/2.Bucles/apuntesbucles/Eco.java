package apuntesbucles;
import java.util.Scanner;

public class Eco {
    // Eco. Implementa una aplicación que pida al usuario un número e imprima por pantalla el texto “Eco…” tantas veces como indique el número introducido.
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int numero;
        int i; // contador

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        numero = sc.nextInt();
        sc.close();
        // Salida   
        System.out.println("FOR");
        for (i = 1; i <= numero; i++) {
            // Cuerpo del bucle
            System.out.println(i + " Eco...");
        }

        System.out.println("WHILE");
        // While
        i = 1;
        while (i <= numero) {
            System.out.println(i + " Eco...");
            i++;
        }

        System.out.println("DO_WHILE");
        i = 1;
        do {
            System.out.println(i + " Eco...");
            i++;
        } while (i <= numero);
    }
}