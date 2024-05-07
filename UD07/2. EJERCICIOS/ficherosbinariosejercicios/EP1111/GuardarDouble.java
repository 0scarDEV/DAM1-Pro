package ficherosbinariosejercicios.EP1111;

import java.io.*;
/** @author Óscar Fernández Pastoriza
 * @description EP1111. Pide un valor double por consola y guárdalo en un archivo binario. */
public class GuardarDouble {
    public static void main(String[] args) {
        double d = 3.1415;
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1111/double.dat"))) {
            out.writeDouble(d);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error de E/S");
            throw new RuntimeException(e);
        }
    }
}
