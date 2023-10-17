package paraninfo01;

import java.util.Scanner;

/*
    * Autor: Óscar Fernández Pastoriza
    * Descripción: Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y al total.
*/
public class EP0111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa realiza cálculos con el IVA.");
        System.out.println("--------------------------------------------------");
        System.out.print("Introduzca a continuación la base imponible: ");
        double base = sc.nextDouble();

        System.out.print("Introduzca a continuación el IVA que se debe aplicar: ");
        double iva = sc.nextDouble();

        double parteIVA = iva * base / 100;
        double total = parteIVA + base;

        System.out.println("--------------------------------------------------");
        System.out.println("Importe añadido por impuestos: " + parteIVA);
        System.out.println("Importe total: " + total);
        System.out.println("--------------------------------------------------");

        sc.close();
    }
}