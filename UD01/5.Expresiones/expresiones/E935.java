package expresiones;

import java.util.Scanner;

public class E935 {
    public static void main(String[] args) {
        // Dada una variable A que contiene un año, determinar si ese año es bisiesto. Un año es bisiesto si es divisible por 4 y no por 100 ó si es divisible por 400.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Este programa verifica si un año es bisiesto. Introduce a continuación un año: ");
        int A = sc.nextInt();
        
        boolean condicion1 = (A % 4) == 0 && (A % 100) != 0;
        boolean condicion2 = A % 400 == 0;

        boolean bisiesto = condicion1 || condicion2;
        System.out.println("¿El año introducido (" + A + ") es bisisesto? " + bisiesto);
        sc.close();
    }
}
