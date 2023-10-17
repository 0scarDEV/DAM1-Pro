package api;
// Las clases "LocalTime" y "LocalDate" necesitan ser importadas del paquete "java.time".
import java.time.LocalTime;
import java.time.LocalDate;
// Directamente se podría escribir "import java.time.*" y se importarían todas las clases.

public class HoraLocal {
    public static void main(String[] args) {
        System.out.println("La hora del sistema es " + LocalTime.now());
        System.out.println("La fecha del sistema es: " + LocalDate.now());
    }
}
/*
SE PUEDE IMPORTAR DIRECTAMENTE EN EL CÓDIGO: 

 * public class LocalTime {
    public static void main(String[] args) {
        System.out.println("Ahora mismo son las " + java.time.LocalTime.now());
    }
 * 
 */
