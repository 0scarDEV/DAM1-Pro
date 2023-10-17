package expresiones;

import java.util.Scanner;

public class E941 {

// Dado un número entero N, modifícalo restando a N el valor de su última cifra. Por ejemplo, si N = 123, el valor final de N debe ser 120.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a continuación el valor de la variable N, debe ser un número entero: ");
        int N = sc.nextInt();

        // Sacamos la unidad:
        int unidad = N % 10;

        int valorFinal = N - unidad;
        System.out.println("Si al valor introducido (N) le restas la última cifra (" + unidad + ") el resultado es: " + valorFinal);

        sc.close();
    }
}