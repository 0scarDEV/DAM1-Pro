package interfacesejercicios.EP0931;
import java.time.Duration;
import java.time.LocalDateTime;
/* Óscar Fernández Pastoriza */
public class Llamada implements Comparable<Llamada> {
    /* EP0931. En una compañía de telecomunicaciones se desean registrar los datos de todas las llamadas de sus clientes. Implementar la clase Llamada, que guardará los siguientes datos: número de teléfono del cliente, número del interlocutor, atributo booleano que indique si la llamada es saliente, fecha y hora del inicio de la llamada y del fin, atributo enumerado que indique la zona del interlocutor (suponer cinco zonas con tarifas distintas) y tabla de constantes con las tarifas de las zonas en céntimos de euro/minuto. En la clase se establecerá un orden natural compuesto basado en el número del teléfono del cliente como primer criterio y en la fecha y hora de inicio como segundo criterio. Asimismo, se implementará un método que devuelva la duración en minutos de la llamada y otro que calcule su coste, si es saliente. Por último, implementar el método toString(), que muestre los dos números de teléfono, la fecha y hora del inicio, la duración y el coste. */
    int numTelefono;
    int numInterlocutor;
    boolean saliente;
    LocalDateTime horaInicio;
    LocalDateTime horaFin;
    static enum Zona {Z1, Z2, Z3, Z4, Z5};
    Zona zona;
    final int[] TARIFAS = {2, 3, 2, 5, 6};
    @Override
    public int compareTo(Llamada o) {
        int res = numTelefono - o.numTelefono;
        if (res == 0) {
            res = horaInicio.compareTo(o.horaInicio);
        }
        return res;
    }
    public int duracionLlamada() {
        return (int) Duration.between(horaInicio, horaFin).toMinutes();
    }
    public int coste() {
        int res = 0;
        if (saliente) {
            switch (zona) {
                case Z1 -> {
                    res = TARIFAS[0] * duracionLlamada();
                }
                case Z2 -> {
                    res = TARIFAS[1] * duracionLlamada();
                }
                case Z3 -> {
                    res = TARIFAS[2] * duracionLlamada();
                }
                case Z4 -> {
                    res = TARIFAS[3] * duracionLlamada();
                }
                case Z5 -> {
                    res = TARIFAS[4] * duracionLlamada();
                }
            }
        }
        return res;
    }
    @Override public String toString() {
        return  "numTelefono=" + numTelefono +
                ", numInterlocutor=" + numInterlocutor +
                ", horaInicio=" + horaInicio +
                ", duracion=" + duracionLlamada() +
                ", coste=" + coste();
    }
}