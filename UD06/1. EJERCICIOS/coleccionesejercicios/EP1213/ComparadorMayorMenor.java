package coleccionesejercicios.EP1213;
import java.util.Comparator;
/* Óscar Fernández Pastoriza */
public class ComparadorMayorMenor implements Comparator<Integer> {
    @Override public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
