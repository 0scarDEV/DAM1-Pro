package apuntesbucles;
import java.util.Scanner;

public class E0308 {
    // E0308. Pedir diez números enteros por teclado y mostrar la media. Amplía codificando el número de números como una constante.
    public static void main(String[] args) {
        // Declaración de variables y constantes
        final int NUM_NUMEROS = 15;
        int numero;
        int suma = 0;
        double media;

        // Entrada de datos
        System.out.println("Vamos a calcular la media de " + NUM_NUMEROS + " números.");
        for (int i = 1; i <= NUM_NUMEROS; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe un número: ");
            numero = sc.nextInt();
            // suma = suma + numero;
            suma += numero;
            sc.close();
        }
        // Proceso
        media = suma / (double) NUM_NUMEROS;

        // Salida
        System.out.printf("La media es %.2f", media);
    }
}