package coleccionesejercicios.EP1221;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;
/* Óscar Fernández Pastoriza */
public class AppNumAleatoriosEnLista {
    /* EP1221. Implementa una aplicación donde se insertan 20 números enteros aleatorios distintos, menores que 100, en una colección. Deberán guardarse por orden decreciente a medida que se vayan generando, y se mostrará la colección resultante por pantalla. */
    public static void main(String[] args) {
        Comparator<Integer> ordenDecreciente = (a, b) -> b - a;
        TreeSet<Integer> coleccion = new TreeSet<>(ordenDecreciente);

        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            coleccion.add(random.nextInt(100));
        }

        System.out.println(coleccion);
    }
}
