package buclesejercicios;

import java.util.Scanner;

public class MayorMenorNNumeros {
    /* Óscar Fernández Pastoriza */
    /* MayorMenorNNumeros. Diseña una aplicación que muestre el mayor y menor número entero de un conjunto indeterminado de números positivos introducidos por teclado. El programa terminará al introducir un 0 o un número negativo. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido, numMaximo = 0, numMinimo;
        System.out.println("El programa terminará al introducir un 0 o un número negativo. Introduce números positivos: ");
        numeroIntroducido = sc.nextInt();
        numMinimo = numeroIntroducido;

        while (numeroIntroducido > 0) {
            numeroIntroducido = sc.nextInt();
            if (numeroIntroducido > numMaximo) {
                numMaximo = numeroIntroducido;
            } else if (numeroIntroducido < numMinimo && numeroIntroducido > 0) {
                numMinimo = numeroIntroducido;
            }
        }

        if (numMaximo != 0) {
            System.out.println("El mayor número introducido por teclado es " + numMaximo + " y el menor número es " + numMinimo);
        } else {
            System.out.println("No has introducido ningún número válido.");
        }
        sc.close();
    }
}