package ficherosbinariosejercicios.EP1114;

import java.io.*;
import java.util.Scanner;
/** @author Óscar Fernández Pastoriza
 * @description EP1114. Introduce por teclado una frase y guárdala en un archivo binario. A continuación, recupérala y muéstrala por pantalla. */
public class GuardarFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1114/frase.dat"));
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1114/frase.dat"))) {
            out.writeObject(frase);
            System.out.println(in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            throw new RuntimeException(e);
        }
    }
}