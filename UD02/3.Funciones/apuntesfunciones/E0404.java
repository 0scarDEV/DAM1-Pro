package apuntesfunciones;

import java.util.Scanner;

public class E0404 {
    // E0404. Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        // Entrada de datos
        System.out.println("Escribe un número: ");
        n1 = sc.nextInt();
        System.out.println("Escribe otro número: ");
        n2 = sc.nextInt();
        sc.close();

        // Salida de datos (llamando a la función)
        System.out.println("El número mayor es: " + maximo(n1, n2));
    }
    
    static int maximo(int n1, int n2) {
        int nMayor;

        if (n1 >= n2) {
            nMayor = n1;
        } else {
            nMayor = n2;
        }

        return nMayor;
    }
}