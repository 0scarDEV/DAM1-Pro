package stringsejercicios;
import java.util.Arrays;
/*import java.util.HashSet;
import java.util.Set;*/

/* Óscar Fernández Pastoriza
EjCadenas20. Crea una función que determine la frecuencia de cada palabra en una cadena de caracteres.  */
public class EjCadenas20 {
    public static void main(String[] args) {
        String frase = "un es un determinante indeterminado";
        String[] frecuencias = frecuenciaPalabra(frase);
        System.out.println(Arrays.toString(frecuencias));
    }
    public static String[] frecuenciaPalabra(String frase) {
        // Si queremos que no distinga entre mayúsculas y minúsculas, reemplazar la siguiente línea por: "String[] fraseSeparada = frase.toLowerCase().split(" ");"
        String[] fraseSeparada = frase.split(" ");
        String[] frecuencia = new String[fraseSeparada.length];

        for (int i = 0; i < fraseSeparada.length; i++) {
            int contador = 0;
            for (int j = 0; j < fraseSeparada.length; j++) {
                if (fraseSeparada[i].equals(fraseSeparada[j])) {
                    contador++;
                    frecuencia[i] = "La palabra \"" + fraseSeparada[i] + "\" aparece " + contador + " veces.";
                }
            }
        }
        // frecuencia = eliminarDuplicados(frecuencia);
        return frecuencia;
    }
/* Si queremos que muestre una cadena en la que los resultados no estén duplicados, descomentar todas las líneas de código.
    public static String[] eliminarDuplicados(String[] arrayConDuplicados) {
        // Creamos un conjunto para almacenar elementos únicos
        Set<String> conjuntoUnico = new HashSet<>(Arrays.asList(arrayConDuplicados));

        // Creamos un nuevo array con los elementos únicos
        String[] arraySinDuplicados = new String[conjuntoUnico.size()];
        conjuntoUnico.toArray(arraySinDuplicados);

        return arraySinDuplicados;
    }
*/
}