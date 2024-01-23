package stringsejercicios;

import java.util.Arrays;

/* Óscar Fernández Pastoriza
EjCadenas14. Crea una función que divida una cadena de caracteres en una matriz de subcadenas en función de un delimitador dado.
 */
public class EjCadenas14 {
    public static void main(String[] args) {
        String str = "Hola hola jdajsd";
        System.out.println(Arrays.toString(dividirStrings(str, " ")));
    }
    public static String[] dividirStrings(String str, String delimitador) {
        return str.split(delimitador);
    }
}