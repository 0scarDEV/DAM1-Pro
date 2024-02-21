import static org.junit.jupiter.api.Assertions.assertEquals;

import examenud04rec.CentroMatriz;
import org.junit.jupiter.api.Test;

public class CentroMatrizTest1 {


    @Test
    public void testCentroMatrizNula() {
        // Caso de matriz nula
        assertEquals(0, CentroMatriz.centroMatriz(null));

    }
    @Test
    public void testCentroMatrizVacía() {
        // Caso de matriz vacía
        assertEquals(0, CentroMatriz.centroMatriz(new int[][]{}));
    }
    @Test
    public void testCentroMatrizUno() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz1));
    }

    @Test
    public void testCentroMatrizDos() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3,4}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz1));
    }

    @Test
    public void testCentroMatrizTres() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3,4,5}
        };
        assertEquals(4, CentroMatriz.centroMatriz(matriz1));
    }

    @Test
    public void testCentroMatrizDosFilas() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3},
            {4}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz1));
    }

    @Test
    public void testCentroMatrizTresFilas() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {3},
            {4},
            {5}
        };
        assertEquals(4, CentroMatriz.centroMatriz(matriz1));
    }


    @Test
    public void testCentroMatrizImpar() {
        // Caso de matriz con elementos
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertEquals(5, CentroMatriz.centroMatriz(matriz1));
    }


    @Test
    public void testCentroMatrizPar() {

        int[][] matriz2 = {
            {1, 2, 3, 4},
            {5, 7, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        assertEquals(8, CentroMatriz.centroMatriz(matriz2));
    }


    @Test
    public void testCentroMatrizParImpar() {

        int[][] matriz3 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz3));
    }


    @Test
    public void testCentroMatrizImparPar() {

        int[][] matriz4 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        assertEquals(3, CentroMatriz.centroMatriz(matriz4));
    }


    @Test
    public void testCentroMatrizParNoCuadrada() {

        int[][] matriz5 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8}
        };
        assertEquals(4, CentroMatriz.centroMatriz(matriz5));
    }
    @Test
    public void testCentroMatrizRedondeoArriba() {

        int[][] matriz6 = {
            {1, 2, 2, 4},
            {5, 1, 2, 8}
        };
        assertEquals(2, CentroMatriz.centroMatriz(matriz6));

    }
}
