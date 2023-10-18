package apuntesbucles;

import java.util.Scanner;

public class E0306 {
    // E0306. Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos los números del 1 al n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i==n ;i++) {
            System.out.println(i);
        }
    }
}
