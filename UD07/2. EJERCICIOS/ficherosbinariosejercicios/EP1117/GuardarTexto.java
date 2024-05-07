package ficherosbinariosejercicios.EP1117;
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Scanner;

/** @author Óscar Fernández Pastoriza
 * @description EP1117. Escribe un texto, línea a línea, de forma que, cada vez que se pulse Intro, se guarde la línea en un archivo binario. El proceso se termina cuando introduzcamos una linea vacía. Después el programa lee el texto completo del archivo y lo muestra por pantalla. */
public class GuardarTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1117/texto.dat"))) {
            String linea = sc.nextLine();
            lista.add(linea);
            while (!linea.isEmpty()) {
                linea = sc.nextLine();
                lista.add(linea);
                out.writeObject(lista);
                out.flush();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1117/texto.dat"))) {
            lista = (ArrayList<String>) in.readObject();
            for (String s : lista) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}