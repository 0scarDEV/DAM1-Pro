package mapa;

import java.util.Arrays;
import java.util.Random;

/* Óscar Fernández Pastoriza */
public class Mapa {
    enum TERRENO {VACIO, PARED}
    private int filas;
    private int columnas;
    private int[][] mapa;
    Integer[] coordEntrada;
    Integer[] coordSalida;
    public Mapa(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        mapa = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = 0;
            }
        }
    }
    public Mapa(int[][] mapa) {
        this.mapa = mapa;
        this.filas = mapa.length;
        this.columnas = mapa[0].length;
    }
    public int getFilas() {
        return filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public int[][] getMapa() {
        return mapa;
    }
    public void setCoordEntrada(int x, int y) throws Exception {
        coordEntrada = new Integer[2];
        if (x >= 0 && x <= mapa.length) {
            coordEntrada[0] = x;
        } else {
            throw new Exception("COLUMNA DE LA CASILLA DE ENTRADA INVÁLIDA");
        }
        if (y >= 0 && y <= mapa[0].length) {
            coordEntrada[1] = y;
        } else {
            throw new Exception("FILA DE LA CASILLA DE ENTRADA INVÁLIDA");
        }
    }
    public void setCoordSalida(int x, int y) throws Exception {
        coordSalida = new Integer[2];
        if (x >= 0 && x <= mapa.length) {
            coordSalida[0] = x;
        } else {
            throw new Exception("COLUMNA DE LA CASILLA DE SALIDA INVÁLIDA");
        }
        if (y >= 0 && y <= mapa[0].length) {
            coordSalida[1] = y;
        } else {
            throw new Exception("FILA DE LA CASILLA DE SALIDA INVÁLIDA");
        }
    }
    public Integer[] getEntrada() {
        return coordEntrada;
    }
    public Integer[] getSalida() {
        return coordSalida;
    }
    Integer[] generarEntrada() throws Exception {
        Random random = new Random();
        int x = random.nextInt(getColumnas());
        int y = random.nextInt(getFilas());
        this.setCoordEntrada(x, y);
        return this.getEntrada();
    }
    Integer[] generarsalida() throws Exception {
        Random random = new Random();
        int x = random.nextInt(getColumnas());
        int y = random.nextInt(getFilas());
        this.setCoordSalida(x, y);
        return this.getSalida();
    }
}