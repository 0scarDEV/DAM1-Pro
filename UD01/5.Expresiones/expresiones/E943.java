package expresiones;

import java.util.Scanner;

public class E943 {
// Si el valor de una variable entera N es positivo, sumarle 5 sino sumarle 10.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa suma al número 5 si es positivo y si no, le suma 10.");
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        int resultado = num > 0 ? num + 5 : num + 10;

        System.out.println("Según el número entero introducido, después de hacer la operación el resultado es: " + resultado);

        sc.close();
    }
}
