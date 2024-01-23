package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas12. Crea una función que cuente el número de ocurrencias de una subcadena dada en una cadena de caracteres.
 */
public class EjCadenas12 {
    public static void main(String[] args) {
        System.out.println(contarOcurrencias("Hola Hola Hola Bacalao", "Hola"));
    }
    public static int contarOcurrencias(String cadena, String subcadena) {
        int contador = 0;
        int indice = cadena.indexOf(subcadena);

        while (indice != -1) {
            contador++;
            indice = cadena.indexOf(subcadena, indice + 1);
        }

        return contador;
    }
}