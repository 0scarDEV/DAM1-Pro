import org.junit.Test;

import static examenud04.MontanaRusa.contarPicos;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MontanaRusaTest {
    @Test
    public void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaPequeña() {
        int[] alturas = { 3, 2 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaDeUno() {
        int[] alturas = { 3 };
        assertEquals(0, contarPicos(alturas));
    }

    @Test
    public void testContarPicos_MontañaVacía() {
        int[] alturas = {};
        assertEquals(0, contarPicos(alturas));
    }

}
