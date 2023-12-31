package apuntesbucles;
import java.util.Scanner;

public class E0302 {
    // E0302. Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores de edad.
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int edad;
        int sumEdades = 0, mediaEdades, numAlumnos = 0, numMayores18 = 0;

        // Entrada de datos
        Scanner sc = new Scanner (System.in);
        System.out.println("EDADES: Sumas, medias, etc.");
        System.out.println("Introduce las edades de los alumnos (número negativo para terminar)");
        edad = sc.nextInt();

        while (edad >= 0) {
            numAlumnos++; // Contador de alumnos
            sumEdades += edad; // Acumulador de edades
            if (edad >= 18) {
                numMayores18++; // Contador de alumnos > 18
            }
            edad = sc.nextInt();
        }
        mediaEdades = sumEdades / numAlumnos; // Media (entera) de edades

        // Salida
        System.out.println("Número de alumnos: " + numAlumnos);
        System.out.println("Número de alumnos mayores de edad: " + numMayores18);
        System.out.println("Suma de las edades de los alumnos: " + sumEdades);
        System.out.println("Media de las edades de los alumnos: " + mediaEdades);
        
        sc.close();
    }
}