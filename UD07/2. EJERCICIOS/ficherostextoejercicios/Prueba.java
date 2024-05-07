package ficherostextoejercicios;

import java.io.File;

public class Prueba {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("¿El archivo existe? " + file.exists());
    }
}