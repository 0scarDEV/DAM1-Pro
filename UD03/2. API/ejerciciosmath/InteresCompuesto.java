package ejerciciosmath;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * Solicita al usuario que ingrese la cantidad de dinero inicial, la tasa de interés anual y el número de años. Calcula el monto final utilizando la fórmula del interés compuesto donde:
    P es el principal, o cantidad de dinero inicial.
    r es la tasa de interés anual, debe estar en formato decimal, por lo que si la tasa de interés es del 5%, r sería 0.05.
    n es el número de veces que se compone el interés por año (para los cálculos de este problema suponer una vez al año n=1)
    t es el tiempo en años.
 */
public class InteresCompuesto {
    public static void main(String[] args) {
        double dineroInicial, tasaInteresAnual, interes;
        int anhos;
        final int N  = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el dinero inicial: ");
        dineroInicial = sc.nextDouble();
        System.out.print("Introduzca la tasa de interés anual: ");
        tasaInteresAnual = sc.nextDouble();
        System.out.print("Introduzca el número de años: ");
        anhos = sc.nextInt();

        sc.close();

        interes = dineroInicial * Math.pow(1 + ((tasaInteresAnual / 100) / N), N * anhos);
        System.out.println("Monto final: " + interes);
    }
}