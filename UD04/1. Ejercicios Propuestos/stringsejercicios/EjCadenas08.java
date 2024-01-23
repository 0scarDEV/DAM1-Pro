package stringsejercicios;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EjCadenas08. Crea una función que elimine todas las ocurrencias de una subcadena dada de una cadena de caracteres.
 */
public class EjCadenas08 {
    public static void main(String[] args) {
        System.out.println("Introduce un texto:");
        String texto = new Scanner(System.in).nextLine();

        System.out.println(texto);
        System.out.print("Escribe una palabra del texto que desees eliminar: ");
        String ocurrencia = new Scanner(System.in).nextLine();

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(ocurrencia)) {
                palabras[i] = "";
            }
        }

        for (int j = 0; j < palabras.length; j++) {
            System.out.print(palabras[j] + " ");
        }
    }
}