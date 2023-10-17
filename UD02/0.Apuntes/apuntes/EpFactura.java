package apuntes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EpFactura {
    //  Escribe un programa para emitir la factura de compra de un producto, introduciendo el precio del producto y el número de unidades compradas. La factura deberá añadir al total un IVA (Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100 euros se aplicará un descuento del 5%.
    public static void main(String[] args) {
        double precio, importeConIVA, descuentoAl5, importeSinIVA;
        int unidades;
        final double IVA = 0.21, DESCUENTO = 0.05, UMBRAL_DESCUENTO = 100;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Introduzca a continuación el precio del producto adquirido: ");
        precio = sc.nextDouble();
        System.out.print("Introduzca a continuación el número de unidades adquiridas: ");
        unidades = sc.nextInt();

        importeSinIVA = precio * unidades;
        importeConIVA = importeSinIVA + (importeSinIVA * IVA);

        if (importeConIVA > UMBRAL_DESCUENTO) {
            System.out.println("El importe total asciende a " + df.format(importeConIVA) + " euros.");
            descuentoAl5 = importeConIVA - (importeConIVA * DESCUENTO);
            System.out.println("Tras aplicar un descuento deberás pagar " + df.format(descuentoAl5) + " euros.");
        } else {
            System.out.println("El importe total asciende a " + df.format(importeConIVA) + " euros.");
        }
        
        sc.close();
    }
}