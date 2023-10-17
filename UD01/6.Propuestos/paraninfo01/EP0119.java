package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el usuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €. 
 * En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
 */
public class EP0119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Presentamos el programa y solicitamos datos al usuario.
        System.out.println("Este programa calcula el importe a cobrar por entradas.");
        System.out.println("-------------------------------------------------------");

        System.out.print("A continuación introduce el número de entradas infantiles compradas: ");
        int infant = sc.nextInt();

        System.out.print("A continuación introduce el número de entradas de adultos compradas: ");
        int adultos = sc.nextInt();

        // Ahora hacemos los cálculos:

        double precioInfant = infant * 15.50;
        double precioAdult = adultos * 20.00;

        double importe = precioAdult + precioInfant;

        double descuento = (importe >= 100) ? (5 * importe / 100) : 0;
        double total = importe + descuento;

        // Mostramos el resultado por pantalla.
        System.out.println("El precio total es de " + total + " euros.");

        sc.close();
    }
}
