package ficherostextoejercicios.EP1017;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/** @author = "Óscar Fernández Pastoriza"
 * EP1017. En Linux disponemos del comando more, al que se le pasa un fichero y lo muestra poco a poco: cada 24 líneas. Implementa un programa que funcione de forma similar.
 * */
public class ComandoMore {
    public static void main(String[] args) {
        String linea = null;

        try (BufferedReader in = new BufferedReader(new FileReader("ficherostextoejercicios/EP1017/fichero.txt"))) {
            while (in.ready()) {
                for (int i = 0; i < 24; i++) {
                    linea = in.readLine();
                    if (linea != null) {
                        System.out.println(linea);
                    }
                }
                if (linea != null) {
                    System.out.print("Pulsa ENTER para mostrar otras 24 líneas.");
                    String vacio = new Scanner(System.in).nextLine();
                } else {
                    System.out.println("Fin del programa");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }
    }
}
