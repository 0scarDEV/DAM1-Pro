package stringsejercicios;
/* Óscar Fernández Pastoriza
EjCadenas21. Crea una función que determine si una cadena de caracteres es un número real válido. */
public class EjCadenas21 {
    public static void main(String[] args) {
        boolean numero = esNumeroReal("19.12312313132124213423542");
        System.out.println(numero);
    }
    public static boolean esNumeroReal(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}