package ficherosbinariosapuntes.E1103;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class GenerarAleatorios {
    /* E1103. Pedir un entero n por consola y, a continuación, generar aleatoriamente n números de tipo double, que iremos insertando en una tabla. Guardar la tabla en un archivo binario. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        Random random = new Random();
        int n = sc.nextInt();
        double[] t = new double[n];

        for (int i = 0; i < n; i++) {
            t[i] = random.nextDouble(100);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("UD07/1. APUNTES/ficherosbinariosapuntes/E1103/numerosDouble.dat"))) {
            out.writeObject(t);
        } catch (FileNotFoundException e) {
            System.out.println("Error. Fichero no encontrado.");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
