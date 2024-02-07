package entradaDatosArrays;
import java.util.Arrays;
import java.util.Scanner;
public class mientras {
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
    }
}
