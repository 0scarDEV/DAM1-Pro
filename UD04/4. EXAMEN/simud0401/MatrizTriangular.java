package simud0401;
import simud0401.UtilMatrices;

import java.util.Arrays;

/*Óscar Fernández Pastoriza*/
public class MatrizTriangular {
    public static Boolean esTriangular(int[][] t){
        boolean res = false;
        // Comprobamos que sea una matriz cuadrada
        if (UtilMatrices.esCuadrada(t)) {
            int[] trianguloInferior = new int[1];


            /*Tengo que recorrer todas las posiciones que NO sean la diagonal princial "[n][n]" y comprobar que sean 0, si son 0, devolver TRUE*/
            /* En la fila 0 no hay, en la fila 1 es la posición 0 de la columna, en la fila 2 son las columnas 0 y 1*/

            // Recorremos una a una todas las posiciones inferiores
            for(int i = 0 ; i < t.length; i++){
                for(int j = 0; j < i; j++) {
                    // if (t[i][j])
                    trianguloInferior = Arrays.copyOf(trianguloInferior, trianguloInferior.length + 1);
                    trianguloInferior[j] = t[i][j];
                }
            }

            // Creamos un array con todos los ceros ideales de la matriz
            int[] ceros = new int[3 * (t.length/2)];
            Arrays.fill(ceros, 0);

            // Si las matrices de trianguloInferior y ceros son iguales, entonces es que es matriz triangular
            if (trianguloInferior == ceros){
                res = true;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] t = {{1, 2, 3},
                     {0, 6, 4},
                     {0, 0, 5}};
        System.out.println(Arrays.deepToString(t));
        System.out.println(esTriangular(t));

    }
}