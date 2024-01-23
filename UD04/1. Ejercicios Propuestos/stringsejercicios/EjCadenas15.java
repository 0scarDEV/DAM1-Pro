package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas15. Crea una función que convierta una cadena de caracteres a mayúsculas o minúsculas.
 */
public class EjCadenas15 {
    public static void main(String[] args) {
        String prueba1 = "jdasjdajsd2";
        System.out.println(convertirCase(prueba1, 2));
        String prueba2 = "HJAJHDSHJKADJSHA";
        System.out.println(convertirCase(prueba2, 1));
    }
    public static String convertirCase(String str, int opcion) {
        switch (opcion) {
            case 1 -> str = str.toLowerCase();
            case 2 -> str = str.toUpperCase();
            default -> str = null;
        }
        return str;
    }
}
