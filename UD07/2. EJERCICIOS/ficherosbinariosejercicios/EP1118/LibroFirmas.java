package ficherosbinariosejercicios.EP1118;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/** @author Óscar Fernández Pastoriza
 * @description EP1118. Un libro de firmas es útil para recoger los nombres de todas las personas que han pasado por un determinado lugar. Crea una aplicación que permita mostrar el libro de firmas o insertar un nuevo nombre (comprobando que no se encuentre repetido) usando el fichero binario firmas.dat. */
public class LibroFirmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1 -> anhadirFirma();
                case 2 -> mostrarLibro();
            }
            mostrarMenu();
            opcion = sc.nextInt();
        }
    }

    private static void mostrarLibro() {
        Set<String> firmas = leerFirmas();
        for (String firma : firmas) {
            System.out.println(firma);
        }
    }

    private static Set<String> leerFirmas() {
        Set<String> firmas = new LinkedHashSet<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("ficherostextoejercicios/EP1016/firmas.dat"))) {
            firmas = (Set<String>) in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IO exception");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return firmas;
    }

    private static void anhadirFirma() {
        Set<String> firmas = leerFirmas();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una firma");
        String firma = sc.nextLine();

        if (!firmas.contains(firma)) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ficherostextoejercicios/EP1016/firmas.dat", true))) {
                out.writeObject(firmas);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("[----- MENÚ -----]");
        System.out.println("1. Crear firma");
        System.out.println("2. Mostrar firmas");
        System.out.println("3. Salir");
    }
}