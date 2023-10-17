package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
 */
public class EP0116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa pedimos los datos al usuario.
        System.out.println("Este programa calcula las horas, minutos y segundos hay en el número de segundos introducido.");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.print("Introduce a continuación una cantidad de segundos: ");
        double segundos = sc.nextDouble();

        // OPERACIONES:
        
        int minutosCalc = (int) segundos / 60;         // Pasamos de segundos a minutos
        int segundosSobrantes = (int) segundos % 60;   // Calculamos los segundos que sobran de la operación anterior.
        
        int horasCalc = minutosCalc / 60;        // Pasamos de minutos a horas
        int minutosSobrantes = minutosCalc % 60; // Calculamos los minutos que sobran de la operación anterior.

        // Mostramos los datos:
        System.out.println("Tras aplicar la conversión quedan: " + horasCalc + " horas, " + minutosSobrantes + " minutos y " + segundosSobrantes + " segundos.");

        sc.close();
    }
}
