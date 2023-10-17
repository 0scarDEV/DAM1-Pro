package api;
import java.text.DecimalFormat;
import java.util.*;

public class RaizCuadrada {
    public static void main(String[] args) {
/* Ahora insertaremos la variable numero desde el teclado: */
        int numeroPorTeclado;                       // Añadimos una variable.
        DecimalFormat df = new DecimalFormat("#.00");      // Según el enunciado, añadimos que tan solo se muestren dos decimales de la raíz calculada del radicando:
        System.out.print("A continuación inserte el radicando del que quiere la raíz: ");
        Scanner sc = new Scanner(System.in);        // Creamos una variable "sc" en la que creamos una función que recopila lo insertado por teclado.
        numeroPorTeclado = sc.nextInt();            // Asignamos un valor a la variable, en este caso el valor se corresponde con la variable "sc".
        System.out.println("La raíz cuadrada de " + numeroPorTeclado + " es: " + df.format(Math.sqrt(numeroPorTeclado)));
        sc.close();
    }
}