package ficherostextoejercicios.EP1013;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
/** @author = Óscar Fernández Pastoriza
 * EP1013. Implementa un programa que lea dos listas de números enteros no ordenados desde dos archivos con un número por linea, los reúna en una lista única y los guarde en orden creciente en un tercer archivo, de nuevo uno por línea.
 * */
public class AppListas {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader("ficherostextoejercicios/EP1013/lista1"))) {
            String linea;
            while (in.ready()) {
                linea = in.readLine();
                lista1.add(Integer.parseInt(linea));
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }

        try (BufferedReader in = new BufferedReader(new FileReader("ficherostextoejercicios/EP1013/lista2"))) {
            String linea;
            while (in.ready()) {
                linea = in.readLine();
                lista2.add(Integer.parseInt(linea));
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }

        ArrayList<Integer> listaTotal = new ArrayList<>();

        listaTotal.addAll(lista1);
        listaTotal.addAll(lista2);

        Collections.sort(listaTotal);

        try (BufferedWriter out = new BufferedWriter(new FileWriter("ficherostextoejercicios/EP1013/listaTotal"))) {
            for (Integer integer : listaTotal) {
                out.write(integer + "\n");
            }
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }
    }
}
