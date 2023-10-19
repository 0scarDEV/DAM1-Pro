package apuntesbucles;

import java.util.Scanner;

public class E0312 {
    // E0312. Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
    public static void main(String[] args) {
        final int NUM_CALIFICACIONES = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca " + NUM_CALIFICACIONES + " notas: ");
        for (int i = 1; i <= NUM_CALIFICACIONES; i++) {
            int calificaciones = sc.nextInt();
            if (calificaciones < 4) {
                System.out.println("Hay suspensos.");
            } else {
                System.out.println("No hay suspensos.");
            }
        }
        sc.close();           
    }
}