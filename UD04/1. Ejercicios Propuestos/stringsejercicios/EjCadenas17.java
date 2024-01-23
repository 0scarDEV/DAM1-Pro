package stringsejercicios;
/*
EjCadenas17. Crea una función que determine si una cadena de caracteres es un número entero válido.
 */
public class EjCadenas17 {
    public static void main(String[] args) {
        String str1 = "13123132";
        String str2 = "JASJA";
        System.out.println(esEnteroValido(str1));
        System.out.println(esEnteroValido(str2));
    }
    public static boolean esEnteroValido(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
