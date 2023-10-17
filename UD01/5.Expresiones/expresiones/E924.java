package expresiones;

import java.util.Scanner;

public class E924 {
    public static void main(String[] args) {
        // Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación un número:");
        int N = (sc.nextInt()) / 10;
        System.out.println("Quitándole la última cifra al número entero N queda: " + N);

        sc.close();
    }
}