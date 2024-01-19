package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas01. Contar el número de palabras de una frase. */
public class EjCadenas01 {
    public static void main(String[] args) {
        System.out.println(contadorPalabras("ola ola ola"));
    }
    public static int contadorPalabras(String str) {
        String[] fraseSeparada = str.split(" ");
        int contador = 0;
        for (int i = 0; i < fraseSeparada.length; i++) {
            contador++;
        }
        return contador;
    }
}