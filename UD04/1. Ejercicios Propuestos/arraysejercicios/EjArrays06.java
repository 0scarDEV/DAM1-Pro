package arraysejercicios;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * EjArrays06. Leer 10 enteros y mostrar la media de los valores negativos y la de los positivos. */
public class EjArrays06 {
    public static void main(String[] args) {
        int[] t = new int[10];
        int sumandoPos = 0, sumandoNeg = 0, contPos = 0, contNeg = 0;

        System.out.println("Introduzca 10 números enteros para calcular la media de los positivos y de los negativos:");
        for (int i = 0; i < t.length; i++) {
            t[i] = new Scanner(System.in).nextInt();
            if (t[i] >= 0) {
                sumandoPos += t[i];
                contPos++;
            } else {
                sumandoNeg += t[i];
                contNeg++;
            }
        }

        int mediaPos = sumandoPos / contPos;
        int mediaNeg = sumandoNeg / contNeg;

        System.out.println("La media de los números positivos es: " + mediaPos);
        System.out.println("La media de los números negativos es: " + mediaNeg);
    }
}