package stringsparaninfo;
/* Óscar Fernández Pastoriza
EP0616. Lee una palabra o frase y muestra el proceso en el que cada letra se sustituye por otro simbolo no alfabético. Por ejemplo el carácter 'a' se podría sustituir por el carácter '@', la 'e' por '€', la 'i' por '1', etcétera. */
public class EP0616 {
    public static void main(String[] args) {
        String palabra = "abeciso";
        System.out.println(encriptarLetras(palabra));
    }
    static String encriptarLetras(String frase) {
        char[] letras = frase.toCharArray();
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == 'a') {
                letras[i] = '@';
            } else if (letras[i] == 'e') {
                letras[i] = '€';
            } else if (letras[i] == 'i') {
                letras[i] = '1';
            } else if (letras[i] == 's') {
                letras[i] = '5';
            } else if (letras[i] == 'o') {
                letras[i] = '0';
            }
        }
        frase = "";
        for (int i = 0; i < letras.length; i++) {
            frase += letras[i];
        }
        return frase;
    }
}