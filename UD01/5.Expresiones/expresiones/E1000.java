package expresiones;

import java.util.Scanner;

public class E1000 {
/*  
    Escribe un programa que lea un carácter de teclado e imprima por pantalla si se trata de un número, de una letra mayúscula, de una letra minúscula o si no es nada de eso.    
    Utiliza el operador ternario para imprimir la salida.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca a continuación un caracter: ");
        char A = sc.next().charAt(0);
        int valorASCII = (int) A;
        
        boolean numero = valorASCII >= 48 && valorASCII <= 57;
        boolean mayúscula = valorASCII >= 65 && valorASCII <= 90;
        boolean minúscula = valorASCII >= 97 && valorASCII <= 122;

        String resultado = numero ? "Número"
                        : mayúscula ? "Letra mayúscula"
                        : minúscula ? "Letra minúscula"
                        : "No es un número ni una letra";

        System.out.println(resultado);

        sc.close();
    }
}
