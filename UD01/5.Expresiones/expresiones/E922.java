package expresiones;

import java.util.Scanner;

public class E922 {
    public static void main(String[] args) {
        // Comprobar si un número entero N de cuatro cifras es capicúa. Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca a continuación el valor de la variable N:");
        int N = sc.nextInt();

        // Sacamos la millares: 
        int mil = N / 1000;
        // Sacamos la centena:
        int centena = (N % 100) / 10;
        // Sacamos la decena:
        int decena = (N / 10) % 10; 
        // Sacamos la unidad:
        int unidad = N % 10 ;

        boolean capicua = (mil == unidad) && (centena == decena);
        
        System.out.println("¿El número de capicúa? " + capicua);
        sc.close();
    }
}
