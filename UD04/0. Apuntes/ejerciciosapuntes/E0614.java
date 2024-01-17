package ejerciciosapuntes;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
E0614. Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra y la aplicación muestra un anagrama (cambio del orden de los caracteres) generado al azar.
A continuación, otro jugador tiene que acertar cuál es el texto original. La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía. Por ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar, como por ejemplo: “etcloda”.  */
public class E0614 {
    public static void main(String[] args) {
        String palabraOculta = "teclado";
        String anagrama = desordenar(palabraOculta);
        System.out.println("Pista: " + anagrama);
        boolean flag = true;
        do {
            System.out.print("Adivina la palabra oculta: ");
            String intento = new Scanner(System.in).nextLine();
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
}