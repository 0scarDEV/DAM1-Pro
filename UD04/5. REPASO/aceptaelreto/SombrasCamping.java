package aceptaelreto;
import java.util.Scanner;

public class SombrasCamping {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int c = 1, f = 1, a = 1;
        c = pedirColumnas();
        f = pedirFilas();
        a = sc.nextInt();

        int[][] mapa = new int[c][f];

        int[] posicionArboles = new int[(a * 2)];
        for (int i = 0; i < (a * 2); i++) {
            // Las posiciones de los árboles vienen dada con la posición inicial (1,1), nosotros queremos que sea (0,0), restamos 1.
            posicionArboles[i] = sc.nextInt() - 1;
        }

        System.out.println(comprobarSombras(mapa, posicionArboles));
    }
    public static int comprobarSombras(int[][] tablero, int[] posicionArboles) {
        int sombras = 0;

        // llenamos el array de ceros
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j] = 0;
            }
        }

        // Marcamos las posiciones de los árboles con un "1", las sombras como un "2".
        for (int k = 0; k < posicionArboles.length; k = k + 2) {
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[0].length; j++) {
                    if (i == posicionArboles[k] && j == posicionArboles[k + 1]) { // Si es la posición de un arbol, marcar arbol como "1".
                        tablero[i][j] = 1;
                        // Si las posiciones colindantes no están marcadas (un cero), se marcan como sombra (un dos)
                        if (i != 0 && j != 0 && tablero[i - 1][j - 1] == 0) { // arriba izq
                            tablero[i - 1][j - 1] = 2;
                        }
                        if (j != 0 && tablero[i][j - 1] == 0) { // arriba
                            tablero[i][j - 1] = 2;
                        }
                        if (i != tablero.length - 1 && j != 0 && tablero[i + 1][j - 1] == 0) { // arriba der
                            tablero[i + 1][j - 1] = 2;
                        }
                        if (i != 0 && tablero[i - 1][j] == 0) { // izq
                            tablero[i - 1][j] = 2;
                        }
                        if (i != tablero.length - 1 && tablero[i + 1][j] == 0) { // der
                            tablero[i + 1][j] = 2;
                        }
                        if (i != 0 && j != tablero[0].length - 1 && tablero[i - 1][j + 1] == 0) { // abajo izq
                            tablero[i - 1][j + 1] = 2;
                        }
                        if (j != tablero[0].length - 1 && tablero[i][j + 1] == 0) { // abajo
                            tablero[i][j + 1] = 2;
                        }
                        if (i != tablero.length - 1 && j != tablero[0].length - 1 && tablero[i + 1][j + 1] == 0) { // abajo der
                            tablero[i + 1][j + 1] = 2;
                        }
                    }
                }
            }
        }

        // Recorremos el array bidimensional contando los doses.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] == 2) {
                    sombras++;
                }
            }
        }
        return sombras;
    }

    private static int pedirColumnas() {
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

        return c;
    }

    private static int pedirFilas() {
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

        return f;
    }
}