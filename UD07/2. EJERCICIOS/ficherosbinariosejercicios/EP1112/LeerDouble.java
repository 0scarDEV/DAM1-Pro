package ficherosbinariosejercicios.EP1112;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/** @author Óscar Fernández Pastoriza
 * @description EP1112. Abre el fichero de la Actividad de aplicación EP1111, lee el valor double contenido en él y muéstralo por pantalla. */
public class LeerDouble {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1111/double.dat"))) {
            System.out.println(in.readDouble());
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }
    }
}
