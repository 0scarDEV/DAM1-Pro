package coleccionesejercicios.EP1228;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class UnirCadenas {
    /* EP1228. Implementa la función uneCadenas, con el siguiente prototipo:
    *   List<Character> uneCadenas(List<Character> cad1, List<Character> cad2)
    * que devuelve una lista con la concatenación de cad1 y cad2. */
    static List<Character> uneCadenas(List<Character> cad1, List<Character> cad2) {
        List<Character> cadRes = new ArrayList<>(cad1);
        cadRes.addAll(cad2);
        return cadRes;
    }
}
