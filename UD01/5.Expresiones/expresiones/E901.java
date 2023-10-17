package expresiones;

import java.util.Scanner;

public class E901 {
    public static void main(String[] args) {
        // El doble de un número N
        
        double N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca a continuación el número del que quiere calcular el doble:");
        N = sc.nextDouble();
        System.out.println("El doble del número N es: " + 2 * N);
        sc.close();
    }
}
