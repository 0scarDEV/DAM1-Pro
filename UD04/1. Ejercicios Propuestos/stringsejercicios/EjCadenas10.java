package stringsejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
EjCadenas10. Crea una función que determine si una cadena de caracteres es un anagrama de otra cadena de caracteres. */
public class EjCadenas10 {
    public static void main(String[] args) {
        System.out.println(esAnagrama("hola", "hlla"));
    }
    static boolean esAnagrama (String palabra1, String palabra2) {
        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            return false;
        }

        char[] cadena1 = palabra1.toCharArray();
        char[] cadena2 = palabra2.toCharArray();

        Arrays.sort(cadena1);
        Arrays.sort(cadena2);

        return Arrays.equals(cadena1, cadena2);
    }
}