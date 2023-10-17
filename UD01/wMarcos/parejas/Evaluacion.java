package parejas;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        double nota = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. ¿El programa funciona? Escribe: \n"
                + "4 - Si y funciona \n"
                + "2 - Si, pero no hace lo que debe \n"
                + "0 - No");
        double valorPregunta1 = sc.nextDouble();
        
        System.out.println("2. ¿El programa funciona y es eficiente? Escribe: \n"
                + "1 - Si. \n"
                + "0,5 - Regular \n"
                + "0 - No");
        double valorPregunta2 = sc.nextDouble();

        System.out.println("3. ¿Usa estructuras y tipos de datos? Escribe: \n"
                + "1 - Siempre. \n"
                + "0,5 - A veces \n"
                + "0 - Nunca");
        double valorPregunta3 = sc.nextDouble();

        System.out.println("4. ¿Usa identificadores adecuados? Escribe: \n"
                + "1,5 - Siempre. \n"
                + "0,75 - A veces \n"
                + "0 - Nunca");
        double valorPregunta4 = sc.nextDouble();

        System.out.println("5. ¿El programa es legible? Escribe: \n"
                + "1,5 - Mucho. \n"
                + "0,75 - Regular \n"
                + "0 - Poco");
        double valorPregunta5 = sc.nextDouble();

        System.out.println("6. ¿Presenta la información completa al usuario? Escribe: \n"
                + "1 - Si. \n"
                + "0,5 - Regular \n"
                + "0 - No");
        double valorPregunta6 = sc.nextDouble();

        nota = valorPregunta1 + valorPregunta2 + valorPregunta3 + valorPregunta4 + valorPregunta5 + valorPregunta6;

        System.out.println("La nota del ejercicio práctico evaluado es: " + nota);     

        sc.close();
    }
}