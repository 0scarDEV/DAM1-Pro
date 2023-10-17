package expresiones;

import java.util.Scanner;

public class E903 {
    public static void main(String[] args) {
        // Seis veces la diferencia de dos números enteros A y B
        Scanner sc = new Scanner(System.in);

        int A;    
        System.out.println("Introduzca a continuación el valor de la variable A:");
        A = sc.nextInt();
        System.out.println("El valor de A es: " + A);
        
        int B;
        System.out.println("Introduzca a continuación el valor de la variable B:");
        B = sc.nextInt();
        System.out.println("El valor de B es: " + B);

        int resultado = (A - B) * 6;
        System.out.println("Seis veces la diferencia de A menos B es: " + resultado);

        sc.close();
    }
}
