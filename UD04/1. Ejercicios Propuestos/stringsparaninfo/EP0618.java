package stringsparaninfo;

public class EP0618 {
    public static void main(String[] args) {
        String frase = "Me Gusta merenDAR gaLLEtas";
        System.out.println(convertirACamelCase(frase));
    }
    public static String convertirACamelCase(String frase) {
        String[] palabras = frase.split(" ");
        String resultado = "";

        resultado += palabras[0].toLowerCase();
        for (int i = 1; i < palabras.length; i++) {
            palabras[i] = palabras[i].toLowerCase();
            resultado += Character.toUpperCase(palabras[i].charAt(0)) + palabras[i].substring(1);
        }

        return resultado;
    }
}