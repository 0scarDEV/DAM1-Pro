package expresiones;

import java.util.Scanner;

public class E918 {
    public static void main(String[] args) {
        // Modificar el valor de la variable entera N incrementándolo en 77. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 87.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación el valor de la variable entera N:");
        int N = sc.nextInt() + 77;
        System.out.println("El valor introducido más 77 es igual a: " + N);
        
        sc.close();
    }
}