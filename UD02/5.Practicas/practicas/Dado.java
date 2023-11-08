package practicas;

public class Dado {
    /* Diseñar un programa que simule el lanzamiento de un dado de 6 caras un número de veces codificado como una constante NUM_LANZAMIENTOS. El programa mostrará una estadística final que recoja el número de veces que ha salido cada cara del dado y el porcentaje sobre el total de lanzamientos. El porcentaje se mostrará como un número entero o como un número real con un máximo de 2 decimales, con una salida por pantalle similar a la siguiente:  */
    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;
        int i, cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;
        double lanzamiento;

        for (i = 0; i < NUM_LANZAMIENTOS; i++) {
            lanzamiento = Math.random() * 100;
            if (lanzamiento <= 16.5) {
                cara1++;
            } else if (lanzamiento <= 33) {
                cara2++;
            } else if (lanzamiento <= 49.5) {
                cara3++;
            } else if (lanzamiento <= 66) {
                cara4++;
            } else if (lanzamiento <= 82.5) {
                cara5++;
            } else {
                cara6++;
            }
        }

        System.out.println("RESULTADOS:");
        System.out.println("----------------------------------------");
        System.out.println("Ha salido 1: " + cara1 + " veces. (" + (double)(cara1 / 10) + "%)");
        System.out.println("Ha salido 2: " + cara2 + " veces. (" + (cara2 / 10) + "%)");
        System.out.println("Ha salido 3: " + cara3 + " veces. (" + (cara3 / 10) + "%)");
        System.out.println("Ha salido 4: " + cara4 + " veces. (" + (cara4 / 10) + "%)");
        System.out.println("Ha salido 5: " + cara5 + " veces. (" + (cara5 / 10) + "%)");
        System.out.println("Ha salido 6: " + cara6 + " veces. (" + (cara6 / 10) + "%)");
    }
}