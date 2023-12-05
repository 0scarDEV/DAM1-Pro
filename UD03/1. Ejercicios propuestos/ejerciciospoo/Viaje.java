package ejerciciospoo;
import java.time.*;
/* Óscar Fernández Pastoriza
    Implementa la clase Viaje que representa un viaje compartido ofrecido por un conductor, que será un usuario (clase User) previamente creado, y que saldrá en una fecha y a una hora determinada desde un PuntoGeografico de salida hasta otro de destino. En cada viaje se registrarán también el número de plazas de pasajeros ofrecidas por el conductor.
    Crea al menos un constructor que permita crear un viaje con todos sus atributos.
    Crea getters y setters si es necesario.
    Crea un método mostrar que presente detalladamente y con claridad toda la información relativa a un viaje.
    Redefine el método toString() para que devuelva una cadena con el siguiente formato:
    dd/mm/aaaa hh:mm - conductor - PuntoSalida >> PuntoLlegada
 */
public class Viaje {
    private User conductor;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;
    private PuntoGeografico puntoSalida;
    private PuntoGeografico puntoDestino;

    public Viaje(User conductor, LocalDate fechaSalida, LocalTime horaSalida, PuntoGeografico puntoSalida, PuntoGeografico puntoDestino) {
        this.conductor = conductor;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.puntoSalida = puntoSalida;
        this.puntoDestino = puntoDestino;
    }
    public void mostrar(){
        System.out.println("Conductor: " + conductor);
        System.out.println("Fecha y hora de salida: " + fechaSalida + " - " + horaSalida);
        System.out.println("Lugar de salida: " + puntoSalida.getLatitud() + "," + puntoSalida.getLongitud());
        System.out.println("Lugar de destino: " + puntoDestino.getLatitud() + "," + puntoDestino.getLongitud());
    }
    @Override public String toString(){
        return fechaSalida + " " + horaSalida + " - " + conductor + " - " + puntoSalida + " >> " + puntoSalida;
    }
    public String urlOsrmJson(){
        return "https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=" + puntoSalida.getLatitud() + "&lon=" + puntoSalida.getLongitud();
    }
}