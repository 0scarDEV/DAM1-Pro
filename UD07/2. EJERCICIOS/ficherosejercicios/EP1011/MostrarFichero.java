package ficherosejercicios.EP1011;

import java.io.*;
import java.util.Scanner;

public class MostrarFichero {
    /** EP1011. Escribe un programa que solicite al usuario el nombre de un fichero de texto y muestre su contenido en pantalla. Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto prueba.txt. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        String nombre = sc.nextLine();

        if (nombre.isEmpty()) {
            nombre = "UD07\\2. EJERCICIOS\\ficherosejercicios\\prueba.txt";
        }

        try (BufferedReader in = new BufferedReader(new FileReader(nombre))) {
            while (in.ready()) {
                System.out.println(in.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo.");
        } catch (IOException e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
