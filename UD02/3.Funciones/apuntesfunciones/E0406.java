package apuntesfunciones;

import java.util.Scanner;

public class E0406 {
    /* E0406. Diseñar una función con el siguiente prototipo:
                boolean esPrimo(int n)
    que devolverá true si n es primo y false en caso contrario. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Entrada de datos
        System.out.print("Introduzca a continuación un número, el programa le dirá si es o no primo. ");
        n = sc.nextInt();
        sc.close();

        // Salida
        System.out.println("¿El número introducido es primo? " + esPrimo(n));
    }

    static boolean esPrimo(int n) {
        // Comprobamos que n sea un número positivo y mayor a 1 (no es considerado como nº primo por convenio).
        if (n <= 1) {
            return false;
        }

        // Comprobamos si el número es divisible por algún número mayor que dos.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
