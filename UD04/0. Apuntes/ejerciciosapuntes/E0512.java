package ejerciciosapuntes;
/* E0512. Crea una tabla bidimensional de longitud 5 x 5 y rellénala de la siguiente forma: el elemento de la posición [n][m] debe contener el valor 10 x n + m. Después se debe mostrar su contenido. */
public class E0512 {
    public static void main(String[] args) {
          // Declaración de variables y constantes
          final int FILAS = 5;
          final int COLUMNAS = 5;

          // Declaración de la matriz
          int matriz[][];

          // Creación de la matriz
          matriz = new int[FILAS][COLUMNAS];

          // Entrada de datos
          for (int i = 0; i < FILAS; i++) {
              for (int j = 0; j < COLUMNAS; j++) {
                // matriz[i][j] = (int)(Math.random()*10);
                matriz[i][j] = 10 * i + j;
              }
          }

          // Salida
          for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
          }
    }
}