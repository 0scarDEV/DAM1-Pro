package ejerciciosmath;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * Permite al usuario ingresar las coordenadas (x, y) de dos puntos en un plano cartesiano. Calcula la distancia entre estos dos puntos utilizando la fórmula de distancia euclidiana:
 */
public class DistanciaPuntosPlanoCartesiano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, distancia;

        System.out.println("Introduzca las coordenadas x1 e y1 separadas por un espacio: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        
        System.out.println("Introduzca las coordenadas x2 e y2 separadas por un espacio: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        sc.close();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia entre las dos coordenadas es: " + distancia);
    }   
}