package ficherostextoejercicios.EP1020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicherosDiferentes {
    public static void main(String[] args) {
        try (BufferedReader in1 = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1020/texto1.txt"));
            BufferedReader in2 = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1020/texto2.txt"))) {

            int numLinea = 0;
            int numCar = 0;
            while (in1.ready() && in2.ready()) {
                String linea1 = in1.readLine();
                String linea2 = in2.readLine();
                if (!linea1.equals(linea2)) {
                    for (int i = 0; i < linea1.length(); i++) {
                        if (linea1.charAt(i) != linea2.charAt(i)) {
                            numCar++;
                        }
                    }
                } else {
                    numLinea++;
                }
            }

            System.out.println("El archivo es diferente en la línea: " + numLinea);
            System.out.println("y en el caracter " + numCar);

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
