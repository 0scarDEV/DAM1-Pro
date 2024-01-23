package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas06. Escribe un programa en Java que lea una frase del usuario y luego imprima la frase con cada palabra en una línea diferente. Por ejemplo, si el usuario ingresa "Java es genial", el programa debe imprimir:

Java
es
genial
 */
public class EjCadenas06a {
    public static void main(String[] args) {
        String str = "Java es genial";
        String[] str2 = str.split(" ");
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }
    }
}