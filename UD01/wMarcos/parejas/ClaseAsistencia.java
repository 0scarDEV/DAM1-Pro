package parejas;

import java.util.Scanner;

public class ClaseAsistencia {
    public static void main(String[] args) {
/*
 * Driver: Óscar Fernández
 * CoDriver: Marcos Costoya
 */
        final String nombreModulo = "Programacion"; 
        final int horas = 240; 

        int sesiones = (horas * 60) / 50;
        double limiteApercibimiento = Math.round(sesiones * 6 / 100);
        double limiteEvaluacion = Math.round(sesiones * 10 / 100); 

        Scanner sc = new Scanner(System.in);

        int faltas;
        System.out.print("Introduce el numero de faltas: ");
        faltas = sc.nextInt();

        boolean apercibimiento = faltas >= limiteApercibimiento;
        boolean evaluacionNoContinua = faltas >= limiteEvaluacion;

        System.out.println("Para el módulo de " + nombreModulo + " de DAM1 tienes:");
        System.out.println("Tiene apercibimiento? " + apercibimiento);
        System.out.println("Pierdes evaluación continua? " + evaluacionNoContinua);
        
        boolean problema = apercibimiento || evaluacionNoContinua;
        System.out.println("¿Tienes algún problema? " + problema);

        sc.close();

// Para modificar el programa que muestre datos de otros módulos habría que solicitar al usuario que inserte los datos de las dos constantes actuales.
    }
}