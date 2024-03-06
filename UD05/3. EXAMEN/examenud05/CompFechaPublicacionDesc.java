package examenud05;
import java.util.Comparator;

public class CompFechaPublicacionDesc implements Comparator  {
    @Override public int compare(Object o1, Object o2) {
        Objeto ob1 = (Objeto) o1;
        Objeto ob2 = (Objeto) o2;
        return ob2.fechaHoraPublicacion.compareTo(ob1.fechaHoraPublicacion);
    }
}
