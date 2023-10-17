package apuntes;
import java.util.Scanner;

public class EpBisiesto {
    // Haz un programa que pida por teclado un número de año y que muestre un mensaje indicando si el año es bisiesto o no.
    // Investiga el agoritmo para calcular si un año es bisiesto o no.
        public static void main(String[] args) {
        // Declaración de variables y constantes
        int anho;
        boolean bisiesto;
        
        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        anho = sc.nextInt();

        // Proceso
        bisiesto = ((anho % 100 != 0) || (anho % 400 == 0)) && (anho % 4 == 0);
       
        // Salida
        if (bisiesto) {
            System.out.println("El año " + anho + " es bisiesto.");
        } else {
            System.out.println("El año " + anho + " NO es bisiesto.");
        }
        sc.close();
    }
}