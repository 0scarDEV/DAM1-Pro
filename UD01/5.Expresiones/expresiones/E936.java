package expresiones;

import java.util.Scanner;

public class E936 {
    public static void main(String[] args) {
        // Dado un número N de dos cifras, comprobar si las dos cifras son iguales.
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a continuación el valor de la variable N, debe ser un número de 2 cifras: ");
        int N = sc.nextInt();

        // Sacamos la decena:
        int decena = (N / 10) % 10;
        // Sacamos la unidad:
        int unidad = N % 10;

        boolean iguales = (unidad == decena);
        
        System.out.println("¿Son los dos dígitos del número introducido iguales? " + iguales);
        sc.close();
    }
}
