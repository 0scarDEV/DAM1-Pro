package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
*   - El número de hormigas capturadas (6 patas).
*   - El número de arañas capturadas (8 patas).
*   - El número de cochinillas capturadas (14 patas).
* La aplicación debe mostrar el número total de patas.
 */
public class EP0118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa contabiliza el número de patas de insectos.");
        System.out.println("---------------------------------------------------------");

        System.out.print("A continuación introduzca el número de hormigas capturadas: ");
        int hormigas = sc.nextInt();

        System.out.print("A continuación introduzca el número de arañas capturadas: ");
        int arañas = sc.nextInt();

        System.out.print("A continuación introduzca el número de cochinillas capturadas: ");
        int cochinillas = sc.nextInt();

        // Hacemos los cálculos
        int patasHormigas = hormigas * 6;
        int patasArañas = arañas * 8;
        int patasCochinillas = cochinillas * 14;

        // Hacemos el cálculo final y mostramos la solución:
        int resultado = patasArañas + patasCochinillas + patasHormigas;
        System.out.println("Entre hormigas, arañas y cochinillas has recopilado " + resultado + " patas de insectos.");

        sc.close();
    }
}
