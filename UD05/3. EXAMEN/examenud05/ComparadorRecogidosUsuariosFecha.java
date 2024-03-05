package examenud05;
import java.util.Comparator;
/* Óscar Fernández Pastoriza */
public class ComparadorRecogidosUsuariosFecha implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Objeto ob1 = (Objeto) o1;
        Objeto ob2 = (Objeto) o2;
        Boolean recogido = ob1.recogido;
        Boolean recogido2 = ob2.recogido;
        int res = recogido.compareTo(recogido2);
        if (res == 0) {
            if (ob1.usuarioPublicacion == null || ob2.usuarioPublicacion == null) {
                res = -1;
            } else {
                res = -(new ComparadorFechaPublicacion().compare(ob1, ob2));
            }
        }
        return res;
    }
}
