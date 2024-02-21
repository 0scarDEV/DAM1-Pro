package aceptaelreto;
import java.util.Arrays;
import java.util.Scanner;
public class CartasDelAbuelo {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String cadenaTexto;
        int intervalo = 0;

        cadenaTexto = txt.nextLine();
        intervalo = num.nextInt();

        int[] pos = new int[2];

        while (intervalo != 0) {
            for (int i = 0; i < intervalo; i++) {
                pos[0] = num.nextInt();
                pos[1] = num.nextInt();
                Arrays.sort(pos);

                // El método substring tiene el último valor como excluyente, hay que incluirlo en el substring
                char[] letras = cadenaTexto.substring(pos[0], pos[1] + 1).toCharArray();

                if (comprobarSiSonIguales(letras)){
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
            cadenaTexto = txt.nextLine();
            intervalo = num.nextInt();
        }
    }
    private static boolean comprobarSiSonIguales(char[] letras) {
        for (int i = 1; i < letras.length; i++) {
            if (letras[i - 1] != letras[i]) {
                return false;
            }
        }
        return true;
    }
}