package stringsparaninfo;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EP0614. Diseña una aplicación que se comporte como una pequeña agenda. Mediante um menú el usuario podrá elegir entre:

a) Añadir un nuevo contacto (nombre y teléfono).
b) Buscar el teléfono de un contacto a partir de su nombre.
c) Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre.

Pista: El nombre y el teléfono se pueden codificar como una única cadena con la forma “nombre:teléfono”.  */
public class EP0614 {
    static String[] contacto = new String[0];
    static int contador = 0;
    public static void main(String[] args) {
        int entrada = 0;
        System.out.println("[---- Agenda ----]");
        do {
            mostrarMenu();
            entrada = new Scanner(System.in).nextInt();
            switch (entrada) {
                case 1 -> anhadirContacto();
                case 2 -> buscarTelefono();
                case 3 -> mostrarInfo();
                case 0 -> System.out.println("Saliendo");
                default -> System.out.println("Opción incorrecta");
            }
        } while (entrada != 0);
    }
    static void mostrarMenu() {
        System.out.println();
        System.out.println("------ MENÚ ------");
        System.out.println("1. Añadir un nuevo contacto.");
        System.out.println("2. Buscar el teléfono de un contacto.");
        System.out.println("3. Mostrar información de todos los contactos.");
        System.out.println("0. Salir.");
        System.out.println();
    }
    static void anhadirContacto() {
        contacto = Arrays.copyOf(contacto, contacto.length + 1);
        System.out.print("Añade el nombre de tu nuevo contacto: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.print("Añade el número telefónico de \"" + nombre + "\": ");
        String numeroTelefono = new Scanner(System.in).nextLine();

        contacto[contador] = nombre.concat(":" + numeroTelefono);
        contador++;

        System.out.println("Nuevo contacto añadido con éxito.");
    }
    static void buscarTelefono() {
        System.out.print("Introduce a continuación el nombre del contacto del que deseas saber su número telefónico: ");
        String nombre = new Scanner(System.in).nextLine();
        for (int i = 0; i < contacto.length; i++) {
            String[] nombres = contacto[i].split(":");
            if (nombres[0].equals(nombre)) {
                System.out.println(nombres[1]);
            }
        }
    }
    static void mostrarInfo() {
        Arrays.sort(contacto);
        for (int i = 0; i < contacto.length; i++) {
            System.out.println(contacto[i]);
        }
    }
}