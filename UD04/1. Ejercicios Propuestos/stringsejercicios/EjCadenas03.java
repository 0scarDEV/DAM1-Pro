package stringsejercicios;

import java.util.Scanner;
/* Óscar Fernández Pastoriza
EjCadenas03. Contar el número de veces que aparece un carácter en un texto.
 */
public class EjCadenas03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();

        System.out.println("Ingrese el carácter a contar:");
        char caracter = scanner.next().charAt(0);

        int contador = contarCaracter(texto, caracter);

        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en el texto.");

        scanner.close();
    }

    public static int contarCaracter(String texto, char caracter) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contador++;
            }
        }

        return contador;
    }
}
