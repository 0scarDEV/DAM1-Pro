package apuntesfunciones;

import java.util.Scanner;

public class E0410 {
    /*E0410. Diseñar una función que calcule an, donde a es real y n es entero no negativo. Realizar una versión iterativa y otra recursiva.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        int exponente;

        System.out.print("Escribe un número: ");
        base = sc.nextInt();
        System.out.print("Escribe otro número, el primer número será elevado a este: ");
        exponente = sc.nextInt();
        
        sc.close();

        System.out.println("Potencia iterativa: " + vIterativa(base, exponente));
        System.out.println("Potencia recursiva: " + vRecursiva(base, exponente));
    }

    static double vIterativa(double base, int exponente) {
        int i;
        double resultado = 1;
        for (i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    static double vRecursiva(double base, int exponente) {
        double resultado = 1;
        if (exponente == 0) {
            resultado = 1;
        } else {
            resultado = base * vRecursiva(base, exponente -1);
        }
        return resultado;
    }
}