package operadores;

import java.util.Scanner;

public class E0113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notaTrim1;
        System.out.println("Introduce a continuación la nota del primer trimestre del cuso:");
        notaTrim1 = sc.nextDouble();

        double notaTrim2;
        System.out.println("Introduce a continuación la nota del segundo trimestre del cuso:");
        notaTrim2 = sc.nextDouble();

        double notaTrim3;
        System.out.println("Introduce a continuación la nota del tercer trimestre del cuso:");
        notaTrim3 = sc.nextDouble();

        double notaBoletin = Math.round((notaTrim1+notaTrim2+notaTrim3)/3);
        double notaExpediente = (notaTrim1+notaTrim2+notaTrim3)/3;

        System.out.println("La nota media de los tres trimestres se mostrará en el Boletín de notas como un: " + notaBoletin);
        System.out.println("La nota media de los tres trimestres se mostrará en tu expediente académico como: " + notaExpediente);

        sc.close();
    }
}
