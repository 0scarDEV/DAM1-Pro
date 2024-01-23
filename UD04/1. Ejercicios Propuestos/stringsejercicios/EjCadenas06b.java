package stringsejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class EjCadenas06b {
    public static void main(String[] args) {
        String[] palabras = {"hola", "python", "gato", "programacion", "ahorcado", "teclado"};
        String palabraOculta = palabras[(int) (Math.random() * palabras.length)].toLowerCase();

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
                System.out.println("¡Enhorabuena! ¡Has ganado!");
            }
            if (i == 7) {
                System.out.println("Intentos agotados.");
                System.out.println("¡Lo siento! ¡Has perdido!");
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
