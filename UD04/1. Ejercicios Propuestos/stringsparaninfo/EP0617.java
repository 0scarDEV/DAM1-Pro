package stringsparaninfo;
/* Óscar Fernández Pastoriza
* EP0617. Construir un programa que convierta una palabra en secuencias de n letras. Por ejemplo, la palabra “destornillador”, dividida en secuencias de 4 letras, se mostrará de la siguiente forma:

    dest
    orni
    llad
    or*/
public class EP0617 {
    public static void main(String[] args) {
        String palabra = "destornillador";
        dividirEnSecuencias(palabra, 4);
    }
    public static void dividirEnSecuencias(String palabra, int tamanoSecuencias) {
        int longitudPalabra = palabra.length();

        for (int i = 0; i < longitudPalabra; i += tamanoSecuencias) {
            // Calcular el índice final de la secuencia
            int finSecuencia = Math.min(i + tamanoSecuencias, longitudPalabra);

            // Obtener la subcadena (secuencia) e imprimir
            String secuencia = palabra.substring(i, finSecuencia);
            System.out.println(secuencia);
        }
    }
}