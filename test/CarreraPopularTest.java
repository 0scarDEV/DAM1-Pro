import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static examenud04.CarreraPopular.participantesHermanos;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarreraPopularTest {
    // TESTS JUNIT 5
    @Test
    void participantesHermanos_DeberiaRetornarCeroCuandoNoHayHermanos() {
        String[] participantes = {"Doe, John", "Smith, Alice", "Johnson, Bob"};
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(0, resultado);
    }

    @Test
    void participantesHermanos_DeberiaContarHermanosCorrectamente() {
        String[] participantes = {"Doe, John", "Smith, Alice", "Doe, Jane", "Johnson, Bob", "Doe, Jim"};
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(3, resultado);
    }

    @Test
    void participantesHermanos_DeberiaSerCaseInsensitive() {
        String[] participantes = {"Doe, John", "Smith, Alice", "doe, Jane", "johnson, Bob", "Doe, Jim"};
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(3, resultado);
    }

    @Test
    void participantesHermanos_DeberiaManejarArrayVacio() {
        String[] participantes = {};
        int resultado = participantesHermanos(participantes);
        assertEquals(0, resultado);
    }
}
