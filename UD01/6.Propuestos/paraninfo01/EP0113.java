package paraninfo01;

import java.util.Scanner;

/*
 * Autor: Óscar Fernández Pastoriza.
 * Descripción: Modifica la Actividad de Aplicación EP0112 para que, indicando dos números n y m, diga que cantidad hay que sumarle a n para que sea múltiplo de m.
 */
public class EP0113 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                
        // Entrada de datos
        System.out.print("Introduce un número entero (N): ");
        int N = sc.nextInt();

        System.out.print("Introduce un número entero (M): ");
        int M = sc.nextInt();

        // Proceso
        int resultado = N % M == 0 ? 0 : M - N % M;
        
        // Salida
        System.out.println("El número que hay que sumar para N (" + N + ") que sea múltiplo de " + M + " es: " + resultado);
    
        sc.close();
    }
}
