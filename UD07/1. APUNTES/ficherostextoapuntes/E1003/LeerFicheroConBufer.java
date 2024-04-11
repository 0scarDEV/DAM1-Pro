package ficherostextoapuntes.E1003;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroConBufer {
    public static void main(String[] args){
        String linea = null;
        String contenido = "";
        try {
            FileReader ficheroEntrada = new FileReader("prueba");
            BufferedReader bufferEntrada = new BufferedReader(ficheroEntrada);
            linea = bufferEntrada.readLine();
            while (linea != null) {
                contenido += linea + "\n";
                linea = bufferEntrada.readLine();
            }
            System.out.println("Contenido del fichero: " + contenido);
            ficheroEntrada.close();
        } catch (IOException ex) {
            System.out.println("Error.");
        }
    }
}
