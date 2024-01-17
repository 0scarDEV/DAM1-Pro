package ejerciciosapuntes;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
E0615. Modificar la Actividad E0614 para que el programa indique al jugador 2 cuántas letras coinciden (son iguales y están en la misma posición) entre el texto introducido por él y el original. */
public class E0615 {
    public static void main(String[] args) {
        String palabraOculta = "teclado";
        String anagrama = desordenar(palabraOculta);
        System.out.println("Pista: " + anagrama);
        boolean flag = true;
        do {
            System.out.print("Adivina la palabra oculta: ");
            String intento = new Scanner(System.in).nextLine();
            System.out.println("Número de coincidencias: " + contarCoincidencias(palabraOculta, intento));
            if (palabraOculta.equals(intento)) {
                System.out.println("Enhorabuena, has acertado, la palabra oculta era " + palabraOculta);
                flag = false;
            } else if (intento.isEmpty()) {
                System.out.println("No se permite una cadena de texto vacía como palabra oculta.");
            }
        } while (flag);
    }
    private static String desordenar(String str) {
        char[] strAux = str.toCharArray();

        for (int i = 0; i < strAux.length; i++){
            int pos = (int) (Math.random()*str.length());
            char ch = strAux[i];
            strAux[i] = strAux[pos];
            strAux[pos] = ch;
        }

        return String.valueOf(strAux);
    }
    private static int contarCoincidencias(String str1, String str2) {
        int contarCoincidencias = 0;

        try {
            for (int i = 0; i < str1.length(); i++){
                if (str1.charAt(i) == str2.charAt(i)) {
                    contarCoincidencias++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
                // Controlamos si la 2da cadena de caracteres es más corta que la primera.
        }

        return contarCoincidencias;
    }
}