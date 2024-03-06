package examenud05;
import java.util.Comparator;
/* Óscar Fernández Pastoriza */
public class ComparadorFechaRecogidaPublicacion implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Objeto ob1 = (Objeto) o1;
        Objeto ob2 = (Objeto) o2;

        int res;
        if (ob1.fechaHoraRecogida == null || ob2.fechaHoraRecogida == null) {
            res = new ComparadorFechaPublicacion().compare(ob1, ob2);
        } else {
            res = ob1.fechaHoraRecogida.compareTo(ob2.fechaHoraRecogida);
        }
        return res;
    }
}