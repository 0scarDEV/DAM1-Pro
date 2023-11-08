package condicionalesparaninfo;

import java.util.Scanner;

public class EP0214 {
    /* Óscar Fernández Pastoriza
     * EP0214. Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. El programa debe mostrario con letras, por ejemplo, para 56, se verá: “cincuenta y seis”.  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String texto = " ", textoU = " ", textoD = " ";
        System.out.print("Escribe un número: ");
        n = sc.nextInt();
        sc.close();
        if (n <= 15 && n >= 0) {
            switch (n) {
                case 0 -> {texto = "cero";}
                case 1 -> {texto = "uno";}
                case 2 -> {texto = "dos";}
                case 3 -> {texto = "tres";}
                case 4 -> {texto = "cuatro";}
                case 5 -> {texto = "cinco";}
                case 6 -> {texto = "seis";}
                case 7 -> {texto = "siete";}
                case 8 -> {texto = "ocho";}
                case 9 -> {texto = "nueve";}
                case 10 -> {texto = "diez";}
                case 11 -> {texto = "once";}
                case 12 -> {texto = "doce";}
                case 13 -> {texto = "trece";}
                case 14 -> {texto = "catorce";}
                case 15 -> {texto = "quince";}
            }
            System.out.println(texto);
        } else if (n == 20 || n == 30 || n == 40 || n == 50 || n == 60 || n == 70 || n == 80 || n == 90) {
            switch (n) {
                case 20 -> {texto = "veinte";}
                case 30 -> {texto = "treinta";}
                case 40 -> {texto = "cuarenta";}
                case 50 -> {texto = "cincuenta";}
                case 60 -> {texto = "sesenta";}
                case 70 -> {texto = "setenta";}
                case 80 -> {texto = "ochenta";}
                case 90 -> {texto = "noventa";}
            }
            System.out.println(texto);
        } else if (n >= 0 && n <= 99) {
            switch (n%10) {
                case 1 -> {textoU = "uno";}
                case 2 -> {textoU = "dos";}
                case 3 -> {textoU = "tres";}
                case 4 -> {textoU = "cuatro";}
                case 5 -> {textoU = "cinco";}
                case 6 -> {textoU = "seis";}
                case 7 -> {textoU = "siete";}
                case 8 -> {textoU = "ocho";}
                case 9 -> {textoU = "nueve";}
            }
            switch (n / 10) {
                case 1 -> {textoD = "dieci";}
                case 2 -> {textoD = "veinti";}
                case 3 -> {textoD = "treinta y ";}
                case 4 -> {textoD = "cuarenta y ";}
                case 5 -> {textoD = "cincuenta y ";}
                case 6 -> {textoD = "sesenta y ";}
                case 7 -> {textoD = "setenta y ";}
                case 8 -> {textoD = "ochenta y ";}
                case 9 -> {textoD = "noventa y ";}
            }
        } else {
            System.out.println("El número está fuera del rango.");
        }
        System.out.println(textoD + textoU);
    }
}