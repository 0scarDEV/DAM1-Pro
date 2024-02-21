package examenud04rec;
/* Óscar Fernández Pastoriza */
public class Sumas {
    public static int[] sumas(int t[]) {
        // Si el array es nulo, devolvemos nulo.
        if (t == null) {
            return null;
        }

        int sumatorio = 0, sumaPos = 0, sumaNeg = 0;

        for (int i = 0; i < t.length; i++) {
            sumatorio += t[i];      // Se suman todos los números.
            if (t[i] > 0) {
                sumaPos += t[i];    // Se suman todos los números mayores que 0. El cero no afecta a la suma.
            } else if (t[i] < 0) {
                sumaNeg += t[i];    // Se suman todos los números menores que 0. El cero no afecta a la suma.
            }
        }

        return new int[] {sumatorio, sumaPos, sumaNeg};
    }
}