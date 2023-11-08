package buclesparaninfo;

import java.util.Scanner;

public class EP0312 {
    /* Óscar Fernández Pastoriza
    * EP0312. Modifica el programa anterior (EP0311) para que el usuario pueda introducir un número en binario y el programa muestre su conversión a decimal. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca a continuación un número binario: ");
        String nBinario = sc.next();
        sc.close();

        int longitud = nBinario.length();
        int nDecimal = 0;
        int potencia = 1;

        for (int i = longitud - 1; i >= 0; i--) {
            char digito = nBinario.charAt(i); // Recorremos uno a uno los caracteres en la cadena de texto nBinario.    
            if (digito == '1') {
                nDecimal += potencia;
            } else if (digito != '0') {
                System.out.println("No es un número binario.");
                return;
            }
            potencia *= 2;
        }
        System.out.println("El número binario " + nBinario + " en decimal es: " + nDecimal);
    }
}