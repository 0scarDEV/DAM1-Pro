package clasesapuntes.E0710.Personal;
import java.time.LocalDate;

public class JefeEstacion {
    String nombre;
    final String DNI;
    LocalDate fechaNombramiento;

    public JefeEstacion(String nombre, String dni, LocalDate fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = dni;
        this.fechaNombramiento = fechaNombramiento;
    }


}