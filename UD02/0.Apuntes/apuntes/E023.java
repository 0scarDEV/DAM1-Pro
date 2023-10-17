package apuntes;
import java.util.Scanner;

public class E023 {
    // 2.3. Solicitar dos números distintos y mostrar cuál es el mayor.
    
    // ESTRUCTURA CONDICIONAL ANIDADA (IF {IF})
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int num1, num2;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        num1 = sc.nextInt();
        System.out.println("Introduce otro número entero distintos:");
        num2 = sc.nextInt();
        
            // Proceso y Salida
        if (num1 == num2) {
            System.out.println("Son iguales, te pedí números enteros distintos....");
        } else {
            // Imprime el mayor  
            if (num1 > num2) {
                System.out.println(num1 + " es el mayor.");
            } else {
                System.out.println(num2 + " es el mayor.");
            }            
        }
        System.out.println("Fin del programa");
        sc.close();
    }
}