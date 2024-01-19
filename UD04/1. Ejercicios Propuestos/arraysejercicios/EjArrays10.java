package arraysejercicios;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EjArrays10. Escribe un programa en Java que lea una matriz de enteros de 3 filas y 3 columnas del usuario y luego calcule la suma de todos los elementos de la matriz.  */
public class EjArrays10 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int sumando = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = new Scanner(System.in).nextInt();
                sumando += matriz[i][j];
            }
        }
        System.out.println("La suma de todos los elementos es: " + sumando);
    }
}