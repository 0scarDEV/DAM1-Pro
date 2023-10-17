package expresiones;

import java.util.Scanner;

public class E914 {
    public static void main(String[] args) {
        // Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación una letra para considerar si NO es una mayúscula:");
        char A = sc.next().charAt(0);
        int valorASCII = (int) A;
        
        boolean resultado = valorASCII <= 65 || valorASCII >= 90;
        System.out.println("¿Es el caracter introducido una NO mayúscula? " + resultado);

        sc.close();
    }
}
