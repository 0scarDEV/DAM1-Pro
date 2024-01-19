package simud0402;
/* Óscar Fernández Pastoriza */
public class Matricula {
    public static void main(String[] args) {
        System.out.println(siguienteMatricula("9999BBD"));
    }
    public static boolean esMatriculaValida(String matricula) {
        boolean esMatriculaValida = true;
        if (matricula == null || matricula.length() != 7){
            esMatriculaValida = false;
        } else {
            char[] matri = matricula.toCharArray();
            for (int i = 0; i < 4; i++) {
                if (!Character.isDigit(matri[i])) {
                    esMatriculaValida = false;
                }
            }
            for (int i = 4; i < 7; i++) {
                if (!esLetraValida(matri[i])) {
                    esMatriculaValida = false;
                }
            }
        }
        return esMatriculaValida;
    }
    private static boolean esLetraValida(char ch) {
        boolean esLetraValida = false;
        char[] letrasValidas = {'B','C','D','F','G','H','I','J','K','L','M','N','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for (int k = 0; k < letrasValidas.length; k++) {
            if (ch == letrasValidas[k]) {
                esLetraValida = true;
            }
        }
        return esLetraValida;
    }
    public static String siguienteMatricula(String matricula) {
        if (esMatriculaValida(matricula)) {
            char[] caracteres = matricula.toCharArray();
            matricula = incrementarDigitos(matricula);
            // Comprobamos si el número de matrícula es 9999, si lo es, se sumará una letra.
            String digitos = "";
            for (int i = 0; i < 4; i++) {
                digitos += caracteres[i];
            }
            if (digitos.equals("9999")){
                matricula = incrementarLetras(matricula);
            }
        } else {
            matricula = null;
        }
        return matricula;
    }
    private static String incrementarDigitos(String matricula){
        String numerosStr = matricula.substring(0, 4);
        int digitos = Integer.parseInt(numerosStr);
        digitos++;

        String nuevaMatricula = String.valueOf(digitos).concat(matricula.substring(4, 7));

        for (int i = nuevaMatricula.length(); i < 7; i++) {
            nuevaMatricula = "0".concat(nuevaMatricula);
        }

        return nuevaMatricula;
    }
    private static String incrementarLetras(String matricula){
        String letras = matricula.substring(5,8);
        String numeros = matricula.substring(0,4);
        char[] letra = letras.toCharArray();
        if (letra[2] == 'Z') {
            letra[2] = 'B';
            letra[1]++;
            if (letra[1] == 'E' || letra[1] == 'I' || letra[1] == 'O' || letra[1] == 'U') {
                letra[1]++;
            }
            if (letra[1] == '[') {
                letra[1] = 'B';
                letra[0]++;
                if (letra[0] == 'E' || letra[0] == 'I' || letra[0] == 'O' || letra[0] == 'U') {
                    letra[0]++;
                }
                if (letra[0] == '[') {
                    letra[0] = 'B';
                    letra[1] = 'B';
                    letra[2] = 'B';
                }
            }
        } else {
            letra[2]++;
            if (letra[2] == 'E' || letra[2] == 'I' || letra[2] == 'O' || letra[2] == 'U') {
                letra[2]++;
            }
        }
        numeros = "0000";
        letras = "";
        for (int i = 0; i < letra.length; i++) {
            letras += letra[i];
        }
        return numeros.concat(letras);
    }
    int comparaMatriculas(String m1, String m2) {

        return 0;
    }
}