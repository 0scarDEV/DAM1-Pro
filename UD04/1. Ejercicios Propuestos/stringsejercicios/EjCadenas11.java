package stringsejercicios;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EjCadenas11. Crea una función que determine si una cadena de caracteres contiene una subcadena dada.
 */
public class EjCadenas11 {
    public static void main(String[] args) {
        System.out.println("Ingrese una cadena:");
        String cadena = new Scanner(System.in).nextLine();

        System.out.println("Ingrese una subcadena:");
        String subcadena = new Scanner(System.in).nextLine();

        boolean contieneSubcadena = contieneSubcadena(cadena, subcadena);

        if (contieneSubcadena) {
            System.out.println("La cadena contiene la subcadena.");
        } else {
            System.out.println("La cadena no contiene la subcadena.");
        }
    }

    public static boolean contieneSubcadena(String cadena, String subcadena) {
        return cadena.contains(subcadena);
    }
}