package strings;

import java.util.Arrays;

public class utiles {
    public static Boolean esPalindromo (String str) {
        String fraseInvertida = "";
        char[] letras = str.toCharArray();
        for (int j = letras.length - 1; j >= 0; j--) {
            fraseInvertida += letras[j];
        }
        str = str.replace(" ","");
        fraseInvertida = fraseInvertida.replace(" ","");
        str = str.trim();
        return str.equalsIgnoreCase(fraseInvertida);
    }
    public static int contadorPalabras(String str) {
        String[] fraseSeparada = str.split(" ");
        int contador = 0;
        for (int i = 0; i < fraseSeparada.length; i++) {
            contador++;
        }
        return contador;
    }
    public static String quitarUltPalabra(String str) {
        String[] fraseSeparada = str.split(" ");
        fraseSeparada = Arrays.copyOf(fraseSeparada, fraseSeparada.length - 1);
        return String.join(" ", fraseSeparada);
    }
    private static int contarCoincidencias(String str1, String str2) {
        int contarCoincidencias = 0;

        try {
            for (int i = 0; i < str1.length(); i++){
                if (str1.charAt(i) == str2.charAt(i)) {
                    contarCoincidencias++;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Controlamos si la 2da cadena de caracteres es más corta que la primera.
        }

        return contarCoincidencias;
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
