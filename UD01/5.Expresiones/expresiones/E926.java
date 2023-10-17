package expresiones;

import java.util.Scanner;

public class E926 {
    public static void main(String[] args) {
        // Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca a continuación una carácter para comprobar si es un dígito:");
        char C = sc.next().charAt(0);
        int valorASCII = (int) C;
        boolean resultado = valorASCII >= 48 && valorASCII <= 57;
        System.out.println("¿Es el caracter introducido un dígito? " + resultado);
        
        sc.close();
    }
}
