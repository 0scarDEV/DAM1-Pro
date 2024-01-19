import org.junit.jupiter.api.Test;

import static arraysejercicios.EjArrays13.esDiagonal;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EjArrays13Test {
    @Test
    public void pruebaMatrizDiagonal() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
        assertTrue(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoDiagonal() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}, {0, 1, 3}};
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoCuadrada() {
        int[][] matriz = {{1, 0, 0}, {0, 2, 0}};
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNoCuadrada2() {
        int[][] matriz = {{1, 0}, {0, 2}, {0, 0}};
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizVacia() {
        int[][] matriz = {};
        assertFalse(esDiagonal(matriz));
    }

    @Test
    public void pruebaMatrizNull() {
        int[][] matriz = null;
        assertFalse(esDiagonal(matriz));
    }
}