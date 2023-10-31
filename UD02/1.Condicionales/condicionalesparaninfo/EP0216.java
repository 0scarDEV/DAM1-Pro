package condicionalesparaninfo;

import java.util.Scanner;

public class EP0216 {
    /*EP0216. Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        sc.close();

        int valorAbsoluto = (n >= 0 ? n : Math.abs(n));
        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);
    }
}