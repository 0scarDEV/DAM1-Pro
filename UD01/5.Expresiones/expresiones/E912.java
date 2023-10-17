package expresiones;

import java.util.Scanner;

public class E912 {
    public static void main(String[] args) {
        // Comprobar si una variable A de tipo carácter contiene una letra mayúscula
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación una letra para considerar si es mayúscula o minúscula:");
        char A = sc.next().charAt(0);
        int valorASCII = (int) A;
        
        boolean resultado = valorASCII >= 65 && valorASCII <= 90;
        System.out.println("¿Es el caracter introducido una mayúscula? " + resultado);

        sc.close();
    }
}
