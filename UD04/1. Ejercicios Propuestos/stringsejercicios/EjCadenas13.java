package stringsejercicios;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
EjCadenas13. Crea una función que elimine los espacios en blanco de una cadena de caracteres.
 */
public class EjCadenas13 {
    public static void main(String[] args) {
        System.out.println("Ingrese una cadena:");
        String cadena =  new Scanner(System.in).nextLine();

        String cadenaSinEspacios = eliminarEspaciosEnBlanco(cadena);

        System.out.println("Cadena sin espacios en blanco:");
        System.out.println(cadenaSinEspacios);}

    public static String eliminarEspaciosEnBlanco(String cadena) {
        // Utilizando el método replaceAll con expresión regular para eliminar espacios
        return cadena.replaceAll("\\s", "");
    }
}
