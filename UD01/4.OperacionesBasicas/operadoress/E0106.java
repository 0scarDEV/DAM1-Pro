package operadoress;

import java.util.Scanner;

public class E0106 {
    public static void main(String[] args) {
        int operando1;
        int operando2;
        double media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a continuación la primera nota: ");
        operando1 = sc.nextInt();

        System.out.print("Introduce a continuación la segunda nota: ");
        operando2 = sc.nextInt();

        media = (operando1 + operando2) / 2.0;
        System.out.println("La media entre " + operando1 + " y " + operando2 + " es " + media);
        
        sc.close();
    }
}
