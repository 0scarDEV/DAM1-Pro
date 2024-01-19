package arraysejercicios;
import java.util.Arrays;
public class EjArrays12 {
    public static int[][] matrizIdentidad(int n){
        int[][] matrizIdentidad = null;
        Arrays.fill(matrizIdentidad, 0);

        for (int i = 0; i < n; i++){
            matrizIdentidad[i][i] = 1;
        }

        return matrizIdentidad;
    }
}