package ejerciciosmath;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * Escribe un programa que tome como entrada la longitud de dos lados de un triángulo rectángulo y calcule la longitud de la hipotenusa utilizando el teorema de Pitágoras
 */
public class Hipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, hipotenusa;

        System.out.println("Introduzca la longitud del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.println("Introduzca la longitud del segundo lado: ");
        lado2 = sc.nextDouble();
        sc.close();

        hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        System.out.println("La hipotenusa de los lados " + lado1 + " y " + lado2 + " es " + hipotenusa);
    }
}