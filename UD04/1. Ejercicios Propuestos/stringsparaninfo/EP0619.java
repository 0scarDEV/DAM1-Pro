package stringsparaninfo;

import org.w3c.dom.css.DocumentCSS;

import java.util.Scanner;

/* Óscar Fernández PAstoriza
EP0619. Implementa un sencillo editor de texto que, una vez que se ha introducido el texto, permita reemplazar todas las ocurrencias de una palabra por otra.
 */
public class EP0619 {
    public static void main(String[] args) {
        System.out.println("Introduce un texto:");
        String texto = new Scanner(System.in).nextLine();

        System.out.println(texto);
        System.out.print("Escribe una palabra del texto que desees reemplazar: ");
        String ocurrencia = new Scanner(System.in).nextLine();

        System.out.println("Escibre la palabra por la que quieras reemplazar la palabra " + ocurrencia);
        String reemplazo = new Scanner(System.in).nextLine();

        String[] palabras = texto.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(ocurrencia)) {
                palabras[i] = reemplazo;
            }
        }

        for (int j = 0; j < palabras.length; j++) {
            System.out.print(palabras[j] + " ");
        }
    }
}