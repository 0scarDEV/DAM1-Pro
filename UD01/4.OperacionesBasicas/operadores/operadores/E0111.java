package operadores;

import java.util.Scanner;

public class E0111 {
    public static void main(String[] args) {
        double kilosManzanas;
        double kilosPeras;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a continuación el número de kilos de manzanas vendidos: ");
        kilosManzanas = sc.nextDouble();

        System.out.print("Introduce a continuación el número de kilos de peras vendidos: ");
        kilosPeras = sc.nextDouble();

        double precioManzanas = 2.35;
        double precioPeras = 1.95;

        double beneficiosManzanas = kilosManzanas * precioManzanas;
        System.out.println("El frutero obtendrá de la venta de manzanas " + beneficiosManzanas + " euros.");
        double beneficiosPeras = kilosPeras * precioPeras;
        System.out.println("El frutero obtendrá de la venta de peras " + beneficiosPeras + " euros.");

        double beneficiosAnuales = beneficiosManzanas + beneficiosPeras;
        System.out.println("El frutero obtendrá de la venta de manzanas y peras " + beneficiosAnuales + " euros.");
        
        sc.close();
    }
}