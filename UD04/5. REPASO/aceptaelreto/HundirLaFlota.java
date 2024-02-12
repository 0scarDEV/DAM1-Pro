package aceptaelreto;

import java.util.Scanner;

public class HundirLaFlota {
    public static void main(String[] args) {
        int[] barcos = crearBarcos();
        int[][] tablero = crearTablero();

        if (verificarTablero(barcos, tablero)) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean verificarTablero(int[] barcos, int[][] tablero) {
        // Comprobamos si los valores introducidos son válidos.
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] < 0 || tablero[i][j] > 1) {
                    return false;
                }
            }
        }

        if (!identificarBarcos(barcos, tablero)) {
            return false;
        }

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
        /*
        // Comprobar que los barcos no se tocan.
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
 */
        return true;
    }

    private static int[][] crearTablero() {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        System.out.print("Introduce el tamaño deseado del tablero: ");
        do {
            tamanho = sc.nextInt();
            if (tamanho > 128) {
                System.out.println("\nERROR. Longitud del tablero introducida inválida. Vuelve a intentarlo.");
            }
        } while (tamanho > 128);

        int[][] tablero = new int[tamanho][tamanho];

        System.out.println(
                "Introduzca los " + tamanho + " datos separados por espacios. 0 es agua y 1 es barco, recuerda que los barcos no deben tocarse.");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("FILA NÚMERO " + (i + 1) + ":");
            for (int j = 0; j < tamanho; j++) {
                tablero[i][j] = sc.nextInt();
            }
        }

        sc.close();
        return tablero;
    }

    private static int[] crearBarcos() {
        Scanner sc = new Scanner(System.in);
        int numBarcos;
        System.out.print("Número de barcos a crear: ");
        do {
            numBarcos = sc.nextInt();
            if (numBarcos < 0 || numBarcos > 10) {
                System.out.println("\nERROR. Número de barcos introducido inválido. Vuelve a intentarlo.");
            }
        } while (numBarcos < 0 || numBarcos > 10);

        int[] barcos = new int[numBarcos];
        for (int i = 0; i < barcos.length; i++) {
            System.out.print("Introduce la longitud del barco " + (i + 1) + ": ");
            do {
                barcos[i] = sc.nextInt();
                if (barcos[i] < 0) {
                    System.out.println("\nERROR. Longitud del barco " + (i + 1) + " introducido inválido. Vuelve a intentarlo.");
                }
            } while (barcos[i] < 0);
        }

        return barcos;
    }

    private static boolean identificarBarcos(int[] barcos, int[][] tablero) {
        boolean esBarcoValido = true;
        // Por cada vez que se encuentra "1", buscar los "1" colindantes, comprobar si se corresponde con algún barco, si es así, borrarlo del array de barcos.
        // Identificar los barcos y comprobar que tienen longitud adecuada.
        for (int i = 0; i < tablero.length; i++) {                                          // filas
            for (int j = 0; j < tablero.length; j++) {                                      // columnas
                if (tablero[i][j] == 1) {                                                   // Si es un uno, revisa como sigue.
                    for (int barco : barcos) {
                        if (sigueDerecha(barco, i, j, tablero)) {
                            for (int k = 0; k < barco; k++) {
                                tablero[i][j + k] = 2;
                            }
                            return true;
                        } else if (sigueAbajo(barco, i, j, tablero)) {
                            for (int k = 0; k < barco; k++) {
                                tablero[i + k][j] = 2;
                            }
                            return true;
                        } else {
                            esBarcoValido = false;
                        }
                    }
                }
            }
        }
        return esBarcoValido;
    }

    private static boolean sigueDerecha(int barco, int i, int j, int[][] tablero) {
        boolean sigueDerecha = false;
        // Identificar si el barco encontrado sigue a la derecha.

        for (int k = 0; k < barco; k++) {                            // cada barco
            if (i != tablero.length - barco && tablero[i][j + k] == 1) {           // ¿Sigue hacia derecha?
                sigueDerecha = true;
            } else {
                return false;
            }
        }
        return sigueDerecha;
    }

    private static boolean sigueAbajo(int barco, int i, int j, int[][] tablero) {
        boolean sigueAbajo = false;
        // Identificar si el barco encontrado sigue a la izquierda.
        for (int k = 0; k < barco; k++) {                            // cada barco
            if (j != tablero[0].length - barco && tablero[i + k][j] == 1) { // ¿Sigue hacia abajo?
                sigueAbajo = true;
            } else {
                return false;
            }
        }
        return sigueAbajo;
    }
}