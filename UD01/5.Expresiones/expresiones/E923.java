package expresiones;

import java.util.Scanner;

public class E923 {
    public static void main(String[] args) {
        // Una variable entera M contiene un número de mes codificado de 1 (enero) a 12 (diciembre). Comprobar si corresponde a un mes de 30 días. 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación el número de mes que quiera comprobar que tiene 30 días:");
        int N = sc.nextInt();
        boolean treintaDias = 4 == N || 6 == N || 9 == N || 11 == N;
        System.out.println("¿El mes introducido tiene 30 días? " + treintaDias);
        
        sc.close();
    }
}
