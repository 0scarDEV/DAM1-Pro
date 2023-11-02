package condicionalesejercicios;

import java.util.Scanner;

public class Login {
    /* Login. Realiza un programa que solicite por teclado un nombre de usuario y contraseña, y que compruebe si corresponden al usuario “admin” con contraseña “abc123.,” indicando como resultado un mensaje apropiado */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String contraseña;

        System.out.print("Introduzca a continuación su usuario: ");
        usuario = sc.next();
        System.out.print("Introduzca a continuación su contraseña: ");
        contraseña = sc.next();


        sc.close();
    }
}