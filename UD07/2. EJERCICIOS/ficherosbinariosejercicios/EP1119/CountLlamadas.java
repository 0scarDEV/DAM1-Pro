package ficherosbinariosejercicios.EP1119;

import java.io.*;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/** @author Óscar Fernández Pastoriza
 * @description EP1119. Por motivos puramente estadísticos se desea llevar constancia del número de llamadas recibidas cada día en una oficina. Para ello, al terminar cada jornada laboral se guarda dicho número al final de un archivo binario. Implementa una aplicación con un menú, que nos permita añadir el número correspondiente cada día y ver la lista completa en cualquier momento. */
public class CountLlamadas {
    static Map<LocalDateTime, Integer> registro = new LinkedHashMap<>();

    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        while (opcion != 3) {
            switch (opcion) {
                case 1 -> guardarDatos();
                case 2 -> verDatos();
            }
            menu();
            opcion = sc.nextInt();
        }
    }

    private static void verDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("llamadas.dat"))) {
            registro = (Map<LocalDateTime, Integer>) in.readObject();
            for (Map.Entry<LocalDateTime, Integer> entry : registro.entrySet()) {
                System.out.println("El día " + entry.getKey() + " se recibieron " + entry.getValue() + " llamadas.");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void guardarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de llamadas recibidas: ");
        int numLlamadas = sc.nextInt();

        registro.put(LocalDateTime.now(), numLlamadas);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("llamadas.dat"))) {
            out.writeObject(registro);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void menu() {
        System.out.println("[---- MENÚ ----]");
        System.out.println("1. Guardar datos.");
        System.out.println("2. Ver datos.");
        System.out.println("3. Salir.");
    }
}