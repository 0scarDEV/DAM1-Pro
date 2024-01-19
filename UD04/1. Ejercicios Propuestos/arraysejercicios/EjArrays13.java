package arraysejercicios;

import simud0401.UtilMatrices;

/* Óscar Fernández Pastoriza
 * EjArrays13. Una matriz diagonal es una matriz cuadrada cuyos elementos fuera de la diagonal principal son todos cero.
 * Ejemplo de una matriz de tamaño 3×3:
 * Crea una función que determine si una matriz dada es una matriz diagonal. La función devolverá true si la matriz de números enteros que se le pasa como parámetro es una matriz diagonal, y false en cualquier otro caso. Utiliza el siguiente prototipo para implementar la función:
 * boolean esDiagonal(int[][] t);  */
public class EjArrays13 {
    public static Boolean esDiagonal(int[][] t) {
        boolean esTriangular = false;
        if (UtilMatrices.esCuadrada(t) && t.length >= 2) {
            boolean esTriangularSuperior = true;
            for (int i = 1; i < t.length; i++)
                for (int j = 0; j < i; j++)
                    if (t[i][j] != 0){
                        esTriangularSuperior = false;
                    }


            boolean esTriangularInferior = true;
            for (int i = 0; i < t.length - 1; i++)
                for (int j = i + 1; j < t.length; j++)
                    if (t[i][j] != 0)
                        esTriangularInferior = false;

            esTriangular = esTriangularInferior && esTriangularSuperior;
        }

        return esTriangular;
    }
}