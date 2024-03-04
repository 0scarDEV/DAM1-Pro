package interfacesejercicios.EP0928b_29_30;
import java.util.Comparator;
public class ComparadorMinutos implements Comparator<Jornada> {
    @Override
    public int compare(Jornada o1, Jornada o2) {
        return o1.minutosTrabajados() - o2.minutosTrabajados();
    }
}
