package operadoress;

import java.util.Scanner;

public class E0114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double numeroDecimal;
        System.out.println("Introduce a continuación un número entero:");
        numeroDecimal = sc.nextDouble();

        double notaEntera = Math.round(numeroDecimal);

        System.out.println("El número introducido se redondea al " + notaEntera);
        sc.close();
    }
}
