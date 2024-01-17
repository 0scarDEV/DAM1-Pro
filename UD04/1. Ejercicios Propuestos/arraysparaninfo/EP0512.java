package arraysparaninfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/* Óscar Fernández Pastoriza
 * EP0512. Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.*/
public class EP0512 {
    public static void main(String[] args) {

        int[] t = {0, 1, 2, 3, 4, 5};
        desordenar(t);
        System.out.println(Arrays.toString(t));

    }
    static void desordenar(int[] t) {
        for (int i = 0; i < t.length; i++){
            int pos = (int) (Math.random() * t.length);
            int ch = t[i];
            t[i] = t[pos];
            t[pos] = ch;
        }
    }
}