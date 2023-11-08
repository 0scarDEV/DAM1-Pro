package buclesparaninfo;

import java.util.Scanner;

public class EP0316 {
    /* EP0316. Solicita al usuario un número n y dibuja un triángulo de base y altura n, de la forma (para n igual a 4):
            *   
            * *
            * * *
            * * * *
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Introduzca a continuación un número: ");
        n = sc.nextInt();

        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");    
        }
    }
}