package condicionalesparaninfo;

import java.util.Scanner;

public class EP0219 {
    /* EP0219. Crea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el equivalente en radianes. Si el ángulo introducido por el usuario no se encuentra en el rango de 0° a 360°, hay que transformarlo a dicho rango. Nota: El operador módulo (%) puede ayudarnos a convertir un ángulo a su equivalente en el rango comprendido de 0 a 360°. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angulo;
        final double conversión = 3.1416 / 180;
        double radianes;

        System.out.print("Introduce a continuación el número de grados de un ángulo: ");
        angulo = sc.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("Has introducido un valor fuera del rango de ángulos, se convertirán " + angulo);
            angulo = Math.abs(angulo % 360);
            System.out.println("Ahora se valorarán " + angulo + " grados de un ángulo.");
        }

        radianes = angulo * conversión;
        System.out.println(angulo + " grados en un ángulo son " + radianes + " radianes.");

        sc.close();
    }
}