package otrosejercicios;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos.
 */
public class EP0124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa pedimos los datos al usuario.
        System.out.println("Este programa calcula los segundos en las horas, minutos y segundos introducidos.");
        System.out.println("---------------------------------------------------------------------------------------------");
        
        System.out.print("Introduce a continuación una cantidad de horas: ");
        double horas = sc.nextDouble();
        
        System.out.print("Introduce a continuación una cantidad de minutos: ");
        double minutos = sc.nextDouble();
        
        System.out.print("Introduce a continuación una cantidad de segundos: ");
        double segundos = sc.nextDouble();

        // OPERACIONES:
        double horasAsegundos = horas * 3600;
        double minutosAsegundos = minutos * 60;
        double resultado = horasAsegundos + minutosAsegundos + segundos;

        // Mostramos los datos:
        System.out.println("Tras aplicar la conversión quedan: " + resultado + " segundos.");

        sc.close();
    }
}
