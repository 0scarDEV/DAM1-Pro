package condicionalesparaninfo;

import java.util.Scanner;

public class EP0217 {
    /* Óscar Fernández Pastoriza
     * EP0217. Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;
        int suma = (int)num1 + (int)num2;
        int valorIntroducido;

        System.out.println("Los números son " + (int)num1 + " y " + (int)num2);
        System.out.println("¿Cual es el resultado de su suma?");
        valorIntroducido = sc.nextInt();
        sc.close();

        if (valorIntroducido == suma) {
            System.out.println("Enhorabuena, ¡es correcto!");
        } else {
            System.out.println("Esta vez no has tenido suerte, el resultado es incorrecto.");
        }
    }
}