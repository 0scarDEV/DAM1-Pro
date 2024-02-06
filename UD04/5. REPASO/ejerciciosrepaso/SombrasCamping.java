package ejerciciosrepaso;
import java.util.Scanner;

public class SombrasCamping {
    public static void main(String[] args) {
        int c = 1, f = 1, a = 1;
        while ((c != 0) && (f != 0) && (a != 0)) {
            Scanner sc = new Scanner(System.in);

            c = pedirColumnas();
            f = pedirFilas();

            a = sc.nextInt();

            int[][] mapa = new int[c][f];
            // Rellenamos el mapa de ceros.
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[0].length; j++) {
                    mapa[i][j] = 0;
                }
            }

            // Posicionamos en un mapa de dimensiones c por f con un "1" los árboles
            for (int i = 0; i < (2 * a); i++) {
                int col = 0, fil = 0;
                if (i % 2 == 0) {
                    col = sc.nextInt();
                } else {
                    fil = sc.nextInt();
                }
                mapa[col][fil] = 1;
            }
        }
    }

    private static int pedirColumnas() {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        boolean flagC = true;

        do {
            c = sc.nextInt();
            if (1 <= c && c <= 50) {
                flagC = false;
            } else {
                System.out.println("Numero de columnas introducido fuera de rango, inténtelo de nuevo.");
            }
        } while (flagC);

        sc.close();
        return c;
    }

    private static int pedirFilas() {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        boolean flagF = true;

        do {
            f = sc.nextInt();
            if (1 <= f && f <= 50) {
                flagF = false;
            } else {
                System.out.println("Numero de filas introducido fuera de rango, inténtelo de nuevo.");
            }
        } while (flagF);

        sc.close();
        return f;
    }
}