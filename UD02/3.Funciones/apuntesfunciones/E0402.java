package apuntesfunciones;

import java.util.Scanner;

public class E0402 {
    // E0402. Escribir una función a la que se le pasan dos enteros y muestre todos los números comprendidos entre ellos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int nMayor, nMenor;

        // Entrada de datos
        System.out.println("Escribe un número: ");
        n1 = sc.nextInt();
        System.out.println("Escribe otro número: ");
        n2 = sc.nextInt();
        sc.close();

        if (n1 >= n2) {
            nMayor = n1;
            nMenor = n2;
        } else {
            nMayor = n2;
            nMenor = n1;
        }

        // Llamamos a la función nInternos, pasando como parámetro formal la variable número.
        nInternos(nMayor, nMenor);
    }

    static void nInternos(int nMayor, int nMenor) {
        System.out.println("Los números entre " + nMenor + " y " + nMayor + " son:");
        for (int i = nMenor+1; i < nMayor; i++) {
            System.out.print(i + " ");
        }
    }
}