package ficherosbinariosejercicios.EP1115;

import java.io.*;
import java.util.ArrayList;
import java.io.FileOutputStream;

/** @author Óscar Fernández Pastoriza
 * @description EP1115. Implementa un programa que lea números enteros desde el fichero numeros.dat y los vaya guardando en los ficheros pares.dat e impares.dat, según su paridad. */
public class SepararParesImpares {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1115/numeros.dat"));
             ObjectOutputStream outPares = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1115/pares.dat"));
             ObjectOutputStream outImpares = new ObjectOutputStream(new FileOutputStream("UD07/2. EJERCICIOS/ficherosbinariosejercicios/EP1115/impares.dat"))) {
            ArrayList<Integer> numeros = (ArrayList<Integer>) in.readObject();
            for (Integer numero : numeros) {
                if (numero % 2 == 0) {
                    outPares.writeObject(numero);
                } else {
                    outImpares.writeObject(numero);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}