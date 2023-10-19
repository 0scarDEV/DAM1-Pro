package apuntesbucles;

import java.util.Scanner;

public class E0311 {
    //E0311. Pedir un número y calcular su factorial. Por ejemplo el factorial de 5 se denota 5! y es igual a 5 x 4 x 3 x 2 x 1 = 120.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, fact;

        System.out.print("Introduzca un número, se mostrará el factorial: ");
        n = sc.nextInt();
        sc.close();

        fact = n;

        for (i = n - 1; i > 0; i--) {
            fact *= i;
        } 

        System.out.println(n + "! es igual a: " + fact);

        sc.close();
    }
}