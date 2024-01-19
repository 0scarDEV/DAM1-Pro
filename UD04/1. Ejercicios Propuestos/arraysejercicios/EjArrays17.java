package arraysejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
 * EjArrays17. Crea una función que determine si una matriz es simétrica. */
public class EjArrays17 {
    public static void main(String[] args) {
        int[][] matrizSimetrica = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        System.out.println(esSimetrica(matrizSimetrica));
    }
    public static boolean esSimetrica(int[][] matriz) {
        boolean res = false;
        if (UtilMatrices.esCuadrada(matriz)) {
            if (Arrays.deepEquals(matriz, UtilMatrices.traspuesta(matriz))) {
                res = true;
            }
        }
        return res;
    }
}