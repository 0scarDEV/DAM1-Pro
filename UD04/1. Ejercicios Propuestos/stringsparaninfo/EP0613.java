package stringsparaninfo;

public class EP0613 {
    public static void main(String[] args) {
        String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
        System.out.println(eliminarComentarios(sentencia));
    }
    public static String eliminarComentarios(String sentencia) {
        String resultado = new String();
        boolean dentroComentario = false;

        for (int i = 0; i < sentencia.length(); i++) {
            if (sentencia.charAt(i) == '/' && i + 1 < sentencia.length() && sentencia.charAt(i + 1) == '*') {
                dentroComentario = true;
                i++;
            } else if (dentroComentario && sentencia.charAt(i) == '*' && i + 1 < sentencia.length() && sentencia.charAt(i + 1) == '/') {
                dentroComentario = false;
                i++;
            } else if (!dentroComentario) {
                resultado += sentencia.charAt(i);
            }
        }

        return resultado.toString();
    }
}
