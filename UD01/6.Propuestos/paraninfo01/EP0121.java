package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario.
 */
public class EP0121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa está diseñado para comparar dos números.");
        System.out.println("------------------------------------------------------");

        System.out.print("Introduce el primer número a comparar: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número a comparar: ");
        double num2 = sc.nextDouble();

        // Hacemos las operaciones.
        boolean comparacion = num1 == num2;

        // Mostramos el resultado al usuario.
        System.out.println("¿Ambos números introducidos son iguales? " + comparacion);

        sc.close();
    }
}
