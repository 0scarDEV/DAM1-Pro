package ficherostextoejercicios.EP1021;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.*;

/** @author Óscar Fernández Pastoriza
 * @description EP1021. Diseña una pequeña agenda, que muestre el siguiente menú:
     * 1. Nuevo contacto.
     * 2. Buscar por nombre.
     * 3. Mostrar todos.
     * 4. Salir.
 * En ella, guardaremos el nombre y el teléfono de un máximo de 20 personas.
     *  La opción 1 nos permitirá introducir un nuevo contacto siempre y cuando la agenda no esté llena, comprobando que el nombre no se encuentra insertado ya.
     *  La opción 2 muestra todos los teléfonos que coinciden con la cadena que se busca. Por ejemplo, si tecleamos «Pe", mostrará el teléfono de Pedro, de Pepe y de Petunia.
     *  La opción 3 mostrará un listado con toda la información (nombres y teléfonos) ordenados alfabéticamente por el nombre.
     *  Por último, la opción 4 guarda todos los datos de la agenda en el archivo agenda.txt. La próxima vez que se ejecute la aplicación, si hay datos guardados, se cargarán en memoria.
 * */
public class Agenda {
    static Map<String, String> contactos = new LinkedHashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        cargarDatos();
        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1 -> anhadirContacto();
                case 2 -> {
                    System.out.println("Introduce el nombre del contacto a buscar");
                    String nombre = sc.next();
                    buscarContacto(nombre);
                }
                case 3 -> mostrarListado();
                case 4 -> guardarDatos();
                default -> System.out.println("ERROR. Opción no válida");
            }
            mostrarMenu();
            opcion = sc.nextInt();
        }
    }

    private static void anhadirContacto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nombre: ");
        String nom = sc.nextLine();
        System.out.print("Introduce un número: ");
        String num = sc.next();

        contactos.put(nom, num);
    }

    private static void buscarContacto(String nombre) {
        Set<Map.Entry<String, String>> contacto = contactos.entrySet();
        for (Map.Entry<String, String> c : contacto) {
            if (c.getKey().equals(nombre)) {
                System.out.println(c.getKey() + " " + c.getValue());
            }
        }
    }

    private static void mostrarListado() {
        Set<Map.Entry<String, String>> contact = contactos.entrySet();
        List<Map.Entry<String, String>> lista = new ArrayList<>(contact);
        lista.sort(Map.Entry.comparingByKey());

        for (Map.Entry<String, String> c : lista) {
            System.out.println(c.getKey() + " " + c.getValue());
        }
    }

    private static void cargarDatos() {
        try (BufferedReader in = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1021/agenda.txt"))) {
            String linea;
            while ((linea = in.readLine()) != null) {
                String[] datos = linea.split(" ");
                contactos.put(datos[0], datos[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatos() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1021/agenda.txt"))) {
            Set<Map.Entry<String, String>> contacto = contactos.entrySet();
            for (Map.Entry<String, String> c : contacto) {
                out.write(c.getKey() + " " + c.getValue() + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("archivo no encontrado");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void mostrarMenu() {
        System.out.println("[---- MENÚ ----]");
        System.out.println("1. Nuevo contacto.");
        System.out.println("2. Mostrar teléfonos.");
        System.out.println("3. Mostrar información");
        System.out.println("4. Guardar datos.");
        System.out.println("5. Salir.");
    }
}
