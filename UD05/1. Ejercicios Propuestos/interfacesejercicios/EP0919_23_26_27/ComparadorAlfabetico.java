package interfacesejercicios.EP0919_23_26_27;
import java.util.Comparator;
public class ComparadorAlfabetico implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.nombre.compareTo(o2.nombre);
    }
}