package expresiones;

import java.util.Scanner;

public class E904 {
    public static void main(String[] args) {
        // La diferencia entre el producto de A por B y la suma de C más D
        Scanner sc = new Scanner(System.in);

        int A;
        System.out.println("Introduzca a continuación el valor de la variable A:");
        A = sc.nextInt();

        int B;
        System.out.println("Introduzca a continuación el valor de la variable B:");
        B = sc.nextInt();

        int C;
        System.out.println("Introduzca a continuación el valor de la variable C:");
        C = sc.nextInt();
        
        int D;
        System.out.println("Introduzca a continuación el valor de la variable D:");
        D = sc.nextInt();

        int resultado = A * B - (C + D);
        System.out.println("El resultado de la diferencia de A por B y C menos D es: " + resultado);

        sc.close();
    }
}