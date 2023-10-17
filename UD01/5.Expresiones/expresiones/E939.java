package expresiones;

import java.util.Scanner;

public class E939 {
    public static void main(String[] args) {
        // Dado un número N de cuatro cifras, comprobar si alguna de las cifras es un 4.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación el valor de la variable N, debe ser un número de 4 cifras:");
        int N = sc.nextInt();

        // Sacamos la millares: 
        int mil = N / 1000;
        // Sacamos la centena:
        int centena = (N % 1000) / 100;
        // Sacamos la decena:
        int decena = (N / 10) % 10; 
        // Sacamos la unidad:
        int unidad = N % 10 ;

        boolean es4 = (mil == 4) || (centena == 4) || (decena == 4) || (unidad == 4);
        
        System.out.println("¿El número introducido tiene un 4? " + es4);
        sc.close();
    }
}
