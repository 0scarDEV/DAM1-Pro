package coleccionesejercicios.EP1224;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class fusionListas {
    /* EP1224. Implementa una función a la que se le pasen dos listas de enteros ordenadas en sentido creciente y nos devuelva una única lista, también ordenada, fusión de las dos anteriores. Desarrolla el algoritmo de forma no destructiva, es decir, que las listas utilizadas como parámetros de entrada se mantengan intactas. */
    static List<Integer> fusionar(List<Integer> list1, List<Integer> list2) {
        List<Integer> listaRes;

        listaRes = new ArrayList<>(list1);
        listaRes.addAll(list1.size(), list2);
        listaRes.sort((a, b) -> a - b);

        return listaRes;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list2.add(4);
        list2.add(3);

        List<Integer> listRes = fusionar(list1, list2);
        System.out.println(listRes);
    }
}