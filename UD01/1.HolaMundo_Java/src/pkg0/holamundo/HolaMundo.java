package pkg0.holamundo;
/**
 * @author ofernpast
 */
public class HolaMundo {
    public static void main(String[] args) {
        // El código a realizar se ejecutará si se escribe aquí:
        System.out.println("Hola Mundo");
        // sout + TAB = System.out.println("");

/**
        Si eliminamos el 'ln' al "comando" 'print' el texto se muestra en la misma línea:
        System.out.print("Ahora mostraría "+importe);
        System.out.println(" y "+importe+" en la misma línea.");
        System.out.print("Esto se mostraría en otra línea, pero la siguiente línea se vería junta.");
 */

        // Pruebas generales con variables (EJERCICIO 1):
        Double importe = 0.0; // Asignamos una variable de número real (decimales)
        System.out.print("Antes de cenar debíamos "+importe+"€ al restaurante");
        importe = 120.75; // Actualizamos el valor de la variable.
        System.out.println(" y tras la cena, debemos "+importe+"€");

        Byte asistentesCena = 6; // Asignamos una variable de números enteros.
        System.out.println("Hemos ido a cenar "+asistentesCena+" personas.");

        // Operadores lógicos - DIVISIÓN (EJERCICIO 1):
        Double importePers = (importe/asistentesCena); // Asignamos a una variable que sabemos que será un número real dividiendo dos variables
        System.out.print("Debíamos "+importe+"€ y somos "+asistentesCena+" personas.");
        System.out.println(" Cada uno debemos pagar "+importePers+"€");

        // Créditos a:
        System.out.println("");
        System.out.println("Programa creado en JAVA por Oscar Fernandez");
        }
}