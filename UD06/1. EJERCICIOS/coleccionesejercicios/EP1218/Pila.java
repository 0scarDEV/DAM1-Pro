package coleccionesejercicios.EP1218;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class Pila<T> {
    /* EP1218. Implementa la clase Pila genérica utilizando un objeto ArrayList para guardar los elementos. */
    private List<T> pila = new ArrayList<T>();
    public void apilar(T object) {
        pila.add(object);
    }
    public void desapilar(T object) {
        pila.remove(object);
    }
}
