package expresiones;

import java.util.Scanner;

public class E932 {
    public static void main(String[] args) {
        // Comprobar si una variable C de tipo char contiene una vocal mayúscula.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación una letra para considerar si es o no una vocal mayúscula:");
        char C = sc.next().charAt(0);
        int valorASCII = (int) C;
        
        boolean resultado = valorASCII == 65 || valorASCII == 69 || valorASCII == 73 || valorASCII == 79 || valorASCII == 85;
        System.out.println("¿Es el caracter introducido una vocal mayúscula? " + resultado);

        sc.close();
    }
}
