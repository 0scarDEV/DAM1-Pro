package herenciaejercicios.EP0825_27_28;
import java.util.Objects;
/* Óscar Fernández Pastoriza */
public class Suceso extends Punto3D {
    /* EP0828. Implementa la clase Suceso, que hereda de Punto3D. Un suceso está caracterizado de forma única por el lugar y el instante en que ocurre (el atributo tiempo de tipo int). Añade un atributo descripcion de tipo String. Implementa el método equals() para sucesos. */
    public Suceso(int x, int y, int z) {
        super(x, y, z);
    }
    int tiempo;
    String descripcion;
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Suceso suceso = (Suceso) o;
        return tiempo == suceso.tiempo && Objects.equals(descripcion, suceso.descripcion);
    }
}