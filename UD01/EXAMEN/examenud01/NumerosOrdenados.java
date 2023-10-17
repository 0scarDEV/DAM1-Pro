package examenud01;
import java.util.Scanner;
/**
 * Autor: Óscar Fernández Pastoriza
 */
public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // A continuación declaramos variables:
        double num1;
        double num2;
        double num3;
        boolean mayorAmenor;
        boolean menorAmayor;
        boolean iguales;

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa indica si tres números se encuentran o no ordenados.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextDouble();
        
        // Hacemos las operaciones.

        menorAmayor = (num3 > num2 && num2 > num1) || (num3 >= num2 && num2 > num1) || (num3 > num2 && num2 >= num1);
        mayorAmenor = (num3 < num2 && num2 < num1) || (num3 <= num2 && num2 < num1) || (num3 < num2 && num2 <= num1);
        iguales = num1 == num2 && num2 == num3;

        // Hacemos uso del valor ternario y mostramos resultado.
        System.out.println(""); // Dejamos una línea de terminal vacía, para embellecer
        String ordenados = mayorAmenor ? "Ordenados de mayor a menor"
                : menorAmayor ? "Ordenados de menor a mayor"
                : iguales ? "Ordenados de menor a mayor\nOrdenados de mayor a menor" : "Numeros desordenados";

        System.out.println(ordenados);
        sc.close();
    }
}
