package apuntesfunciones;

import java.util.Scanner;

public class E0403 {
    /*
     * E0403. Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique. Para distinguir un caso de otro se le pasará como opción un número: 1 (para el área) o 2 (para el volumen). Además, hay que pasarle a la función el radio de la base y la altura.
     
    área = 2pi * radio * (altura + radio)
    volumen = pi * radio
    2 * altura
     
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaraciones y entrada de datos.

        System.out.print("Introduzca el radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Introduzca la altura del cilindro: ");
        double altura = sc.nextDouble();
        System.out.print("Si desea calcular el area, introduzca 1, si desea calcular el perímetro, introduzca 2: ");
        int opcion = sc.nextInt();
        
        sc.close();
        
        // Llamamos a la función
            areaVolumenCilindro(radio, altura, opcion);
    }

    static void areaVolumenCilindro(double radio, double altura, int opcion) {
        // Declaramos variables locales.
        double area;
        double volumen;

        // Procesos.
        switch (opcion) {
            case 1:
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("Área - " + area);
                break;
            case 2:
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("Volumen = " + volumen);
                break;
            default:
                System.out.println("ERROR: opción incorrecta");
        }
    }
}
