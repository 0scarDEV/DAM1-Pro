package ejerciciosrepaso;

import java.util.Arrays;
import java.util.Scanner;

public class JuegoDeLaVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int numFilas = sc.nextInt();

        System.out.println("Ingrese el numero de columnas de la matriz: ");
        int numColumnas = sc.nextInt();

        System.out.println("Ingrese las coordenadas (fila columna) de las celdas vivas separadas por espacios (Ingrese -1 -1 para terminar): ");

        int[] filas = new int[0];
        int[] columnas = new int[0];

        int i = 0;

        do {
            filas = Arrays.copyOf(filas, filas.length + 1);
            columnas = Arrays.copyOf(columnas, columnas.length + 1);

            filas[i] = sc.nextInt();
            columnas[i] = sc.nextInt();
            i++;
        } while (filas[i - 1] != -1 && columnas[i - 1] != -1);

        System.out.println("Ingrese el nÃºmero de generaciones: ");
        int numGeneraciones = sc.nextInt();

        char[][] mapa = new char[numFilas][numColumnas];

        // Rellenamos el mapa con x.
        for (int j = 0; j < numFilas; j++) {
            for (int j2 = 0; j2 < numColumnas; j2++) {
                mapa[j][j2] = 'x';
            }
        }

        // Comprobamos si la posición del mapa coincide con la posición indicada por teclado y rellenamos el mapa con celdas vivas.
        for (int k = 0; k < filas.length - 1; k++) {
            mapa[filas[k]][columnas[k]] = 'o';
        }

        // Para cada generación, mostramos la salida
        for (int k = 0; k < numGeneraciones; k++) {
            System.out.println("GENERACIÓN " + k);
            mapa = aplicarReglas(mapa);
            mostrarMapa(mapa);
        }

        sc.close();
    }
    public static char[][] aplicarReglas(char[][] mapa) {
        int numFilas = mapa.length;
        int numColumnas = mapa[0].length;
        char[][] nuevoMapa = new char[numFilas][numColumnas];

        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                int vecinosVivos = contarVecinosVivos(mapa, i, j);

                if (mapa[i][j] == 'o') {
                    if (vecinosVivos < 2 || vecinosVivos > 3) {
                        nuevoMapa[i][j] = 'x'; // Subpoblación o superpoblación, la celda muere.
                    } else {
                        nuevoMapa[i][j] = 'o'; // Celda viva con dos o tres vecinos vivos.
                    }
                } else {
                    if (vecinosVivos == 3) {
                        nuevoMapa[i][j] = 'o'; // Celda muerta con exactamente tres vecinos vivos se convierte en una celda viva.
                    } else {
                        nuevoMapa[i][j] = 'x'; // Celda muerta permanece muerta.
                    }
                }
            }
        }

        return nuevoMapa;
    }
    public static boolean esCeldaViva(char[][] mapa, int fila, int columna) {
        return mapa[fila][columna] == 'o';
    }

    public static int contarVecinosVivos(char[][] mapa, int i, int j) {
        int contador = 0;
        boolean noEsPrimeraFila = i != 0;
        boolean noEsUltimaFila = i != mapa.length - 1;
        boolean noEsPrimeraColumna = j != 0;
        boolean noEsUltimaColumna = j != mapa[0].length - 1;
        // Si las posiciones colindantes no están vivas (una o), se suma el contador
        if (noEsPrimeraFila && noEsPrimeraColumna && mapa[i - 1][j - 1] == 'o') { // arriba izq
            contador++;
        }
        if (noEsPrimeraFila && mapa[i - 1][j] == 'o') { // arriba
            contador++;
        }
        if (noEsPrimeraFila && noEsUltimaColumna && mapa[i - 1][j + 1] == 'o') { // arriba der
            contador++;
        }
        if (noEsPrimeraColumna && mapa[i][j - 1] == 'o') { // izq
            contador++;
        }
        if (noEsUltimaColumna && mapa[i][j + 1] == 'o') { // der
            contador++;
        }
        if (noEsUltimaFila && noEsPrimeraColumna && mapa[i + 1][j - 1] == 'o') { // abajo izq
            contador++;
        }
        if (noEsUltimaFila && mapa[i + 1][j] == 'o') { // abajo
            contador++;
        }
        if (noEsUltimaFila && noEsUltimaColumna && mapa[i + 1][j + 1] == 'o') { // abajo der
            contador++;
        }
        return contador;
    }

    public static void mostrarMapa(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {
                System.out.print(mapa[i][j]);
            }
            System.out.println();
        }
    }
}