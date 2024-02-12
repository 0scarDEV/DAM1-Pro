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

        for (int j = 0; j < numFilas; j++) {
            for (int j2 = 0; j2 < numColumnas; j2++) {
                mapa[j][j2] = 'x';
            }
        }

        for (int j = 0; j < numFilas; j++) {
            for (int j2 = 0; j2 < numColumnas; j2++) {
                for (int k = 0; k < filas.length; k++) {
                    if(filas[k] == j && columnas[k] == j2){
                        mapa[j][j2] = 'o';
                    }
                }
            }
        }


        sc.close();
    }

    public static boolean esCeldaViva(int fila, char[][] mapa, int columna) {
        return mapa[fila][columna] == 'o';
    }
/*
    public static int contarVecinosVivos(char[][] mapa) {
        int contador = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[0].length; j++) {

                if(){}

                contador++;

            }
        }
        return 0;
    }
 */
}