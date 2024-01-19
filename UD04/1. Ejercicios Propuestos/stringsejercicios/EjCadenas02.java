package stringsejercicios;
import java.util.Arrays;
/* Óscar Fernández Pastoriza
EjCadenas02. Eliminar la última palabra de una frase. */
public class EjCadenas02 {
    public static void main(String[] args) {
        System.out.println(quitarUltPalabra("ola ola ola"));
    }
    public static String quitarUltPalabra(String str) {
        String[] fraseSeparada = str.split(" ");
        fraseSeparada = Arrays.copyOf(fraseSeparada, fraseSeparada.length - 1);
        return String.join(" ", fraseSeparada);
    }
}