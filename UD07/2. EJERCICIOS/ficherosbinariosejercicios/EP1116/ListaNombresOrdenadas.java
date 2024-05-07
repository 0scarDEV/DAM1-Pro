package ficherosbinariosejercicios.EP1116;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/** @author Óscar Fernández Pastoriza
 * @description EP1116. Implementa una aplicación que gestione una lista de nombres ordenada por orden alfabético. Al arrancar se leerá de un fichero los nombres insertados anteriormente y se pedirán nombres nuevos hasta que se introduzca la cadena "fin”. Cada nombre que se introduzca deberá añadirse a los que ya había, de forma que la lista permanezca ordenada. Al terminar se guardará en el fichero la lista actualizada. */
public class ListaNombresOrdenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1116/nombres.dat"))) {
            nombres = (ArrayList<String>) in.readObject();
        } catch (EOFException e) {
            System.out.println("Fichero vacío");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada");
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1116/nombres.dat"))) {
            System.out.println("Introduce nombres nuevos. Introduce fin para terminar");
            String nuevoNombre = sc.nextLine();
            while (!nuevoNombre.equals("fin")) {
                nombres.add(nuevoNombre);
                nuevoNombre = sc.nextLine();
            }
            Collections.sort(nombres);
            out.writeObject(nombres);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }

        System.out.println(nombres);
    }
}
