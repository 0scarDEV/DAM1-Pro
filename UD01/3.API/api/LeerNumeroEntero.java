package api;
import java.util.*;

public class LeerNumeroEntero {
    public static void main(String[] args) {
        int NumeroEntero;
        System.out.print("Introduce a continuación el número que quieres que se: ");
        Scanner sc = new Scanner(System.in);
        NumeroEntero = sc.nextInt();
        System.out.println("El número introducido por teclado es: " + NumeroEntero);
        sc.close();
    }
}
