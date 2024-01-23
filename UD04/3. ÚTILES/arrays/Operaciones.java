package arrays;

public class Operaciones {
    /**
     * @return Devuelve un array con el valor mínimo en la posición 0 y el valor máximo en la posición 1.
     */
    public static double[] calcularMaxMinArray(double[] t) {
        double max, min;
        // Calculamos el máximo y mínimo.
        max = t[0];
        min = t[0];
        for (int j = 0; j < t.length; j++){
            if (t[j] > max){
                max = t[j];
            } else if (t[j] < min) {
                min = t[j];
            }
        }

        // Almacenamos en un array el máximo y el mínimo.
        double[] maxMin = new double[2];
        maxMin[0] = min;
        maxMin[1] = max;

        // Devolvemos el array
        return maxMin;
    }

    public static double calcularMedia(double[] t) {
        double sumando = 0;
        for (int i = 0; i < t.length; i++){
            sumando += t[i];
        }
        return sumando / t.length;
    }
}
