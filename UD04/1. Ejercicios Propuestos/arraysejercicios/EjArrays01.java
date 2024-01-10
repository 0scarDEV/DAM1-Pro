package arraysejercicios;

import java.util.Arrays;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * EjArrays01. Calcular la media de una serie de números que se leen por teclado.
 */
public class EjArrays01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, sumatorio = 0, i = 0;
        int[] t1 = new int[0];
        do {
            i++;
            t1 = Arrays.copyOf(t1, t1.length + 1);
            sumatorio += entrada;
            entrada = sc.nextInt();
            t1[i - 1] = entrada;
        } while(entrada != -1);

        int media = sumatorio / (t1.length - 1);

        System.out.println(media);

        sc.close();
    }
}