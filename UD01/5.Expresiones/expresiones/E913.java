package expresiones;

import java.util.Scanner;

public class E913 {
    public static void main(String[] args) {
        // Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación una letra para considerar si es mayúscula o minúscula:");
        char A = sc.next().charAt(0);
        int valorASCII = (int) A;
        
        boolean resultado = valorASCII >= 65 && valorASCII <= 90 || valorASCII >= 97 && valorASCII <= 122;
        System.out.println("¿Es el caracter introducido una mayúscula o una minúscula? " + resultado);

        sc.close();
    }
}
