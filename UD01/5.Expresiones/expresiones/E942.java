package expresiones;

import java.util.Scanner;

public class E942 {

// Dados dos números enteros N y M, modifica M restándole la última cifra de N. Por ejemplo si M = 123 y N = 47, el valor final de M debe ser 116.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a continuación el valor de la variable N, debe ser un número entero: ");
        int N = sc.nextInt();

        // Sacamos la unidad:
        int unidad = N % 10;

        System.out.print("Introduzca a continuación el valor de la variable M, debe ser un número entero: ");
        int M = sc.nextInt();

        // Hacemos la resta
        int valorFinal = M - unidad;
        System.out.println("Si al segundo valor introducido (M) le restas la última cifra (" + unidad + ") del primer valor introducido (N) el resultado es: " + valorFinal);

        sc.close();
    }
}