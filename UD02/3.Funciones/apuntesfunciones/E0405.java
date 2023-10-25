package apuntesfunciones;

import java.util.Scanner;

public class E0405 {
    // E0405. Crear una función que, mediante un booleano, indique si el carácter que se le pasa como parámetro de entrada corresponde a una vocal.
    public static void main(String[] args) {
        // Variables
        char caracter;
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduzca a continuación una letra para considerar si es una vocal: ");
        caracter = sc.next().charAt(0);

        sc.close();

        // Salida de datos, llamando a la función.
        System.out.println("¿El carácter pasado por parámetro de entrada es una vocal? " + vocal(caracter));
    }

    static boolean vocal(char caracter) {
        boolean esVocal;
        esVocal = caracter == 65 || caracter == 69 || caracter == 73 || caracter == 79 || caracter == 85 || caracter == 97 || caracter == 101 || caracter == 105 || caracter == 111 || caracter == 117;
        return esVocal;
    }
}