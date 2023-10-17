package expresiones;

import java.util.Scanner;

public class E934 {
    public static void main(String[] args) {
        // Dadas dos variables A y B de tipo char, comprobar si las dos contienen una vocal minúscula.
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca a continuación una letra para considerar si contiene una vocal minúscula (A):");
        char A = sc.next().charAt(0);
        int valorASCIIA = (int) A;
        
        System.out.print("Introduzca a continuación una letra para considerar si contiene una vocal minúscula (B):");
        char B = sc.next().charAt(0);
        int valorASCIIB = (int) B;

        boolean resultadoA = valorASCIIA == 97 || valorASCIIA == 101 || valorASCIIA == 105 || valorASCIIA == 111 || valorASCIIA == 117;
        boolean resultadoB = valorASCIIB == 97 || valorASCIIB == 101 || valorASCIIB == 105 || valorASCIIB == 111 || valorASCIIB == 117;

        boolean resultado = resultadoA && resultadoB;

        System.out.println("¿Son los caracteres introducidos vocales minúsculas? " + resultado);

        sc.close();
    }
}
