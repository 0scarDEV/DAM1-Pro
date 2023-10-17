package expresiones;

import java.util.Scanner;

public class E931 {
    public static void main(String[] args) {
        // Determinar si un número entero N de 5 cifras es capicúa.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca a continuación el valor de la variable N, debe tener 5 cifras:");
        int N = sc.nextInt();

        // Sacamos la decena de millar: 
        int decMillar = N / 10000;
        // Sacamos el millar:
        int millar = (N / 1000) % 10;
        // Sacamos la decena:
        int decena = (N / 10) % 10;
        // Sacamos la unidad:
        int unidad = N % 10;

        boolean capicua = (decMillar == unidad) && (millar == decena);
        
        System.out.println("¿El número de capicúa? " + capicua);
        sc.close();
    }
}
