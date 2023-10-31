package condicionalesparaninfo;

import java.util.Scanner;

public class EP0218 {
    /*  EP0218. Modifica la actividad anterior (EP0217) para que, además de los dos números aleatorios, también aparezca aleatoriamente la operación que debe realizar el jugador: suma, resta o multiplicación. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;
        double operacion = Math.random() * 100;
        String signo = ((int)operacion <= 25 ? "sumar " : 
                        (int) operacion <= 50 ? "restar " :
                        (int) operacion <= 75 ? "multiplicar ":
                        (int) operacion < 100 ? "dividir " : " ");
        int resultadoOperacion = signo == "sumar " ? (int)num1 + (int)num2 :
                                signo == "restar " ? (int)num1 + (int)num2 :
                                signo == "multiplicar " ? (int)num1 + (int)num2 :
                                signo == "dividir " ? (int)num1 + (int)num2 : 0;
        int valorIntroducido;

        System.out.println("Los números son " + (int)num1 + " y " + (int)num2);
        System.out.println("¿Cual es el resultado de " + signo + (int)num1 + " y " + (int)num2);
        valorIntroducido = sc.nextInt();
        sc.close();

        if (valorIntroducido == resultadoOperacion) {
            System.out.println("Enhorabuena, ¡es correcto!");
        } else {
            System.out.println("Esta vez no has tenido suerte, el resultado es incorrecto.");
        }
    }
}