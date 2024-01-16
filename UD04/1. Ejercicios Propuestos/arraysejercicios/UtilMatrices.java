package arraysejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class UtilMatrices {
    public static Boolean esMatrizValida(int[][] t){
        return t != null && t.length > 0 && t[0].length > 0;
    }
    public static int[][] traspuesta(int[][] t){
        int[][] tr = null;

        if (esMatrizValida(t)){
            tr = new int[t[0].length][t.length];
            for (int i = 0; i < tr.length; i++){
                for(int j = 0; j < tr[0].length; j++){
                    tr[i][j] = t[j][i];
                }
            }
        }

        return tr;
    }
    public static Boolean esCuadrada(int[][] t){
        Boolean res = null;
        if (esMatrizValida(t)) {
            res = t.length == t[0].length;
        }
        return res;
    }

    public static int[][] multiplicar(int[][] t1, int[][] t2){
        int[][] tr = null;
        // Comprobamos que el número de columnas de t1 sea igual que el número de filas de t2. También que ninguna de las dos matrices recibidas sean nulas.
        if (t1 != null && t2 != null && t1[0] != null && t2[0] != null && t1[0].length == t2.length){
            // Creamos la tabla resultante
            tr = new int[t1.length][t2[0].length];
            // Recorremos uno a uno los elementos de las matrices.
            for (int i = 0; i < tr.length; i++){            // Horizontal
                for (int j = 0; j < tr[i].length; j++){     // vertical
                    // Asignar valor a la casilla
                    for (int r = 0; r < t2.length; r++){    // horinzotal * vertical
                        // SUMATORIO
                        tr[i][j] += t1[i][r] * t2[r][j];
                    }
                }
            }
        }
        return tr;
    }

    public static int[][] matrizIdentidad(int n){
        int[][] matrizIdentidad = null;
        Arrays.fill(matrizIdentidad, 0);

        for (int i = 0; i < n; i++){
            matrizIdentidad[i][i] = 1;
        }

        return matrizIdentidad;
    }
}