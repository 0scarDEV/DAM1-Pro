package coleccionesejercicios.EP1232;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class ClonarLista {
    /* EP1232. Implementa la función
    *   static <E> List<E> clonaLista (List<E>)
    *  que realice una copia exacta de una lista. */
    static <E> List<E> clonaLista (List<E> lista) {
        return new ArrayList<>(lista);
    }
}
