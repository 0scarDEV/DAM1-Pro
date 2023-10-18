package apuntescondicionales;

import java.util.Scanner;

public class E029b {
    // 2.9. Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, que estará comprendido entre 0 y 99999.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Introduce a continuación un número: ");
        numero = sc.nextInt();

        if (numero >= -99999 && numero <= 99999) {
            if ((numero <= 0 && numero >= -9) || (numero >= 0 && numero <= 9)) {
                System.out.println("El número tiene 1 cifra.");
            } else if ((numero <= 10 && numero >= -99) || (numero >= 10 && numero <= 99)) {
                System.out.println("El número tiene 2 cifras.");
            } else if ((numero <= 100 && numero >= -999) || (numero >= 100 && numero <= 999)) {
                System.out.println("El número tiene 3 cifras.");
            } else if ((numero <= 1000 && numero >= -9999) || (numero >= 1000 && numero <= 9999)) {
                System.out.println("El número tiene 4 cifras.");
            } else {
                System.out.println("El número tiene 5 cifras.");
            }
        } else {
            System.out.println("El número no está en el rango deseado.");
        }
        sc.close();
    } 
}