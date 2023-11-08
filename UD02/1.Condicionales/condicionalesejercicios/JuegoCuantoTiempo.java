package condicionalesejercicios;

import java.time.*;
import java.util.Scanner;

public class JuegoCuantoTiempo {
    /* Óscar Fernández Pastoriza
     * JuegoCuantoTiempo. Realiza un juego que solicite al usuario pulsar Enter después de trasncurrir un número aleatorio de segundos, que se mostrará al usuario, elegido al azar entre un número mínimo, por ejemplo 5, y un número máximo, por ejemplo 30. Los límites mínimo y máximo de segundos se definirán como constantes.  
     * El programa contará el tiempo que el usuario ha tardado en pulsar Enter y responderá con un mensaje diciendo si acertó en el momento correcto o, en caso contrario, cuántos segundos, de adelanto o de retraso, se desvió. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXIMO = 30;
        final int MINIMO = 5;
        int numSegundos;

        int rango = MAXIMO - MINIMO + 1; // Calcula el rango de números posibles
        numSegundos = (int) (Math.random() * rango) + MINIMO; // Ajusta el rango y convierte en entero

        System.out.println("Tras transcurrir " + numSegundos + " segundos pulsa ENTER.");
        LocalTime tiempoInicio = LocalTime.now();
        // Dejamos que el usuario pulse ENTER.
        sc.nextLine();
        LocalTime tiempoFin = LocalTime.now();
        sc.close();

        Duration tiempoENTER = Duration.between(tiempoInicio, tiempoFin);
        long segundosTranscurridos = tiempoENTER.getSeconds() % 60;
        int tiempoDesvío = (int)(segundosTranscurridos - numSegundos);

        if (segundosTranscurridos == numSegundos) {
            System.out.println("Acertaste en el momento correcto!");
        } else {
            if (tiempoDesvío < 0) {
                System.out.println("Te adelantaste " + Math.abs(tiempoDesvío) + " segundos.");
            } else {
                System.out.println("Te atrasaste " + tiempoDesvío + " segundos.");
            }
        }
    }
}