package coleccionesejercicios.EP1219;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* �scar Fern�ndez Pastoriza */
public class AppFrase {
    /* EP1219. Escribe un programa donde se introduzca por consola una frase que conste exclusivamente de palabras separadas por espacios. Las palabras de la frase se almacenar�n en una lista. Finalmente, se mostrar�n por pantalla las palabras que est�n repetidas y, a continuaci�n, las que no lo est�n. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();

        char[] letras = frase.toCharArray();
        List<String> palabras = separadorPalabras(letras);

        System.out.println("\nPalabras repetidas");
        mostrarRepetidos(palabras);
        System.out.println("\nPalabras no repetidas");
        mostrarNoRepetidos(palabras);
    }
    private static List<String> separadorPalabras(char[] letras) {
        List<String> palabras = new ArrayList<String>();
        String palabra = "";

        for (char letra : letras) {
            if (letra != ' ') {
                palabra += letra;
            } else {
                palabras.add(palabra);
                palabra = "";
            }
        }
        palabras.add(palabra);
        return palabras;
    }
    private static void mostrarRepetidos(List<String> palabras) {
        for (int i = 0; i < palabras.size(); i++) {
            for (int j = 0; j < palabras.size(); j++) {
                if (i != j) {
                    if (palabras.get(i).equals(palabras.get(j))) {
                        System.out.print(palabras.get(i) + " ");
                    }
                }
            }
        }
    }
    private static void mostrarNoRepetidos(List<String> palabras) {
        for (int i = 0; i < palabras.size(); i++) {
            for (int j = 0; j < palabras.size(); j++) {
                if (i != j) {
                    if (!palabras.get(i).equals(palabras.get(j))) {
                        System.out.print(palabras.get(i) + " ");
                    }
                }
            }
        }
    }
}