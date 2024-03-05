package examenud05;
import java.time.LocalDateTime;
/* Óscar Fernández Pastoriza */
public class Ropa extends Objeto {
    String talla;
    public Ropa(String nombre, String descripcion, String ubicacion, User usuarioPublicacion, LocalDateTime fechaHoraPublicacion, User usuarioRecogida, LocalDateTime fechaHoraRecogida, boolean recogido, String talla) {
        super(nombre, descripcion, ubicacion, usuarioPublicacion, fechaHoraPublicacion, usuarioRecogida, fechaHoraRecogida, recogido);
        this.talla = talla;
    }

    @Override public String toString() {
        return nombre + " - Ropa [" +
                "talla=" + talla +
                ']';
    }
}
