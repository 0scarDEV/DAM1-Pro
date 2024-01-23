package arraysNdimensionales;

import simud0401.UtilMatrices;

import java.util.Arrays;

import static arraysejercicios.UtilMatrices.esCuadrada;

public class matrices {
    private static void mostrarMatriz(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print("\t" + t[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
    public static int[][] multiplicar(int[][] t1, int[][] t2){
        int[][] tr = null;
        // Comprobamos que el número de columnas de t1 sea igual que el número de filas de t2. También que ninguna de las dos matrices recibidas sean nulas.
        if (t1 != null && t2 != null && t1[0] != null && t2[0] != null && t1[0].length == t2.length){
            // Creamos la tabla resultante
            tr = new int[t1.length][t2[0].length];
            // Recorremos uno a uno los elementos de las matrices.
            for (int i = 0; i < tr.length; i++){            // Horizontal
                for (int j = 0; j < tr[i].length; j++){     // vertical
                    // Asignar valor a la casilla
                    for (int r = 0; r < t2.length; r++){    // horinzotal * vertical
                        // SUMATORIO
                        tr[i][j] += t1[i][r] * t2[r][j];
                    }
                }
            }
        }
        return tr;
    }
    public static Boolean esMatrizValida(int[][] t){
        return t != null && t.length > 0 && t[0].length > 0;
    }
    public static int[][] traspuesta(int[][] t){
        int[][] tr = null;

        if (esMatrizValida(t)){
            tr = new int[t[0].length][t.length];
            for (int i = 0; i < tr.length; i++){
                for(int j = 0; j < tr[0].length; j++){
                    tr[i][j] = t[j][i];
                }
            }
        }

        return tr;
    }
    public static Boolean esCuadrada(int[][] t){
        Boolean res = null;
        if (esMatrizValida(t)) {
            res = t.length == t[0].length;
        }
        return res;
    }
    public static Boolean esDiagonal(int[][] t) {
        boolean esTriangular = false;
        if (UtilMatrices.esCuadrada(t) && t.length >= 2) {
            boolean esTriangularSuperior = true;
            for (int i = 1; i < t.length; i++)
                for (int j = 0; j < i; j++)
                    if (t[i][j] != 0){
                        esTriangularSuperior = false;
                    }


            boolean esTriangularInferior = true;
            for (int i = 0; i < t.length - 1; i++)
                for (int j = i + 1; j < t.length; j++)
                    if (t[i][j] != 0)
                        esTriangularInferior = false;

            esTriangular = esTriangularInferior && esTriangularSuperior;
        }

        return esTriangular;
    }
    public static Boolean esTriangular(int[][] t) {
        boolean esTriangular = false;
        if (UtilMatrices.esCuadrada(t) && t.length >= 2) {
            boolean esTriangularSuperior = true;
            for (int i = 1; i < t.length; i++)
                for (int j = 0; j < i; j++)
                    if (t[i][j] != 0){
                        esTriangularSuperior = false;
                    }


            boolean esTriangularInferior = true;
            for (int i = 0; i < t.length - 1; i++)
                for (int j = i + 1; j < t.length; j++)
                    if (t[i][j] != 0)
                        esTriangularInferior = false;

            esTriangular = esTriangularInferior || esTriangularSuperior;
        }

        return esTriangular;
    }
    public static int[][] matrizIdentidad(int n){
        int[][] matrizIdentidad = null;
        Arrays.fill(matrizIdentidad, 0);

        for (int i = 0; i < n; i++){
            matrizIdentidad[i][i] = 1;
        }

        return matrizIdentidad;
    }
    public static boolean esSimetrica(int[][] matriz) {
        boolean res = false;
        if (arraysejercicios.UtilMatrices.esCuadrada(matriz)) {
            if (Arrays.deepEquals(matriz, arraysejercicios.UtilMatrices.traspuesta(matriz))) {
                res = true;
            }
        }
        return res;
    }
    public static Boolean esOrtogonal(int[][] t){
        Boolean res = null;
        if (esCuadrada(t)){
            int[][] traspuesta = arraysejercicios.UtilMatrices.traspuesta(t);
            int[][] tProducto = arraysejercicios.UtilMatrices.multiplicar(t, traspuesta);
            int[][] tIdentidad = arraysejercicios.UtilMatrices.matrizIdentidad(t.length);

            res = Arrays.deepEquals(tProducto, tIdentidad);
        }
        return res;
    }
    public static boolean esMatrizMagica(int[][] t){
        return (comprobarSumaFilas(t) && comprobarSumaColumnas(t));
    }
    public static boolean esMatrizMagicaDiabolica(int[][] t) {
        return (comprobarSumaColumnas(t) && comprobarSumaFilas(t) && comprobarSumaDiagonalesPrincipales(t));
    }

    private static boolean comprobarSumaDiagonalesPrincipales(int[][] t) {
        int sumatorioIzqDer = 0;
        int sumatorioDerIzq = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == j) {
                    sumatorioIzqDer += t[i][j];
                }
            }
        }
        for (int i = t.length -1; i >= 0; i--) {
            for (int j = t[0].length; j >= 0; j--) {
                if (i == j) {
                    sumatorioDerIzq += t[i][j];
                }
            }
        }
        return sumatorioIzqDer == sumatorioDerIzq;
    }
    private static boolean comprobarSumaFilas(int[][] t){
        int sumatorioFila1 = 0, sumatorioFila2 = 0, sumatorioFila3 = 0, sumatorioFila4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[i][j];
                switch (i) {
                    case 0 -> sumatorioFila1 = sumatorio;
                    case 1 -> sumatorioFila2 = sumatorio;
                    case 2 -> sumatorioFila3 = sumatorio;
                    case 3 -> sumatorioFila4 = sumatorio;
                }
            }
        }
        return (sumatorioFila1 == sumatorioFila2 && sumatorioFila2 == sumatorioFila3 && sumatorioFila3 == sumatorioFila4);
    }
    private static boolean comprobarSumaColumnas(int[][] t){
        int sumatorioCol1 = 0, sumatorioCol2 = 0, sumatorioCol3 = 0, sumatorioCol4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[j][i];
                switch (i) {
                    case 0 -> sumatorioCol1 = sumatorio;
                    case 1 -> sumatorioCol2 = sumatorio;
                    case 2 -> sumatorioCol3 = sumatorio;
                    case 3 -> sumatorioCol4 = sumatorio;
                }
            }
        }
        return (sumatorioCol1 == sumatorioCol2 && sumatorioCol2 == sumatorioCol3 && sumatorioCol3 == sumatorioCol4);
    }
}