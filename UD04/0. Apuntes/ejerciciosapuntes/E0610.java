package ejerciciosapuntes;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
E0610. Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”
Las vocales con tilde hacen que los algoritmos consideren una frase palindroma como si no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
Implementa el siguiente método: "public static Boolean esPalindromo(String str)"
 */
public class E0610 {
    public static void main(String[] args) {
        String frase;

        System.out.println("Introduzca una frase:");
        frase = new Scanner(System.in).nextLine();

        System.out.println(esPalindromo(frase));
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