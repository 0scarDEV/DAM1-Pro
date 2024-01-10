package arraysejercicios;
import java.util.Arrays;
import static arraysejercicios.UtilMatrices.esCuadrada;

/* Óscar Fernández Pastoriza
 * EjArrays18. Crea una función que determine si una matriz es ortogonal.
*/
public class EjArrays18 {
    public static Boolean esOrtogonal(int[][] t){
        Boolean res = null;
        if (esCuadrada(t)){
            int[][] traspuesta = UtilMatrices.traspuesta(t);
            int[][] tProducto = UtilMatrices.multiplicar(t, traspuesta);
            int[][] tIdentidad = UtilMatrices.matrizIdentidad(t.length);

            res = Arrays.deepEquals(tProducto, tIdentidad);
        }
        return res;
    }
}