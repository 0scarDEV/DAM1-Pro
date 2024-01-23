package stringsparaninfo;
/* Óscar Fernández Pastoriza
EP0611. Escribe un programa descodificador que muestre un texto codificado con el programa realizado en la Actividad resuelta E0611.  */
public class EP0611 {
    public static void main(String[] args) {
        char[] conjunto1 = "pviumterkqs".toCharArray();
        char[] conjunto2 = "eikmpqrstuv".toCharArray();

        String palabra = "matqvko";
        char letraCodificada = codifica(conjunto1, conjunto2, 'T');
        String palabraCodificada = codifica(conjunto1, conjunto2, palabra);

        System.out.println(palabraCodificada);
    }

    public static char codifica(char[] conjunto1, char[] conjunto2, char c){
        char ch = ' ';
        int pos = String.valueOf(conjunto1).indexOf(Character.toLowerCase(c));

        if (pos == -1) {
            ch = c;
        } else {
            ch = conjunto2[pos];
        }

        return ch;
    }
    public static String codifica(char[] conjunto1, char[] conjunto2, String palabra){
        String res = "";

        for (int i = 0; i < palabra.length(); i++){
            res += codifica(conjunto1, conjunto2, palabra.charAt(i));
        }

        return res;
    }
}
