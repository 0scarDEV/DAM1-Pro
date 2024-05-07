package ficherostextoejercicios.EP1019;
import java.io.*;
import java.util.ArrayList;
/** @author Óscar Fernández Pastoriza
 * @description Un encriptador es una aplicación que transforma un texto haciéndolo ilegible para aquellos que desconocen el código. Diseña un programa que lea un fichero de texto, lo codifique y cree un nuevo archivo con el mensaje cifrado. El alfabeto de codificación se encontrará en el fichero codec.txt. Un ejemplo de codificación de alfabeto es:
 * Alfabeto:	abcdefghijklmnopqrstuvwxyz
 * Cifrado: 	emsrcyjnfxiwtakozdlqvbhupg
 * */
public class Codificador {
    public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<>();
        String textoCifrado = "";

        try (BufferedReader in = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1019/texto"));
             BufferedReader in2 = new BufferedReader(new FileReader("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1019/codec.txt"));
             BufferedWriter out = new BufferedWriter(new FileWriter("UD07/2. EJERCICIOS/ficherostextoejercicios/EP1019/textoCifrado"))) {
            while (in.ready()) {
                texto.add(in.readLine());
            }
            String alfa = in2.readLine();
            String cifrado = in2.readLine();

            for (String linea : texto) {
                for (int i = 0; i < linea.length(); i++) {
                    char letra = linea.charAt(i);
                    textoCifrado += cifrado.charAt(alfa.indexOf(letra));
                }
            }

            out.write(textoCifrado);
            out.newLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("IOException");
            throw new RuntimeException(e);
        }
    }
}
