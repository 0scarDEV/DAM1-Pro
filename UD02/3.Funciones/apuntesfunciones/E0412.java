package apuntesfunciones;

import java.util.Scanner;

public class E0412 {
    /*
     * E0412. Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie, es decir:
     *
     *      fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
     *      fibonacci(1) = 1
     *      fibonacci(0) = 0
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Escribe un número: ");
        n = sc.nextInt();
        sc.close();
        System.out.println("El enésimo valor del número introducido es: " + fibonacci(n));
    }

    static int fibonacci(int n) {
        if (n == 1){
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            n = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return n;
    }
}