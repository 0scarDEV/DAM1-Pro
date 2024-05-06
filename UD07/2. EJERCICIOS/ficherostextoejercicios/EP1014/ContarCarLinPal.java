package ficherostextoejercicios.EP1014;

import java.io.*;
import java.util.Scanner;
/** @author = Óscar Fernández Pastoriza
 * EP1014. Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los caracteres, las líneas y las palabras. Para simplificar supondremos que cada palabra está separada de otra por un único espacio en blanco o por un cambio de línea.
 * */
public class ContarCarLinPal {
    public static void main(String[] args) {
        int contadorCaracteres = 0;
        int contadorLineas = 0;
        int contadorPalabras = 0;

        try (Scanner sc = new Scanner(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1014/carta.txt"))) {
            while (sc.hasNext()) {
                String palabra = sc.next();
                contadorCaracteres += palabra.length();
                contadorPalabras++;
                if (sc.hasNextLine()) {
                    contadorLineas++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            throw new RuntimeException(e);
        }

        System.out.println("El texto tiene " + contadorCaracteres + " caracteres, " + contadorLineas + " líneas y " + contadorPalabras + " palabras.");
    }
}
