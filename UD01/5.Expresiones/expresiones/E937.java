package expresiones;

import java.util.Scanner;

public class E937 {
    public static void main(String[] args) {
        // Dado un número N de dos cifras, comprobar si la suma de sus cifras es un número par.
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a continuación el valor de la variable N, debe ser un número de 2 cifras: ");
        int N = sc.nextInt();

        // Sacamos la decena:
        int decena = (N / 10) % 10;
        // Sacamos la unidad:
        int unidad = N % 10;

        boolean sumaPar = (decena + unidad) % 2 == 0;
        
        System.out.println("¿Es la suma de los dígitos introducidos par? " + sumaPar);
        sc.close();
    }
}
