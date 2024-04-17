package ficherosbinariosapuntes.E1105;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
/** @author = "Óscar Fernández Pastoriza" */
public class LeerArray {
    /* E1105. Leer una tabla de double de un archivo datos.dat. */
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("X:\\dam1\\Programación\\UD07\\numerosDouble.dat"))) {

            double[] t = (double[]) in.readObject();

            System.out.println(Arrays.toString(t));
            for (double n : t) {
                System.out.println(n);
            }

        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error");
        } catch (ClassNotFoundException e) {
            System.out.println("El contenido del archivo binario no es un array de double");
        }
    }
}