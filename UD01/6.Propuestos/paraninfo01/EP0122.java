package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza.
 * Descripción: La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en cuenta la longitud en centimetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm.
 * 
 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.
 */
public class EP0122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa y solicitamos datos a los usuarios.
        System.out.println("Este programa convierte metros (con o sin decimales) en centímetros (sin decimales)");
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("A continuación introduzca la longitud (en metros): ");
        double longitud = sc.nextDouble();

        // Convertimos y quitamos decimales.
        double intermedio = longitud * 100;
        int resultado = (int) intermedio;

        // Mostramos la salida.
        System.out.println("Se contabilizan " + resultado + " centímetros.");

        sc.close();
    }
}
