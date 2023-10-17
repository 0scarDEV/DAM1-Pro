package apuntes;

import java.util.Scanner;

public class E0210 {
    /*
     * E0210. Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
     */
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int nota;
        
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota (número entero) de 0 a 10: ");
        nota = sc.nextInt();        

        // Proceso y Salida

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: 
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
            break;
            case 7:
            case 8: 
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("La nota debe estar entre 0 y 10.");
        }

        /* Solución con ifs anidados
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Insuficiente");
        } else if (nota == 5) {
            System.out.println("Suficiente");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }*/
        
        System.out.println("Fin del programa");
        sc.close();
    }
}