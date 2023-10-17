package expresiones;

import java.util.Scanner;

public class E905 {
    public static void main(String[] args) {
        // La mitad de la última cifra de un número entero A
        Scanner sc = new Scanner(System.in);

        int A = 58;
        System.out.println("Introduzca a continuación un número entero de dos cifras:");
        A = sc.nextInt();

        int resultado = (A%10) / 2;
        System.out.println("El resultado de dividir la última cifra de A entre dos es: " + resultado);

        sc.close();
    }
}