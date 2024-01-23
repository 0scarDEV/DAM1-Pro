package stringsejercicios;
/* Óscar Fernández Pastoriza
* EjCadenas05. Escribe un programa en Java que lea una palabra del usuario y luego verifique si es un palíndromo (es decir, si se lee igual de izquierda a derecha que de derecha a izquierda).
 */
public class EjCadenas05 {
    public static void main(String[] args) {
        String str = "zhhz";
        System.out.println("¿Es palíndromo? " + esPalindromo(str));
    }
    public static Boolean esPalindromo (String str) {
        String fraseInvertida = "";
        char[] letras = str.toCharArray();
        for (int j = letras.length - 1; j >= 0; j--) {
            fraseInvertida += letras[j];
        }
        str = str.replace(" ","");
        fraseInvertida = fraseInvertida.replace(" ","");
        str = str.trim();
        return str.equalsIgnoreCase(fraseInvertida);
    }
}
