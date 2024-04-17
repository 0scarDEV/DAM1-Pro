package ficherosbinariosapuntes.E1108;
import ficherosbinariosapuntes.Socio;
import java.io.*;
import java.util.Arrays;
/** @author = "Óscar Fernández Pastoriza" */
public class SocioFicheros {
    public static void main(String[] args) {
/*
        Socio[] socios = {
                new Socio(1, "Juan", "Calle Chan do Monte", "01/01/2021"),
                new Socio(2, "Ana", "Calle Marín", "01/01/2022"),
                new Socio(3, "Luis", "Calle Vigo", "01/01/2023"),
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1108/socios.dat"))) {
            out.writeByte(3);
            out.writeObject(socios);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

 */
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1108/socios.dat"))) {
            byte[] n = in.readNBytes(1);
            Socio[] sociosL = (Socio[]) in.readObject();
            System.out.println(Arrays.toString(sociosL));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch (IOException e) {
            System.out.println("Error.");
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró un array de socios");
        }
    }
}
