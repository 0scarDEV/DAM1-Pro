package buclesparaninfo;

import java.util.Scanner;

public class EP0311 {
    /* Realiza un programa que convierta un número decimal en su representación binaria. Hay que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el usuario. Por simplicidad, iremos mostrando el número binario con un digito por línea. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nDecimal, nBinario;

        System.out.println("Introduzca a continuación un número decimal: ");
        nDecimal = sc.nextInt();
        sc.close();
        
        System.out.println("Aquí está su número en binario:");
        while (nDecimal > 0) {
            nBinario = nDecimal % 2;
            System.out.println(nBinario);
            nBinario = nDecimal;
        }
    }
}