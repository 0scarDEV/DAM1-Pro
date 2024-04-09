package coleccionesejercicios.EP1227;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class LeerCadenas {
    /* EP1227. Implementa la función LeeCadena(), con el siguiente prototipo:
    *       List<Character> leeCadena()
    * que lee una cadena por teclado y nos la devuelve en una lista con un carácter en cada elemento. */
    static List<Character> leeCadena() {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        List<Character> listaRes = new ArrayList<>();

        char[] caracteres = cadena.toCharArray();
        for (Character caracter : caracteres) {
            listaRes.add(caracter);
        }

        return listaRes;
    }
    public static void main(String[] args) {
        System.out.println(leeCadena());
    }
}
