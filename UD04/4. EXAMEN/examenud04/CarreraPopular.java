package examenud04;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class CarreraPopular {
    public static void main(String[] args) {
        // Variables
        String entrada = "";
        String[] participantes = new String[0];
        int i = -1;

        // Entrada de datos
        System.out.println("Registra los participantes de la carrera (Formato: Apellidos, Nombre). Para finalizar escribe \"===\"");
        do {
            i++;
            entrada = new Scanner(System.in).nextLine();
            participantes = Arrays.copyOf(participantes, participantes.length + 1);
            participantes[i] = entrada;
        } while (!entrada.equals("==="));

        // Quitamos "===" del Array
        participantes = Arrays.copyOf(participantes, participantes.length -1);

        // Ordenamos el array de manera alfabética
        Arrays.sort(participantes);

        // Mostramos todos los participantes de manera numerada y ordenada
        for (int j = 0; j < participantes.length; j++) {
            System.out.println(j + ". " + participantes[j]);
        }

        System.out.println("Registraste " + i + " participantes.");
        System.out.println("De ellos, " + participantesHermanos(participantes) + " son hermanos.");
    }
    public static int participantesHermanos(String[] participantes) {
        int contador = 0;
        int contadorAux = 0;
        int hermano = 0;
        String[] camposSeparados = new String[2 * participantes.length];
        String[] apellidos = new String[participantes.length];
        // Separamos los apellidos de los participantes del nombre
        for (int i = 0; i < participantes.length; i++) {
            String prueba = String.valueOf(participantes[i]);
            camposSeparados = prueba.split(",");
            apellidos[i] = camposSeparados[0];
        }

        // Comparamos si existe algún otro participante con los mismos apellidos, el bucle siempre que haya un apellido igual (si incluir su misma posición), suma el contador.
        for (int i = 0; i < apellidos.length; i++) {
            for (int j = 0; j < apellidos.length; j++){
                if (i != j) {
                    if (apellidos[i].equalsIgnoreCase(apellidos[j])) {      // Ignore mayúsculas de minúsculas
                        contador++;
                    }
                }
            }
            if (contadorAux == contador) {
                hermano++;
            } else {
                contadorAux = contador;
            }
        }

        return contador - (apellidos.length - hermano);
    }
}