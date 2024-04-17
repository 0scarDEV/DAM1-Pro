package ficherosbinariosapuntes.AP1101;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GenerarArrayInt {
    public static void main(String[] args) {
        int[] numero = {1,2,3,4,5,6,7,8,9};
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1101/datos.dat"))) {
            out.writeObject(numero);
        } catch (IOException ex) {
            System.out.println("Escribiendo... Error Entrada/Salida");
        }
    }
}
