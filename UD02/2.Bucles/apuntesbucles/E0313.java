package apuntesbucles;
import java.util.Scanner;

public class E0313 {
    // E0313. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a 4) y suspensos.
    public static void main(String[] args) {
        final int NUM_NOTAS = 6;
        int aprobados = 0;
        int condicionados = 0;
        int suspensos = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca " + NUM_NOTAS + " notas: ");
        for (int i = 1; i <= NUM_NOTAS; i++) {
            int notas = sc.nextInt();
            switch (notas) {
                case 0, 1, 2, 3:
                    suspensos++;
                case 4:
                    condicionados++;
                case 5, 6, 7, 8, 9, 10:
                    aprobados++;
            }
        }
        sc.close();


        System.out.println("Aprobados: " + aprobados);
        System.out.println("Condicionados: " + condicionados);
        System.out.println("Suspensos: " +   suspensos); 
    }
}