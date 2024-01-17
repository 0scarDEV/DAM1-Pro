package arraysejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
 * EjArrays04. Guardar en un array los 20 primeros números pares.
 */
public class EjArrays04 {
    public static void main(String[] args) {
        final int NUM_PARES_DESEADOS = 20;
        final int NUM_MAX = NUM_PARES_DESEADOS * 2;

        int[] numPares = new int[NUM_PARES_DESEADOS];
        int j = 0;

        // Recorremos todos los números enteros de dos en dos.
        for (int i = 0; i < NUM_MAX; i+=2){
            // Almacenamos los números pares en la posición J del array numPares.
            numPares[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(numPares));
    }
}