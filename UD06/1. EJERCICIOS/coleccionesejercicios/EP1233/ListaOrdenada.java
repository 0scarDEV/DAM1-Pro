package coleccionesejercicios.EP1233;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class ListaOrdenada<E> {
    /* EP1233. Define la clase ListaOrdenada, que almacena una serie de objetos de tipo genérico E, de forma ordenada, pudiéndose repetir. Los elementos se ordenarán según el orden natural de E o bien con el criterio de orden definido en un comparador que se le pasa al constructor. */
    List<E> listaOrdenada;
    Comparator<E> comparador = null;
    public ListaOrdenada() {
        listaOrdenada = new ArrayList<>();
    }
    public ListaOrdenada(Comparator<E> comparador) {
        this.comparador = comparador;
    }
    public void add(E e) {
        listaOrdenada.add(e);
        listaOrdenada.sort(comparador);
    }
    @Override public String toString() {
        return listaOrdenada.toString();
    }
    public static void main(String[] args) {
        ListaOrdenada<Character> prueba = new ListaOrdenada<>();
        prueba.add('a');
        prueba.add('c');
        prueba.add('b');
        prueba.add('2');
        prueba.add('5');
        ListaOrdenada<Integer> pruebaInt = new ListaOrdenada<>();
        pruebaInt.add(1);
        pruebaInt.add(1);
        pruebaInt.add(1);
        pruebaInt.add(-2);
        pruebaInt.add(5);
        System.out.println(prueba);
        System.out.println(pruebaInt);
    }
}