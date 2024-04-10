package coleccionesejercicios;
import java.util.*;

/* �scar Fern�ndez Pastoriza */
public class Util {
    public static <U> U[] add(U e, U[] t) {
        U[] aux = Arrays.copyOf(t, t.length + 1);
        aux[aux.length - 1] = e;
        return aux;
    }
    public static <U> boolean buscar(U e, U[] t) {
        for (U ei : t){
            if (ei.equals(e)){
                return true;
            }
        }
        return false;
    }
    public static <U> U[] concatTablas(U[] t1, U[] t2) {
        U[] tRes = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, tRes, t1.length, t2.length);
        return tRes;
    }
    static <T> List<T> eliminaRepetidos(List<T> lista) {
        Set<T> listaAux = new LinkedHashSet<>(lista);
        return new ArrayList<>(listaAux);
    }
    static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        List<Character> cadRes = new ArrayList<>(cad1);
        cadRes.addAll(cad2);
        return cadRes;
    }
}
