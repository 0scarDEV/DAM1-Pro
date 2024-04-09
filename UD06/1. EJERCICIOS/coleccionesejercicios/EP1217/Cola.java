package coleccionesejercicios.EP1217;
import java.util.ArrayList;
import java.util.List;
/* �scar Fern�ndez Pastoriza */
public class Cola<T> {
    /* EP1217. Implementa la clase Cola gen�rica utilizando un objeto ArrayList para guardar los elementos. */
    private List<T> cola = new ArrayList<T>();
    public void encolar(T object) {
        cola.add(object);
    }
    public void desencolar(T object) {
        cola.remove(object);
    }
    public T desencolar() {
        return cola.removeLast();
    }
    public int size() {
        return cola.size();
    }
}