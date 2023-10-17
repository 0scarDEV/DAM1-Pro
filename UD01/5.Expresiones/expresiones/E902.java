package expresiones;

import java.util.Scanner;

public class E902 {
    public static void main(String[] args) {
        // El triple de un número N

        double N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca a continuación el número del que quiere calcular el triple:");
        N = sc.nextDouble();
        System.out.println("El triple del número introducido es: " + 3 * N);
        sc.close();
    }
}
