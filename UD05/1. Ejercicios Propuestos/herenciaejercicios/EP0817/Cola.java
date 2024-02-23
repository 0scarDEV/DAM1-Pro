package herenciaejercicios.EP0817;
import herenciaejercicios.EP0815.Lista;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
* EP0817. Escribe la clase Cola heredando de Lista (ver Actividad EP0718 más arriba). */
public class Cola extends Lista {
    Lista cola = new Lista();
    void encolar(Integer e) {
        cola.addFin(e);
    }
    Integer desencolar() {
        return cola.eliminarEnLista(0);
    }
    void encolarMultiple(Integer e, int nRep){
        for(int i = 0; i < nRep; i++){
            encolar(e);
        }
    }
    Integer[] desencolarTodos(){
        Integer[] elementos = new Integer[0];

        Integer e = desencolar();

        while (e != null) {
            // Guardar e en el array elementos
            elementos = Arrays.copyOf(elementos, elementos.length + 1);
            elementos[elementos.length - 1] = e;

            // Desencolar otro elemento
            e = desencolar();
        }

        return elementos.length > 0 ? elementos : null;
    }
}