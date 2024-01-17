package arraysparaninfo;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EP0518. Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo. */
public class EP0518 {
    public static void main(String[] args) {
        int[][] matriz = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
        mostrarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Introduce el valor deseado para la posición " + matriz[i][j] + " de la matriz: ");
                int valor = new Scanner(System.in).nextInt();
                matriz[i][j] = valor;
            }
        }
        System.out.println("¿La matriz introducida es una matriz mágica? " + esMatrizMagica(matriz));
    }
    private static void mostrarMatriz(int[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                System.out.print("\t" + t[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean esMatrizMagica(int[][] t){
        return (comprobarSumaFilas(t) && comprobarSumaColumnas(t));
    }
    private static boolean comprobarSumaFilas(int[][] t){
        int sumatorioFila1 = 0, sumatorioFila2 = 0, sumatorioFila3 = 0, sumatorioFila4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[i][j];
                switch (i) {
                    case 0 -> sumatorioFila1 = sumatorio;
                    case 1 -> sumatorioFila2 = sumatorio;
                    case 2 -> sumatorioFila3 = sumatorio;
                    case 3 -> sumatorioFila4 = sumatorio;
                }
            }
        }
        return (sumatorioFila1 == sumatorioFila2 && sumatorioFila2 == sumatorioFila3 && sumatorioFila3 == sumatorioFila4);
    }
    private static boolean comprobarSumaColumnas(int[][] t){
        int sumatorioCol1 = 0, sumatorioCol2 = 0, sumatorioCol3 = 0, sumatorioCol4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[j][i];
                switch (i) {
                    case 0 -> sumatorioCol1 = sumatorio;
                    case 1 -> sumatorioCol2 = sumatorio;
                    case 2 -> sumatorioCol3 = sumatorio;
                    case 3 -> sumatorioCol4 = sumatorio;
                }
            }
        }
        return (sumatorioCol1 == sumatorioCol2 && sumatorioCol2 == sumatorioCol3 && sumatorioCol3 == sumatorioCol4);
    }
}