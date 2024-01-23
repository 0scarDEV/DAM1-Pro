package stringsparaninfo;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EP0620. Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética. Suponemos que cada palabra de la frase se separa de otra por un único espacio. */
public class EP0620 {
    public static void main(String[] args) {
        System.out.println("Introduce a continuación una frase, el programa te mostrará las palabras ordenadas de forma alfabética.");
        String frase = new Scanner(System.in).nextLine();

        frase = frase.toLowerCase();
        String[] palabras = frase.split(" ");

        Arrays.sort(palabras);

        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i] + " ");
        }
    }
}