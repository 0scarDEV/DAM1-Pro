package apuntesarrays;
public class Explicacion {
    public static void main(String[] args) {
        int[] edad; // Declaramos una variable int de tipo array.

        edad = new int[30]; // Definimos que el array edad[] tendrá 30 valores.

        // Asignamos valores, cada "casilla" se enumerará del 0 al 29.
        edad[0] = 25;
        edad[1] = 19;
        // ...

        // Mostramos por separado cada casilla.
        System.out.println(edad[0]);
        System.out.println(edad[1]);

        // Los arrays tienen valores por defecto.
        double[] notas = new double[30];
        String[] nombres = new String[30];
        System.out.println(notas[0]);       // Mostrará 0.0
        System.out.println(nombres[0]);     // Mostrará null

        // Se pueden asignar valores de manera directa.
        int[] alumnoCiclos = {30, 25, 32, 20};
    }
}