package ficherostextoejercicios.EP1015;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
/** @author = Óscar Fernández Pastoriza
 * EP1015. En el archivo numeros.txt disponemos de una serie de números (uno por cada línea). Diseña un programa que procese el fichero y nos muestre el menor y el mayor.
 * */
public class AppNumMayorMenor {
    public static void main(String[] args) {
        int numMax = 0;
        int numMin = 0;
        int i = 0;

        try (Scanner sc = new Scanner(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1015/numeros.txt"))) {
            while (sc.hasNextInt()) {
                int valor = sc.nextInt();
                if (i == 0) {
                    numMax = valor;
                    numMin = valor;
                } else {
                    if (valor > numMax) {
                        numMax = valor;
                    }
                    if (valor < numMin) {
                        numMin = valor;
                    }
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("El valor máximo es: " + numMax);
        System.out.println("El valor mínimo es: " + numMin);
    }
}
