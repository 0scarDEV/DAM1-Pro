package apuntesfunciones;

import java.util.Scanner;

public class E0407 {
    // E0407. Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Entrada de datos
        System.out.print("El programa le devolverá el número de divisores primos que tiene. Introduzca a continuación un número: ");
        n = sc.nextInt();
        sc.close();

        // Salida
        System.out.println("El número introducido (" + n + ") tiene " + divisoresPrimos(n) + " divisores primos");
    }
    static boolean esPrimo(int n) {
        // Comprobamos que n sea un número positivo y mayor a 1 (no es considerado como nº primo por convenio).
        if (n <= 1) {
            return false;
        }

        // Comprobamos si el número es divisible por algún número entre dos.
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int divisoresPrimos(int n) {
        int primos = 0;
        for (int i = 0; i <= n; i++) {
            if (esPrimo(i)) {
                primos++;
            }
        }
        return primos;
    }
}
