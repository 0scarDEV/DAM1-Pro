package condicionalesejercicios;

import java.util.Scanner;

public class Login {
    /* ?scar Fern?ndez Pastoriza
     * Login. Realiza un programa que solicite por teclado un nombre de usuario y contrase?a, y que compruebe si corresponden al usuario ?admin? con contrase?a ?abc123.,? indicando como resultado un mensaje apropiado */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario;
        String contraseña;

        System.out.print("Introduzca a continuaci?n su usuario: ");
        usuario = sc.next();
        System.out.print("Introduzca a continuaci?n su contrase?a: ");
        contraseña = sc.next();

        if (usuario == "admin" && contraseña == "abc123.") {
            System.out.println("Login autorizado!");
        }

        sc.close();
    }
}