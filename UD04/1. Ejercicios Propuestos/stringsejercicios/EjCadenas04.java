package stringsejercicios;

import java.util.Scanner;
/* Óscar Fernández Pastoriza
EjCadenas04. Escribe un programa en Java que lea una cadena del usuario y luego imprima la cadena en orden inverso. Por ejemplo, si el usuario ingresa "Java", el programa debe imprimir "avaJ".
 */
public class EjCadenas04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena:");
        String cadena = scanner.nextLine();

        String cadenaInvertida = invertirCadena(cadena);

        System.out.println("Cadena invertida:");
        System.out.println(cadenaInvertida);

        scanner.close();
    }

    public static String invertirCadena(String cadena) {
        int longitud = cadena.length();
        StringBuilder cadenaInvertida = new StringBuilder();

        for (int i = longitud - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }

        return cadenaInvertida.toString();
    }
}
