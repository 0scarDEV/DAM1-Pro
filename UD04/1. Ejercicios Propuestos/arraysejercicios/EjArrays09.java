package arraysejercicios;
import java.util.Arrays;
import java.util.Random;
/* Óscar Fernández Pastoriza
 EjArrays09. Llenar un array con números aleatorios. */
public class EjArrays09 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}