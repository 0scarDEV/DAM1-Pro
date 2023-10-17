package api;

import java.util.Locale;
import java.util.Scanner;

public class LeerTiposPrimitivos {
    public static void main(String[] args) {
        /* Declaramos las variables: */
        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        char varChar;
        boolean varBoolean;
        String varString;

        /* Creamos la variable sc (Scanner) para los datos de Tipo Primitivo */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Configuramos que el Scanner funcione con nomenclatura de USA (usando puntos "." en vez de comas ",").

        /* Solicitamos al usuario los datos: */
        // byte
        System.out.print("Introduce a continuación un dato de tipo byte: ");
        varByte = sc.nextByte();
        // short
        System.out.print("Introduce a continuación un dato de tipo short: ");
        varShort = sc.nextShort();
        // int
        System.out.print("Introduce a continuación un dato de tipo int: ");
        varInt = sc.nextInt();
        // long
        System.out.print("Introduce a continuación un dato de tipo long: ");
        varLong = sc.nextLong();
        // float
        System.out.print("Introduce a continuación un dato de tipo float: ");
        varFloat = sc.nextFloat();
        // double
        System.out.print("Introduce a continuación un dato de tipo double: ");
        varDouble = sc.nextDouble();
        // char
        System.out.print("Introduce a continuación un dato de tipo char: ");
        varChar = sc.next().charAt(0);
        // boolean
        System.out.print("Introduce a continuación un dato de tipo boolean: ");
        varBoolean = sc.nextBoolean();
        // String
        System.out.print("Introduce a continuación un dato de tipo String: ");
        Scanner scS = new Scanner(System.in); // Creamos la variable de lectura de un String
        varString = scS.nextLine();

        /* Mostramos los datos solicitados: */

        System.out.println("El dato de tipo byte introducido por teclado es: " + varByte);
        System.out.println("El dato de tipo short introducido por teclado es: " + varShort);
        System.out.println("El dato de tipo int introducido por teclado es: " + varInt);
        System.out.println("El dato de tipo long introducido por teclado es: " + varLong);
        System.out.println("El dato de tipo float introducido por teclado es: " + varFloat);
        System.out.println("El dato de tipo double introducido por teclado es: " + varDouble);
        System.out.println("El dato de tipo char introducido por teclado es: " + varChar);
        System.out.println("El dato de tipo boolean introducido por teclado es: " + varBoolean);
        System.out.println("El dato de tipo String introducido por teclado es: " + varString);

        /* Cerramos las variables "sc" (Scanner) y "scS" (ScannerString): */
        sc.close();
        scS.close();
    }
}