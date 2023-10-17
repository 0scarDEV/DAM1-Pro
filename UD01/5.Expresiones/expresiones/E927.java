package expresiones;

import java.util.Scanner;

public class E927 {
    public static void main(String[] args) {
        // Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma en la variable X, sumar las cifras de M y guardar la suma en la variable Y. Finalmente guarda en la variable Z la suma de X e Y.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación un número de 4 cifras:");
        int N = sc.nextInt();
        
        // Sacamos la millares: 
        int milN = N / 1000;
        // Sacamos la centena:
        int centenaN = (N % 100) / 10;
        // Sacamos la decena:
        int decenaN = (N / 10) % 10; 
        // Sacamos la unidad:
        int unidadN = N % 10;
        
        int X = milN + centenaN + decenaN + unidadN;
        System.out.println("La suma de la variable entera de 4 cifras N es: " + X + " y está almacenada en la variable X");

        System.out.println("Introduzca a continuación otro número de 4 cifras:");
        int M = sc.nextInt();

        // Sacamos la millares: 
        int milM = M / 1000;
        // Sacamos la centena:
        int centenaM = (M % 100) / 10;
        // Sacamos la decena:
        int decenaM = (M / 10) % 10; 
        // Sacamos la unidad:
        int unidadM = M % 10;

        int Y = milM + centenaM + decenaM + unidadM;
        System.out.println("La suma de la variable entera de 4 cifras M es: " + Y + " y está almacenada en la variable Y");

        int Z = X + Y;
        System.out.println("La suma de las variable X e Y es: " + Z);

        sc.close();
    }
}
