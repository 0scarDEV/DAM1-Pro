package arraysejercicios;
import java.util.Arrays;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * EjArrays03. Leer por teclado la nota de los alumnos de una clase y calcular la nota media del grupo. Mostrar los alumnos con notas superiores a la media.
 */
public class EjArrays03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, sumatorio = 0, i = 0, j = 0;
        int[] notas = new int[0], notasSuperioresMedia = new int[0];

        // Leemos la nota de los alumnos.
        do {
            i++;
            notas = Arrays.copyOf(notas, notas.length + 1);
            sumatorio += entrada;
            entrada = sc.nextInt();
            notas[i - 1] = entrada;
        } while(entrada != -1);

        notas = Arrays.copyOf(notas, notas.length - 1); // Quitamos el valor "-1" del array
        sc.close();

        // Calculamos la media
        int media = sumatorio / notas.length;
        System.out.println(media);

        // Recorremos el array y vemos qué notas son superiores a la media.
        for (i = 0; i < notas.length; i++){
            if (notas[i] > media){
                notasSuperioresMedia = Arrays.copyOf(notasSuperioresMedia, notasSuperioresMedia.length + 1);
                notasSuperioresMedia[j] = notas[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(notas));
        System.out.println("Notas superiores a la media: " + Arrays.toString(notasSuperioresMedia));
    }
}