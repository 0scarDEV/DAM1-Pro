package examenud01;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Autor: Óscar Fernández Pastoriza
 */
public class ComidaEnGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0#");
        // A continuación declaramos variables:
        int personas;
        double importeTotal;
        double cantidadComensal;

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa lee el número de comensales y el precio total y lo divide a partes iguales.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Introduce la cantidad de comensales: ");
        personas = sc.nextInt();

        System.out.print("Introduce el importe total (en euros - *X,##): ");
        importeTotal = sc.nextDouble();

        // Hacemos las operaciones.
        cantidadComensal = importeTotal / personas;
        
        // Mostramos la salida.
        System.out.println("-----------------------------------------");
        System.out.println("Con un importe de " + importeTotal + " cada persona deberá pagar " + df.format(cantidadComensal) + " euros.");

        sc.close();
    }
}
