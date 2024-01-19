package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas23. Crea una función que codifique una cadena de caracteres usando el algoritmo ROT13.  */
public class EjCadenas23 {
    public static void main(String[] args) {
        String prueba = "ABMNOZabmnoz-";
        String cadenadevuelta = algoritmoROT13(prueba);
        System.out.println(cadenadevuelta);
    }
    public static String algoritmoROT13(String str) {
        char[] caracteres = str.toCharArray();
        char[] caracteresCodificados = new char[caracteres.length];
        String cadenaCodificada = "";

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] >= 'A' && caracteres[i] <= 'Z') {         // Compruebo si son mayúsculas
                if (caracteres[i] <= 'M') {
                    caracteresCodificados[i] = (char) (caracteres[i] + 13);
                } else {
                    caracteresCodificados[i] = (char) (caracteres[i] - 13);
                }
            } else if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {  // Comprueba si son minúsculas
                if (caracteres[i] <= 'm') {
                    caracteresCodificados[i] = (char) (caracteres[i] + 13);
                } else {
                    caracteresCodificados[i] = (char) (caracteres[i] - 13);
                }
            } else {                                                    // Si no son ni mayúsculas ni minúsculas, no es una letra.
                    cadenaCodificada = "No es una letra.";
            }
        }

        for (int i = 0; i < caracteresCodificados.length; i++) {
            cadenaCodificada += caracteresCodificados[i];
        }

        return cadenaCodificada;
    }
}