package coleccionesejercicios.EP1217;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class Cola<T> {
    /* EP1217. Implementa la clase Cola genérica utilizando un objeto ArrayList para guardar los elementos. */
    private List<T> cola = new ArrayList<T>();
    public void encolar(T object) {
        cola.add(object);
    }
    public void desencolar(T object) {
        cola.remove(object);
    }
}