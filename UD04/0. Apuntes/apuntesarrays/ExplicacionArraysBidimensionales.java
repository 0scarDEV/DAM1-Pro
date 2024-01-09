package apuntesarrays;

import java.util.Arrays;

/* Óscar Fernández Pastoriza */
public class ExplicacionArraysBidimensionales {
    /*  */
    public static void main(String[] args) {

        int[][] datos = new int[5][5]; // Reservamos 25 huecos.

        // Recorremos las filas una a una.
        for (int i = 0; i < datos.length; i++){
            // Recorremos las columnas una a una.
            for (int j = 0; j < datos[0].length; j++){
                datos[i][j] = (int)(Math.random()*10);
            }
        }

        // El método deepToString() de la clase Arrays muestra el contenido de un array nDimensional.
        System.out.println(Arrays.deepToString(datos));

        mostrarTabla(datos);
    }
    private static void mostrarTabla(int[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}