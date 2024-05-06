package ficherostextoejercicios.EP1016;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LibroDeFirmas {
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
        try (BufferedReader in = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1016/firmas.txt"))) {
            while (in.ready()) {
                firmas.add(in.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IO exception");
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
            try (BufferedWriter out = new BufferedWriter(new FileWriter("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1016/firmas.txt", true))) {
                out.write("\n" + firma);
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