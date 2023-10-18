package apuntescondicionales;

import java.util.Scanner;

public class E0211 {
    // E0211. Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a “lunes” y el 6 a “sábado”.
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numero;

        // Entrada de datos
        System.out.print("Introduzca a continuación un número comprendido entre 1 y 7: ");
        numero = sc.nextInt();

        switch (numero) {
            case 1: 
                System.out.println("Lunes");
                break;
            case 2: 
                System.out.println("Martes");
                break;
            case 3: 
                System.out.println("Miércoles");
                break;
            case 4: 
                System.out.println("Jueves");
                break;
            case 5: 
                System.out.println("Viernes");
                break;
            case 6: 
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        sc.close();
    }
}