package expresiones;

import java.util.Scanner;

public class E919 {
    public static void main(String[] args) {
        // Modificar el valor de la variable entera N disminuyéndolo en 3. Por ejemplo, si N contiene el valor 10, después de la operación contendrá el valor 7.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación el valor de la variable entera N:");
        int N = sc.nextInt() - 3;
        System.out.println("El valor introducido menos 3 es igual a: " + N);
        
        sc.close();
    }
}