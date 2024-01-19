import org.junit.Test;

import static org.junit.Assert.*;
import static simud0402.Matricula.esMatriculaValida;
import static simud0402.Matricula.siguienteMatricula;

public class MatriculaTest {
    @Test public void matriculaValidaDeberiaDevolverTrue() {
        assertTrue(esMatriculaValida("5678XYZ"));
        assertTrue(esMatriculaValida("1234BBB"));
        assertTrue(esMatriculaValida("9999BBZ"));
        assertTrue(esMatriculaValida("9999BBD"));
        assertTrue(esMatriculaValida("9999ZZZ"));
        assertTrue(esMatriculaValida("9876XYZ"));

        assertFalse(esMatriculaValida("1234ABC"));
        assertFalse(esMatriculaValida("1234AEI"));
        assertFalse(esMatriculaValida("ABCD123"));
        assertFalse(esMatriculaValida("1234ÑYZ"));
        assertFalse(esMatriculaValida("123"));
        assertFalse(esMatriculaValida("1234BBBB"));
        assertFalse(esMatriculaValida("12A4BBB"));
        assertFalse(esMatriculaValida("12.4BBB"));
        assertFalse(esMatriculaValida("1234BAB"));
        assertFalse(esMatriculaValida("1234BB."));
        assertFalse(esMatriculaValida("1234B5B"));
        assertFalse(esMatriculaValida("1234BúB"));
        assertFalse(esMatriculaValida("1234BÚB"));
        assertFalse(esMatriculaValida("1234BñB"));
        assertFalse(esMatriculaValida("1234BbB"));

        assertFalse(esMatriculaValida(""));
        assertFalse(esMatriculaValida(null));
    }
    @Test
    public void siguienteMatriculaTest() {
        assertEquals(siguienteMatricula("1234BBB"), "1235BBB");
        assertEquals(siguienteMatricula("9999BBZ"), "0000BCB");
        assertEquals(siguienteMatricula("9999BBD"), "0000BBF");
        assertEquals(siguienteMatricula("9999ZZZ"), "0000BBB");
        assertEquals(siguienteMatricula(""), null);
        assertEquals(siguienteMatricula(null), null);
    }

}
