package interfacesejercicios.EP0916_17_18_24_25;
import java.util.Comparator;
/* EP0924 - Cómo se podrían ordenar los elementos de la lista de objetos por orden alfabético del nombre de la clase a la que pertenecen? */
public class ComparadorNombre implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String claseO1 = o1.getClass().getSimpleName();
        String claseO2 = o2.getClass().getSimpleName();
        return claseO1.compareTo(claseO2);
    }
}