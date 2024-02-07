package arraysejercicios;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EjArrays07. Leer N alturas y calcular la altura media. Calcular cuántas hay superiores a la media y cuántas inferiores. */
public class EjArrays07 {
    public static void main(String[] args) {
        double[] altura = new double[0];
        double entrada;
        int i = 0;
        int alturasSuperiores = 0, alturasInferiores = 0;
        double sumando = 0, alturaMedia = 0;

        System.out.println("Introduce alturas, puede tener decimales, para salir introduce -1.");
        entrada = new Scanner(System.in).nextDouble();
        while (entrada != -1) {
            altura = Arrays.copyOf(altura,altura.length + 1);
            altura[i] = entrada;
            sumando += altura[i];
            i++;
            entrada = new Scanner(System.in).nextDouble();
        }
        // Media
        alturaMedia = sumando / altura.length;

        // Recorremos las alturas y vemos cuantas son superiores a la media y cuantas inferiores.
        for (int j = 0; j < altura.length; j++){
            if (altura[j] >= alturaMedia) {
                alturasSuperiores++;
            } else {
                alturasInferiores++;
            }
        }

        System.out.println("La media de las alturas introducidas es: " + alturaMedia);
        System.out.println("Hay " + alturasSuperiores + " alturas superiores a la altura media y " + alturasInferiores + " inferiores a la media.");
    }
}
