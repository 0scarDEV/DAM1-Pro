package interfacesejercicios.EP0919_23_26_27;
import java.util.Comparator;
/*
EP0923. Repetir Actividad de aplicación EP0922 con un orden alfabético de nombres invertido (que empieza por la letra 'z').
 */
public class ComparadorAlfabeticoInverso implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o2.nombre.compareTo(o1.nombre);
    }
}
