package expresiones;

import java.util.Scanner;

public class E920 {
    public static void main(String[] args) {
        // Modificar el valor de la variable entera N duplicando su valor. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 20.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación el valor de la variable entera N:");
        int N = sc.nextInt() * 2;
        System.out.println("El doble del valor introducido es: " + N);
        
        sc.close();
    }
}