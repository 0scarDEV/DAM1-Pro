package apuntescondicionales;
import java.util.Scanner;

public class E025 {
    // 2.5. Pedir dos números y mostrarlos ordenados de forma decreciente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String orden;

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        orden = (num1 > num2) ? (num1 + " " + num2) : (num2 + " " + num1);
        System.out.println(orden);

        sc.close();
    }
}