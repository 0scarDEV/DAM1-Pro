package examenud01;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Autor: Óscar Fernández Pastoriza
 */
public class KilosALibras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0#");
        // A continuación declaramos variables:
        double kilos;
        double libras;

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa lee Kilogramos y convierte a Libras.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Introduce la cantidad de kilos: ");
        kilos = sc.nextDouble();

        // Hacemos las operaciones.
        libras = kilos / 0.453592;
        
        // Mostramos la salida, formateando la salida en libras para que salga con 1 o 2 decimales.
        System.out.println("-----------------------------------------");
        System.out.println(kilos + " kilogramos son " + df.format(libras) + " libras.");

        sc.close();
    }
}
