package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas09. Crea una función que reemplace todas las ocurrencias de una subcadena dada en una cadena de caracteres por otra subcadena dada.
 */
public class EjCadenas09 {
    public static void main(String[] args) {
        char[] conjunto1 = "eikmpqrstuv".toCharArray();
        char[] conjunto2 = "pviumterkqs".toCharArray();

        String palabra = "PaquiTo";
        String palabraCodificada = codifica(conjunto1, conjunto2, palabra);

        System.out.println(palabraCodificada);
    }

    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra){
        String res = "";

        for (int i = 0; i < palabra.length(); i++){
            res += codifica(conjunto1, conjunto2, String.valueOf(palabra.charAt(i)));
        }

        return res;
    }
}