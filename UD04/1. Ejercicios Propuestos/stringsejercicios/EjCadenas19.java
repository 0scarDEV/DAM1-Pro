package stringsejercicios;
/* Óscar Fernádez Pastoriza
EjCadenas19. Crea una función que determine la longitud máxima de una palabra en una cadena de caracteres.
 */
public class EjCadenas19 {
    public static void main(String[] args) {
        String str1 = "Hola esta es la palabra mas largaaaaaaaaaaaaaaaaa";
        System.out.println(longitudMaximaPalabra(str1));
    }
    public static int longitudMaximaPalabra(String cadena) {
        String[] palabras = cadena.split("\\s+");
        int longitudMaxima = 0;

        for (String palabra : palabras) {
            int longitudPalabra = palabra.length();
            longitudMaxima = Math.max(longitudMaxima, longitudPalabra);
        }

        return longitudMaxima;
    }
}