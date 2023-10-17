package expresiones;

import java.util.Scanner;

public class E944 {
    // Si el valor de una variable entera N es negativo, asignarle el valor 5 sino asignarle el valor 100.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este programa asigna el valor 5 si el valor introducido es negativo. Si es positivo, asigna el valor 100.");
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        int resultado = num < 0 ? 5 : 100;

        System.out.println("Según el número entero introducido, después de hacer la operación el resultado es: " + resultado);

        sc.close();
    }
}
