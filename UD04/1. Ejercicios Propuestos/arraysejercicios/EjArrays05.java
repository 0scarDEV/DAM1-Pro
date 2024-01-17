package arraysejercicios;
/* Óscar Fernández Pastoriza
 * EjArrays05. Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros. */
public class EjArrays05 {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 0, -1, -2, -3, -4, 0};
        int numPos = 0, numNeg = 0, numCeros = 0;

        for (int i = 0; i < t.length; i++){
            if (t[i] > 0) {
                numPos++;
            } else if (t[i] < 0) {
                numNeg++;
            } else {
                numCeros++;
            }
        }

        System.out.println("Hay " + numPos + " números positivos.");
        System.out.println("Hay " + numNeg + " números negativos.");
        System.out.println("Hay " + numCeros + " ceros.");
    }
}