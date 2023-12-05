package ejerciciospoo;
import java.time.LocalDate;
import java.time.LocalTime;

public class AppViajes {
    public static User registroUsuario() {
        System.out.println("REGISTRO:");
        System.out.println("Introduzca su nombre:");
        String nombre = new java.util.Scanner(System.in).nextLine();
        System.out.println("Introduzca su contraseña:");
        String passwd = new java.util.Scanner(System.in).nextLine();
        System.out.println("Introduzca su email:");
        String email = new java.util.Scanner(System.in).nextLine();

        return new User(nombre, passwd, email, true);
    }
    public static Viaje nuevoViaje(User usuario) {
        System.out.println("CREAR VIAJE");

        System.out.println("Introduzca la fecha de salida (YYYY-MM-DD): ");
        LocalDate fechaSalida = LocalDate.parse(new java.util.Scanner(System.in).nextLine());

        System.out.println("Introduzca la hora de salida: (HH:mm)");
        LocalTime horaSalida = LocalTime.parse(new java.util.Scanner(System.in).nextLine());

        System.out.println("Introduzca la latitud del punto de salida (*,*): ");
        double latitudS = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Introduzca la longitud del punto de salida (*,*): ");
        double longitudS = new java.util.Scanner(System.in).nextDouble();
        PuntoGeografico salida = new PuntoGeografico(latitudS, longitudS);

        System.out.println("Introduzca la latitud del punto de destino (*,*): ");
        double latitudD = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Introduzca la longitud del punto de destino (*,*): ");
        double longitudD = new java.util.Scanner(System.in).nextDouble();
        PuntoGeografico destino = new PuntoGeografico(latitudD, longitudD);

        return new Viaje(usuario, fechaSalida, horaSalida, salida, destino);
    }
    public static void main(String[] args) {
        User usuario = registroUsuario();
        System.out.println();
        Viaje viaje = nuevoViaje(usuario);
        System.out.println("El viaje ha sido creado con éxito. Detalles:");
        viaje.mostrar();
    }
}