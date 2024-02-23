package herenciaejercicios.EP0821;
/* Óscar Fernández Pastoriza
* EP0821. Implementa los siguientes métodos:
* static boolean esNumero(Object ob), que nos dice si su parámetro de entrada es de tipo numérico (integer, double, long, float...).
* static boolean sumar(Object a, Object b), que muestra por consola la concatenación de los parámetros de entrada, si ambos son cadenas, o muestra su suma convertida al tipo double, si ambos son de tipo numérico. En cualquier otro caso, muestra el mensaje “No sumables”. */
public class EP0821 {
    static boolean esNumero(Object ob) {
        String clase = String.valueOf(ob.getClass());
        return clase.equals("Integer") || clase.equals("Double") || clase.equals("Long") || clase.equals("Float") || clase.equals("Short") || clase.equals("Byte");
    }
    static boolean sumar(Object a, Object b) {
        if (String.valueOf(a.getClass()).equals("String")) {
            System.out.println((String) a + (String) b);
            return true;
        } else if (String.valueOf(a.getClass()).equals("Double")) {
            System.out.println((Double) a + (Double) b);
            return true;
        } else {
            return false;
        }
    }
}