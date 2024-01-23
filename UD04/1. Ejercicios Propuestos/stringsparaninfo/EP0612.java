package stringsparaninfo;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EP0612. Realiza el juego del ahorcado. Las reglas del juego son:
El jugador A teclea una palabra, sin que el jugador B la vea.
Ahora se le muestra tantos guiones como letras tenga la palabra secreta. Por ejemplo, para “hola” será "_ _ _ _”
El jugador B intentará acertar, letra a letra, la palabra secreta.
Cada acierto muestra la letra en su lugar y las letras no acertadas seguirán ocultas como guiones. Siguiendo con el ejemplo anterior, y suponiendo que se han introducido la 'o', la 'j' y la 'a', se mostrará:” _o_a”.
El jugador B solo tiene 7 intentos.
La partida terminará al acertar todas las letras que forman la palabra secreta (gana el jugador B) o cuando se agoten todos los intentos (gana el jugador A).
 */
public class EP0612 {
    public static void main(String[] args) {
        System.out.print("Jugador A, introduce la palabra secreta: ");
        String palabraOculta = new Scanner(System.in).nextLine();

        char[] letra = palabraOculta.toCharArray();
        char[] palabraParaDescubrir = new char[letra.length];
        Arrays.fill(palabraParaDescubrir, '-');

        System.out.println("Jugador B ¡Intenta descubrir la palabra secreta!");
        boolean flag = true;
        int i = 0;
        do {
            mostrarPalabraOculta(palabraParaDescubrir);
            i++;
            char intento = new Scanner(System.in).nextLine().charAt(0);
            for (int j = 0; j < palabraParaDescubrir.length; j++) {
                if (intento == letra[j]) {
                    int pos = palabraOculta.indexOf(intento);
                    palabraParaDescubrir[pos] = intento;
                }
            }
            String palabraDescubierta = String.valueOf(palabraParaDescubrir);
            if (palabraDescubierta.equals(palabraOculta)) {
                flag = false;
                mostrarPalabraOculta(palabraParaDescubrir);
                System.out.println("¡Enhorabuena Jugador 2! ¡Has ganado!");
            }
            if (i == 7) {
                System.out.println("Intentos agotados.");
                System.out.println("¡Enhorabuena Jugador 1! ¡Has ganado!");
            }
        } while (flag && i < 7);
    }
    public static void mostrarPalabraOculta(char[] palabraParaDescubrir) {
        for (int j = 0; j < palabraParaDescubrir.length; j++) {
            System.out.print(palabraParaDescubrir[j]);
        }
        System.out.println();
    }
}