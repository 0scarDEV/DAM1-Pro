package examenud05;
import java.util.Comparator;
/* Óscar Fernández Pastoriza */
public class ComparadorFechaPublicacion implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Objeto ob1 = (Objeto) o1;
        Objeto ob2 = (Objeto) o2;
        return ob1.fechaHoraPublicacion.compareTo(ob2.fechaHoraPublicacion);
    }
}
