package expresiones;

import java.util.Scanner;

public class E906 {
    public static void main(String[] args) {
        // La suma de los dígitos de un número entero N de 3 cifras
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Introduzca a continuación un número entero de 3 cifras:");
        N = sc.nextInt();

        int digito1 = N % 10;
        int digito2 = (N / 10) % 10;
        int digito3 = (N / 100) % 10;
            
        int resultado = digito1 + digito2 + digito3;
        System.out.println("La suma de los tres dígitos de " + N + " es: " + resultado);

        sc.close();
    }
}
