package arraysparaninfo;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
EP0513. Modifica la Actividad de aplicación EP0512 para que la función no modifique la tabla que se pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han desordenado los valores de los elementos. */
public class EP0513 {
    public static void main(String[] args) {
        int[] t = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(desordenar(t)));
    }
    static int[] desordenar(int[] t) {
        for (int i = 0; i < t.length; i++){
            int pos = (int) (Math.random() * t.length);
            int ch = t[i];
            t[i] = t[pos];
            t[pos] = ch;
        }
        return t;
    }
}
