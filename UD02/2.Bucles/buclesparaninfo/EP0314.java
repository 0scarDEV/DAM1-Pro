package buclesparaninfo;

import java.util.Scanner;

public class EP0314 {
    /* 
    (Por Óscar Fernández Pastoriza)
    EP0314. Realiza un programa que nos pida un número n, y nos diga cuántos números hay entre 1 y n que sean primos. Un número primo es aquel mayor que 1 y que solo es divisible por 1 y por él mismo. Veamos un ejemplo para n = 8.
    
    Comprobamos todos los números del 1 al 8:
    2 - primo
    3 - primo
    4 - no primo 
    5 - primo
    6 - no primo
    7 - primo
    8 - no primo
    
    Resultan un total de 5 números primos.
    */
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número: ");
        n = sc.nextInt();
        sc.close();

        for (int i = 2; i <= n; i++) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(i + " ");
            }
        }
    }
}
