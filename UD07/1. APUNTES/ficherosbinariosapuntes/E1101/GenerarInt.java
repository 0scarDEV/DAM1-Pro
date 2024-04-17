package ficherosbinariosapuntes.E1101;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/* E1101. Escribir en un archivo datos.dat los valores de una tabla de diez enteros. */
public class GenerarInt {
    public static void main(String[] args) {
        // Escribe 10 números enteros e un fichero binario
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1101/datos.dat"))) {
            for (int i = 0; i < 10; i++) {
                out.writeInt(i);
            }
            out.close();
        } catch (IOException ex) {
            System.out.println("Escribiendo... Error Entrada/Salida");
        }
    }
}
