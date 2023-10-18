package apuntescondicionales;
import java.util.Scanner;

public class E027 {
    // 2.7. Pedir tres números y mostrarlos ordenados de mayor a menor.
        public static void main(String[] args) {
        // Declaración de variables y constantes
        int a, b, c;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        a = sc.nextInt();
        System.out.println("Introduce otro número:");
        b = sc.nextInt();
        System.out.println("Introduce otro número:");
        c = sc.nextInt();
        
        // Proceso y Salida
        if (a > b && a > c) {
            if (b > c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else {
            if (a > b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
        sc.close();
    }
}