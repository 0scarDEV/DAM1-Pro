package ficherosbinariosejercicios.EP1113;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/** @author Óscar Fernández Pastoriza
 * @description EP1113. Escribe un programa que lea de un fichero binario una tabla de números double y después muestre el contenido de la tabla por consola. */
public class LeerDoubleArray {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {
            double[] tabla = (double[]) in.readObject();
            for (double d : tabla) {
                System.out.println(d);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}