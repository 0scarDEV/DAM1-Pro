package arraysejercicios;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EjArrays02. Leer 10 números enteros por teclado y guardarlos en un array. Calcula y muestra la media de los números que estén en las posiciones pares del array.
 */
public class EjArrays02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUM = 10;
        final int NUM_PARES = NUM / 2;
        int sumaPares = 0, media;
        int[] arrayEnteros = new int[NUM];

        // Leemos 10 números por teclado y los almacenamos en el array.
        for (int i = 0; i < NUM; i++){
            arrayEnteros[i] = sc.nextInt();
        }

        // Sumamos todas las posiciones pares del array.
        for (int i = 0; i < NUM; i+=2){
            sumaPares += arrayEnteros[i];
        }

        media = sumaPares / NUM_PARES;

        System.out.println(media);
        sc.close();
    }
}