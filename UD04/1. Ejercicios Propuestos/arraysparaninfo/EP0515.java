package arraysparaninfo;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
* EP0515. Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno que se encuentra en una posición dada (que el usuario introduce por teclado).*/
public class EP0515 {
    public static void main(String[] args) {
        int[][] notas = new int[5][3];
        int[] notasMediasAlumno = new int[5];
        int sumando;

        System.out.println("Introduce ");
        // Recolectamos las notas
        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = new Scanner(System.in).nextInt();
            }
        }

        // Calcular la nota media de cada trimestre
        for (int i = 0; i < notas[0].length; i++) {
            sumando = 0;
            for (int j = 0; j < notas.length; j++){
                sumando += notas[j][i];
            }
            System.out.println("La nota media del trimestre " + (i + 1) + " es: " + sumando / notas[0].length);
        }

        // Calcular la nota media de cada alumno
        for (int i = 0; i < notas.length; i++) {
            sumando = 0;
            for (int j = 0; j < notas[0].length; j++){
                sumando += notas[i][j];
            }
            notasMediasAlumno[i] = sumando / notas[0].length;
        }

        // Mostrar la nota media del alumno deseado.
        System.out.println("Introduce a continuación el número del alumno del que desea conocer su nota media: ");
        int numero = new Scanner(System.in).nextInt();
        System.out.println(notasMediasAlumno[numero - 1]);
    }
}