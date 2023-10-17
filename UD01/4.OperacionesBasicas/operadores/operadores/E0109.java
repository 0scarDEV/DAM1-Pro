package operadores;
import java.util.Scanner;

public class E0109 {
    public static void main(String[] args) {
        long numeroEntero;
        System.out.print("Introduce a continuación un número entero: ");
        Scanner sc = new Scanner(System.in);
        numeroEntero = sc.nextLong();
        
        boolean par = numeroEntero % 2 == 0;

        System.out.println("¿El número introducido (" + numeroEntero + ") es par? " + par);
        sc.close();
    }
}
