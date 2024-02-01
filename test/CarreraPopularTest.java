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
    void participantesHermanosTest1() {
        String[] participantes = {
                "Núñez, Óscar",
                "López, Marta" ,
                "Álvarez, Javier" ,
                "López, Juan",
                "Núñez, Pablo",
                "Núñez, María"
        };
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(5, resultado);
    }

    @Test
    void participantesHermanosTest2() {
        String[] participantes = {
                "Méndez, Óscar",
                "López, Marta" ,
                "Álvarez, Javier",
                "López, Juan",
                "Núñez, Pablo",
                "Núñez, María"
        };
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(4, resultado);
    }

    @Test
    void participantesHermanosTest3() {
        String[] participantes = {
                "Núñez, Óscar",
                "López, Marta" ,
                "Álvarez, Javier" ,
                "López, Juan",
                "Núñez, Pablo",
                "Méndez, María"
        };
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(4, resultado);
    }

    @Test
    void participantesHermanosTest4() {
        String[] participantes = {
                "Núñez, Óscar",
                "López, Marta" ,
                "Álvarez, Javier" ,
                "Gómez, Juan",
                "Núñez, Pablo",
                "Núñez, María"
        };
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(3, resultado);
    }

    @Test
    void participantesHermanosTest5() {
        String[] participantes = {
                "Núñez, Óscar",
                "Núñez, Marta" ,
                "Álvarez, Javier" ,
                "Núñez, Juan",
                "Núñez, Pablo",
                "Núñez, María"
        };
        Arrays.sort(participantes);
        int resultado = participantesHermanos(participantes);
        assertEquals(5, resultado);
    }

    @Test
    void participantesHermanos_DeberiaManejarArrayVacio() {
        String[] participantes = {};
        int resultado = participantesHermanos(participantes);
        assertEquals(0, resultado);
    }
}
