package apuntesfunciones;

import java.util.Scanner;

public class E0409 {
    // E0409. Repetir la actividad 4.4 con una versión que calcule el máximo de tres números enteros.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        // Entrada de datos
        System.out.println("Escribe un número: ");
        n1 = sc.nextInt();
        System.out.println("Escribe otro número: ");
        n2 = sc.nextInt();
        System.out.println("Escribe otro número: ");
        n3 = sc.nextInt();
        sc.close();

        // Salida de datos (llamando a la función)
        System.out.println("El número mayor es: " + maximo(n1, n2, n3));
    }
    
    static int maximo(int n1, int n2, int n3) {
        int nMayor;

        if (n1 >= n2) {
            nMayor = n1;
        } else if (n2 >= n3) {
            nMayor = n2;
        } else {
            nMayor = n3;
        }

        return nMayor;
    }
}