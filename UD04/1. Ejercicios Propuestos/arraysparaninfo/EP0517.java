package arraysparaninfo;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
 *  EP0517. Implementa la función: int[] suma(int t[], int numElementos), que crea y devuelve una tabla con las sumas de los numElementos elementos consecutivos de t. Veamos un ejemplo, sea t= [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3, se harán las sumas:

 * 10 + 1 + 5. Igual a 16.
 * 1 + 5 + 8. Igual a 14.
 * 5 + 8 + 9. Igual a 22.
 * 8 + 9 + 2. Igual a 19.

 * Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19]. */
public class EP0517 {
    public static void main(String[] args) {
        int[] t = {10, 1, 5, 8, 9, 2};
        System.out.println(Arrays.toString(suma(t, 3)));
    }
    public static int[] suma(int[] t, int numElementos){
        int[] tr = new int[0];
        int i = 0, sumatorio;
        do {
            sumatorio = 0;
                for (int j = 0; j < numElementos; j++){
                    sumatorio += t[i + j];
                }
                tr = Arrays.copyOf(tr, tr.length + 1);
                tr[i] = sumatorio;
            i++;
        } while (i <= (t.length - numElementos));

        return tr;
    }
}