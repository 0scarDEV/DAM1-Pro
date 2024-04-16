package ficherostextoapuntes.AP10_3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class AP10_3 {
    public static void main(String[] args) {
        // Crea un flujo de entrada con el fichero
        FileInputStream flujo = null;
        try {
            flujo = new FileInputStream("UD07/1. APUNTES/ficherostextoapuntes/AP10_3/Jugadores");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Crea un Scanner para analizar el flujo de entrada del fichero
        Scanner sc = new Scanner(flujo);
        String nombre = "";
        Integer edad;
        Double altura;
        Jugador[] jugadores = new Jugador[1];
        int i = 0;

        int contEdad = 0;
        int contEstatura = 0;
        int sumEdad = 0;
        double sumEstatura = 0;

        while (sc.hasNext()) {
            if (i != 0) {
                if (jugadores[i - 1] != null) {
                    jugadores = Arrays.copyOf(jugadores, jugadores.length + 1);
                }
            }

            if (sc.hasNext("[A-Z][a-z]+")) {
                nombre = sc.next();
                if (sc.hasNextInt()) {
                    edad = sc.nextInt();
                    if (sc.hasNextDouble()) {
                        altura = sc.nextDouble();
                    } else {
                        System.out.println("No se ha encontrado una altura válida. Omitiendo línea...");
                        altura = null;
                        sc.nextLine();
                    }
                } else {
                    System.out.println("No se ha encontrado una edad válida. Omitiendo línea...");
                    edad = null;
                    altura = null;
                    sc.nextLine();
                }
            } else {
                System.out.println("No se ha encontrado un nombre. Omitiendo línea...");
                nombre = null;
                edad = null;
                altura = null;
                sc.nextLine();
            }

            if (nombre != null && edad != null && altura != null) {
                jugadores[i] = new Jugador(nombre, edad, altura);
                i++;
            }
            if (edad != null) {
                sumEdad += edad;
                contEdad++;
            }
            if (altura != null) {
                sumEstatura += altura;
                contEstatura++;
            }
        }

        System.out.println("Nombres: ");
        for (Jugador jugador : jugadores) {
            if (jugador != null) {
                System.out.println(" - " + jugador.nombre);
            }
        }

        System.out.print("Media edad: ");
        System.out.println(sumEdad / contEdad);

        System.out.print("Media estaturas: ");
        System.out.println(sumEstatura / contEstatura);

        sc.close();
    }

    static class Jugador {
        String nombre;
        Integer edad;
        Double altura;

        public Jugador(String nombre, Integer edad, Double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        @Override
        public String toString() {
            return nombre + ", edad=" + edad + ", altura=" + altura;
        }
    }
}