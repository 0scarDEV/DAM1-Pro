package operadoress;

import java.util.Scanner;

public class E0103 {
    public static void main(String[] args) {
        int edadUsuario;
        System.out.print("Introduce a continuación tu edad: ");
        Scanner sc = new Scanner(System.in);
        edadUsuario = sc.nextInt();
        edadUsuario ++;
        System.out.println("El año que viene tendrás: " + edadUsuario + " años.");
        sc.close();
    }
}
