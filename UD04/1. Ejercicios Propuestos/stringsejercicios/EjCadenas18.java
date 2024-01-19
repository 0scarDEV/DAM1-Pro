package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas18. Crea una función que convierta una cadena de caracteres que representa un número entero a su valor entero correspondiente.  */
public class EjCadenas18 {
    public static void main(String[] args) {
        int numero = stringAint("19");
        System.out.println(numero);
    }
    public static int stringAint(String str) {
        return Integer.parseInt(str);
    }
}