package ficherosbinariosapuntes.E1102;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CancionPirata {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1102/cancionPirata.dat"))) {
            String str = "Con diez cañones por banda, \n" +
                    "viento en popa a toda vela,\n" +
                    "no corta el mar, sino vuela \n" +
                    "un velero bergantin.";
            out.writeObject(str);
        } catch (FileNotFoundException e) {
            System.out.println("Error 1");
        } catch (IOException e) {
            System.out.println("Error 2");;
        }
    }
}
