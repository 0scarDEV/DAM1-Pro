package ejerciciostime;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * Cronometro. 
 * Escribe un programa que ofrezca al usuario la posibilidad de iniciar un cronómetro pulsando enter. 
 * Una vez iniciado, el programa quedará a la espera de la entrada del usuario.
 * Cuando el usuario pulse ENTER de nuevo, el programa mostrará el tiempo transcurrido desde el inicio del cronómetro, en minutos y segundos.      
 * También mostrará el tiempo parcial desde la última vez que se pulsó ENTER.
 * El programa terminará cuando el usuario introduce un cero (0).
 */
public class Cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tecla;
        LocalDateTime ultVezEnter = LocalDateTime.now(), inicio, ahora;
        boolean flag = false;

        System.out.println("Presiona un ENTER para comenzar a cronometrar. Recuerda que para terminar la cuenta del cronómetro debes introducir un 0.");
        tecla = sc.nextLine();
        inicio = LocalDateTime.now();
        do {
            tecla = sc.nextLine();
            ahora = LocalDateTime.now();
            if (tecla == "") {
                Duration desdeInicio = Duration.between(inicio, ahora);
                long secTranscurridosDesdeInicio = desdeInicio.getSeconds();
                long minutosDesdeInicio = secTranscurridosDesdeInicio / 60;
                long segundosDesdeInicio = secTranscurridosDesdeInicio % 60;
                System.out.println("Tiempo transcurrido desde el inicio del cronómetro: " + minutosDesdeInicio + " minutos y " + segundosDesdeInicio + " segundos.");

                Duration desdeUltVez = Duration.between(ultVezEnter, ahora);
                long secTranscurridosDesdeUltVez = desdeUltVez.getSeconds();
                long minutosDesdeUltVez = secTranscurridosDesdeUltVez / 60;
                long segundosDesdeUltVez = secTranscurridosDesdeUltVez % 60;
                System.out.println("Tiempo desde la última vez que se pulsó ENTER: " + minutosDesdeUltVez + " minutos y " + segundosDesdeUltVez + " segundos.");

                ultVezEnter = LocalDateTime.now();
            }
            if (tecla.equals("0")) {
                flag = true;
            }
        } while (flag == false);
        sc.close();
    }
}