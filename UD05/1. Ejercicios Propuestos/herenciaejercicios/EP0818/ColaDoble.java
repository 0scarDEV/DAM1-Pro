package herenciaejercicios.EP0818;
import herenciaejercicios.EP0817.Cola;
/* Óscar Fernández Pastoriza
* EP0818. Diseña la clase ColaDoble, que hereda de Cola para enteros, añadiendo los siguientes métodos:
 * void encolarPrincipio(), que encola un elemento al principio de la cola.
 * Integer desencolarFinal(), que desencola un elemento del final de la cola. */
public class ColaDoble extends Cola {
    Cola colaDoble = new Cola();
    void encolarPrincipio(Integer e) {
        colaDoble.addPrincipio(e);
    }
    Integer desencolarFinal() {
        return colaDoble.eliminarEnLista(colaDoble.numElementos() - 1);
    }
}
