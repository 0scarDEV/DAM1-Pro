package coleccionesejercicios.EP1231;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class Pila<T> extends ArrayList {
    /* EP1231. Implementa las clases Cola y Pila genéricas heredando de ArrayList. */
    List<T> lista = new ArrayList<>();
    public boolean apilar(T t) {
        if (!lista.isEmpty()) {
            lista.addLast(t);
            return true;
        }
        return false;
    }
    public T desapilar() {
        if (!lista.isEmpty()) {
            T last = lista.getLast();
            lista.removeLast();
            return last;
        }
        return null;
    }
}