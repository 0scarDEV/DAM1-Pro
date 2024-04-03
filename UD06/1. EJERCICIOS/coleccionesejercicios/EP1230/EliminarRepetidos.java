package coleccionesejercicios.EP1230;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* Óscar Fernández Pastoriza */
public class EliminarRepetidos {
    /*  EP1230. Implementa una función
     *  <T> List<T> eliminaRepetidos(List<T> lista)
     * a la que se pase una lista de objetos y devuelva una copia sin elementos repetidos.
    */
    public static void main(String[] args) {
        List<Integer> listaConRepetidos = new ArrayList<>();
        listaConRepetidos.add(5);
        listaConRepetidos.add(5);
        listaConRepetidos.add(5);
        listaConRepetidos.add(8);
        System.out.println(listaConRepetidos);
        System.out.println(eliminaRepetidos(listaConRepetidos));
    }
    static <T> List<T> eliminaRepetidos(List<T> lista) {
        Set<T> listaAux = new LinkedHashSet<>(lista);
        return new ArrayList<>(listaAux);
    }
}
