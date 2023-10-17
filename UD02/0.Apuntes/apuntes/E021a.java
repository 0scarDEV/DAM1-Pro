package apuntes;
import java.util.Scanner;
public class E021a {
    // 2.1. Diseña una aplicación que solicite un número al usuario e indique si es par o impar.

    // VERSIÓN CON CONDICIONAL SIMPLE (IF)
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int numero;
        boolean par;
        
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        numero = sc.nextInt();
        
        // Proceso
        par = numero % 2 == 0;
       
        // Salida
        if (par) {
            System.out.println("El número " + numero + " es par.");
        }
        
        if (!par) {
            System.out.println("El número " + numero + " es impar.");
        }       
        
        System.out.println("Fin del programa");
        sc.close();
    }
}