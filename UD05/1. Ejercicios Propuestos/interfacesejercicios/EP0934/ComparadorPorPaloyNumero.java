package interfacesejercicios.EP0934;
import java.util.Comparator;
public class ComparadorPorPaloyNumero implements Comparator<Carta> {
    @Override public int compare(Carta o1, Carta o2) {
        int res = o1.palo.compareTo(o2.palo);
        if (res == 0) {
            res = o1.num - o2.num;
        }
        return res;
    }
}
