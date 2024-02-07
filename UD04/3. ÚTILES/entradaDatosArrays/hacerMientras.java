package entradaDatosArrays;
import java.util.Arrays;
import java.util.Scanner;
public class hacerMientras {
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
    }
}
