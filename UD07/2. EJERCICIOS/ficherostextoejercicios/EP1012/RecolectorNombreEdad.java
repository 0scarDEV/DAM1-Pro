package ficherostextoejercicios.EP1012;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/** @author Óscar Fernández Pastoriza
 * @description EP1012. Diseña una aplicación que pida al usuario su nombre y edad. Estos datos deben guardarse en el fichero datos.txt. Si este fichero existe, deben añadirse al final en una nueva línea, y en caso de no existir, debe crearse. */
public class RecolectorNombreEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String info = sc.nextLine();

        System.out.println("Introduce tu edad: ");
        info += "(" + sc.nextLine() + ")";

        try (BufferedWriter out = new BufferedWriter(new FileWriter("ficherosejercicios/EP1012/datos.txt", true))) {
            out.write(info);
            out.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
