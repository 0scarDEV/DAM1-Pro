package stringsejercicios;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EjCadenas07. Crea una función que tome una cadena de caracteres y devuelva la cadena invertida.
 */
public class EjCadenas07 {
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
