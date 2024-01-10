package arraysejercicios;
/* Óscar Fernández Pastoriza
 * EjArrays16. Crea una función que calcule el producto de dos matrices.
*/
public class EjArrays16 {
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
}