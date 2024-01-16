package arraysparaninfo;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EP0514. El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1
Una vez terminada la entrada de datos, muestra la siguiente información:
 * Todos los sueldos introducidos ordenados de forma decreciente.
 * El sueldo máximo y mínimo.
 * La media de los sueldos.*/
public class EP0514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sueldos = new double[0];
        double entrada;
        int  i = 0;

        System.out.println("Este programa recogerá los sueldos de los habitantes del municipio hasta que se introduzca -1.");

        // Recogemos los datos.
         do {
            entrada = sc.nextDouble();
            if (entrada != -1) {
                sueldos = Arrays.copyOf(sueldos, sueldos.length + 1);
                sueldos[i] = entrada;
                i++;
            }
         } while (entrada != -1);

        // Mostramos todos los sueldos introducidos ordenados de forma decreciente.
        double[] sueldosDecreciente = sortInvertido(sueldos);
        System.out.println(Arrays.toString(sueldosDecreciente));

        // Mostramos el máximo y el mínimo
        double[] maxMin = calcularMaxMinArray(sueldos);
        System.out.println("El sueldo mínimo es: " + maxMin[0]);
        System.out.println("El sueldo máximo es: " + maxMin[1]);

        // Mostramos la media de los sueldos.
        System.out.println("La media de los salarios es: " + calcularMedia(sueldos));
    }

    public static double[] sortInvertido(double[] t){
        // Variables
        double[] arrayInvertido = new double[t.length];
        int j = 0;

        // Ordenamos el array
        Arrays.sort(t);

        // Creamos un array invertido
        for (int i = t.length -1; i >= 0; i--){
            arrayInvertido[j] = t[i];
            j++;
        }

        return arrayInvertido;
    }

    // Este método devuelve un array con el valor mínimo en la posición 0 y el valor máximo en la posición 1.
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