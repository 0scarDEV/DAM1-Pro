package parejas;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Driver: Óscar Fernández
 * Copiloto: Marcos Costoya
 */

public class UnidadesMedida {
    public static void main(String[] args) {
        final double FUTBOL = 105 * 70;
        final double BALONCESTO = 28 * 15;
        final double TENIS = 23.77 * 10.97;
        final double RETIRO = (100 * 100) * 125;
        final double CASTINEIRAS = 1.09;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0###");

        double numeroIntroducido;
        System.out.print("Introduce la cantidad de hectáreas: ");
        numeroIntroducido = sc.nextDouble();

        System.out.println("La cantidad de hectáreas introducida es equiparable a " + df.format((numeroIntroducido * 10000) / FUTBOL) + " campos de futbol.");
        System.out.println("La cantidad de hectáreas introducida es equiparable a " + df.format((numeroIntroducido * 10000) / BALONCESTO) + " campos de baloncesto.");
        System.out.println("La cantidad de hectáreas introducida es equiparable a " + df.format((numeroIntroducido * 10000) / TENIS) + " campos de tenis.");
        System.out.println("La cantidad de hectáreas introducida es equiparable a " + df.format((numeroIntroducido * 10000) / RETIRO) + " superficies de El Retiro.");
        System.out.println("La cantidad de hectáreas introducida es equiparable a " + df.format(numeroIntroducido / CASTINEIRAS) + " superficies del Lago Castiñeiras.");

        sc.close();
    }
}