package ejerciciosmath;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * Circulo. Solicita al usuario que ingrese el radio de un círculo y calcula su área y su perímetro utilizando Math.PI y Math.pow(). Suponiendo que el radio sea el de una esfera, calcula también su volumen usando la fórmula.
 */
public class Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, area, perimetro, volumen;
        System.out.print("Radio del círculo/esfera: ");
        radio = sc.nextDouble();

        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área es " + area);
        
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perímetro es " + perimetro);


        volumen = (4 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen es " + volumen);
        sc.close();
    }
}
