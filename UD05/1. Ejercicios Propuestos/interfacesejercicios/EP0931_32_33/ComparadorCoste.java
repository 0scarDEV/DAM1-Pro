package interfacesejercicios.EP0931_32_33;
import java.util.Comparator;
/* EP0933. Implementar una clase comparadora que ordene las llamadas por coste. Usarla para ordenar la lista de la Actividad de ampliación EP0932 y mostrar el resultado por pantalla. */
public class ComparadorCoste implements Comparator<Llamada> {
    @Override public int compare(Llamada o1, Llamada o2) {
        return o1.coste() - o2.coste();
    }
}
