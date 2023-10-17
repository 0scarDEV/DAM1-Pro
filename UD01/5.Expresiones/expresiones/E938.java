package expresiones;

import java.util.Scanner;

public class E938 {
    public static void main(String[] args) {
        // Dado un número N de tres cifras, comprobar si la cifra del centro es la mayor.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca a continuación el valor de la variable N, debe ser un número de 3 cifras: ");
        int N = sc.nextInt();

        // Sacamos la centena:
        int centena = N / 100;
        // Sacamos la decena:
        int decena = (N / 10) % 10;
        // Sacamos la unidad:
        int unidad = N % 10;

        boolean decenaMayor = (decena > centena) && (decena > unidad);
        
        System.out.println("¿Es la cifra del centro del número introducido (" + decena + ") la mayor? " + decenaMayor);
        sc.close();
    }
}
