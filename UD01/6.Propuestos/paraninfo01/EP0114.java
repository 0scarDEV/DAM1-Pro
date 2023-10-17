package paraninfo01;

import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Crea un programa que pida la base y la altura de un triángulo y muestre su área.
 */
public class EP0114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Este programa calcula el área de un triángulo a partir de la base y la altura.");
        System.out.println("-------------------------------------------------------------------------------");

        System.out.print("Introduce a continuación la base del triángulo: ");
        double base = sc.nextDouble();

        System.out.print("Introduce a continuación la altura del triángulo: ");
        double altura = sc.nextDouble();

        // Calculamos el área.
        double area = (base * altura) / 2;
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("El área de un triángulo con base " + base + " y con altura " + altura + " es: " + area);

        sc.close();
    }
}
