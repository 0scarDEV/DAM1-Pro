package ejerciciostime;
import java.time.LocalTime;
/* Óscar Fernández Pastoriza
 * Desarrolla una aplicación que calcule la duración total de una actividad. La actividad tiene una hora de inicio (LocalTime) y una hora de finalización (LocalTime). El programa debe mostrar la duración total en horas y minutos.
 */
public class DuracionActividad {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(10, 30);
        LocalTime fin = LocalTime.of(12, 45);

        int horasTranscurridas = horasTranscurridas(inicio, fin);
        int minutosTranscurridos = minutosTranscurridos(inicio, fin);

        System.out.println("Han transcurrido " + horasTranscurridas + " y " + minutosTranscurridos + " minutos.");
    }

    static int horasTranscurridas(LocalTime inicio, LocalTime fin) {
        int horaInicio = inicio.getHour();
        int horaFin = fin.getHour();
        int horasTranscurridas = horaFin - horaInicio;
        
        return horasTranscurridas;
    }

    static int minutosTranscurridos(LocalTime inicio, LocalTime fin) {
        int minutoInicio = inicio.getMinute();
        int minutoFin = fin.getMinute();
        
        int minutosTranscurridos = minutoFin - minutoInicio;
        return minutosTranscurridos;
    }
}