package arraysejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
 * EjArrays15. Crea una función que calcule la suma de dos matrices.  */
public class EjArrays15 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];
        System.out.println(Arrays.deepToString(sumaMatrices(matriz1, matriz2)));
    }
    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] resultado = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }
}