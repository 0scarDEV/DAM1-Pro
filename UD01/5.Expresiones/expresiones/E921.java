package expresiones;

import java.util.Scanner;

public class E921 {
    public static void main(String[] args) {
        // Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene el valor 463 después de la operación contendrá el valor 466 ( 463 + 3 )
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación el valor de la variable entera N:");
        int N = sc.nextInt();
        int n2 = N + N % 10;
        System.out.println("Sumado el dígito más a la derecha de N al propio valor de N:" + n2);
        
        sc.close();
    }
}