package ejerciciosapuntes;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
E0609. Introducir por teclado una frase, palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco. Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena “fin” escrita con cualquier combinación de mayúsculas y minúsculas. La cadena “fin” no aparecerá en la frase final.
 */
public class E0609 {
    public static void main(String[] args) {
        String palabra = "", frase = "";
        System.out.println("Introduzca las palabras");
        while (!palabra.equalsIgnoreCase("FIN")) {
            frase = frase.concat(palabra + " ");
            palabra = new Scanner(System.in).nextLine();
            }
        System.out.println("La frase es:" + frase);
    }
}
