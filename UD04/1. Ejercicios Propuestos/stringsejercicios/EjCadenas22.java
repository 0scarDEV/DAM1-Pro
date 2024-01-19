package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas22. Crea una función que convierta una cadena de caracteres que representa un número real a su valor real correspondiente.  */
public class EjCadenas22 {
    public static void main(String[] args) {
        double numero = stringAdouble("19.22");
        System.out.println(numero);
    }
    public static double stringAdouble(String str) {
        return Double.parseDouble(str);
    }
}