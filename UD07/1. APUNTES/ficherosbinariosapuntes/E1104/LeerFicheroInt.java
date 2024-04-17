package ficherosbinariosapuntes.E1104;
import java.io.*;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class LeerFicheroInt {
    /* E1104. Leer de un archivo datos.dat 10 números enteros, guardándolos en una tabla de tipo int. */
    public static void main(String[] args) {
        // Lee los números enteros de un fichero binario
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1101/datos.dat"))) {
            while (true) {
                System.out.println(in.readInt());
            }

        } catch (EOFException ex) {
            System.out.println("Leyendo... Excepción fin de fichero");
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR. No se encontró el fichero");
        } catch (IOException ex) {
            System.out.println("Leyendo... Error Entrada/Salida");
        }

        // Lee 10 números enteros de un fichero binario y los guarda en un array
        int[] tabla = new int[10];
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos.dat"))) {

            for (int i = 0; i < 10; i++){
                tabla[i] = in.readInt();
            }

        } catch (EOFException ex) {
            System.out.println("Leyendo... Excepción fin de fichero");
        } catch (IOException ex) {
            System.out.println("Leyendo... Error Entrada/Salida");
        }

        System.out.println(Arrays.toString(tabla));
    }
}
