package ejerciciosmath;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * ClaseMath. Escribe un programa que genere y muestre un número aleatorio con decimales en el rango de -360 a 360 utilizando Math.random(). A continuación realizará y mostrará los siguientes cálculos:
    su raíz cuadrada utilizando el método Math.sqrt().
    el número redondeado a la cifra entera más cercana utilizando Math.round().
    el número redondeado hacia arriba y hacia abajo utilizando los métodos Math.ceil() y Math.floor().
    su valor absoluto utilizando Math.abs().
    La potencia al cubo de ese número utilizando el método Math.pow().
    su logaritmo natural utilizando Math.log().
    suponiendo que el número representa la medida un ángulo en grados, muestra el seno y coseno de ese ángulo utilizando Math.sin() y Math.cos().
 * Solicita al usuario que ingrese otros dos números y calcula y muestra el mayor de los 3 (el generado y los introducidos por teclado) utilizando Math.max(). Calcula y muestra también el menos con Math.min().
 * Opcional: Haz un programa robusto que controle las excepciones que se puedan producir.
 */
public class ClaseMath {
    public static void main(String[] args) {
        final double NUM_MAX = 360.0;
        final double NUM_MIN = -360.0;
        double f = Math.random()/Math.nextDown(1.0);
        double num = NUM_MAX * (1.0 - f) + NUM_MIN * f;

        System.out.println("El número aleatorio generado es " + num + ".");
        System.out.println("La raíz cuadrada de " + num + " es " + Math.sqrt(num) + ".");
        System.out.println("El número redondeado a la cifra entera más cercana de " + num + " es " + Math.round(num) + ".");
        System.out.println("El número redondeado hacia arriba de " + num + " es " + Math.ceil(num) + ".");
        System.out.println("El número redondeado hacia abajo de " + num + " es " + Math.floor(num) + ".");
        System.out.println("El valor absoluto de " + num + " es " + Math.abs(num) + ".");
        System.out.println("La potencia al cubo de " + num + " es " + Math.pow(num, 3.0) + ".");
        System.out.println("El logaritmo natural de " + num + " es " + Math.log(num) + ".");
        System.out.println("En caso de que el número representara un ángulo en grados el seno sería " + Math.sin(num) + " y el coseno sería " + Math.cos(num) + ".");

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduzca un número: ");
        double num2 = sc.nextDouble();
        sc.close();
        double numMayorIntroducido = Math.max(num1, num2);
        double numMenorIntroducido = Math.min(num1, num2);
        System.out.println("De los tres números introducidos el mayor es: " + Math.max(numMayorIntroducido, num));
        System.out.println("De los tres números introducidos el menor es: " + Math.min(numMenorIntroducido, num));
    }
}