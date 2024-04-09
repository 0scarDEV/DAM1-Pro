package coleccionesejercicios.EP1229;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class Contenedor {
    /* EP1229. Añade a la clase Contenedor para tipos genéricos los métodos:
    * int[] buscar Todos (Object e): que devuelve una tabla con los indices de todas las ocurrencias de e.
    * boolean eliminar Todos (Object e): que elimina todas las ocurrencias de e. Devuelve true si la lista queda alterada.  */
    private Object[] objetos;
    public Contenedor() {
        objetos = new Object[1];
    }
    @Override public String toString() {
        return Arrays.toString(objetos);
    }
    public Object extraerDelPrincipio() {
        Object res = objetos[0];
        objetos[0] = null;
        return res;
    }
    public Object extraerDelFinal() {
        Object res = objetos[objetos.length - 1];
        objetos[objetos.length - 1] = null;
        return res;
    }
    public void insertarAlPrincipio(Object nuevo) {
        if (objetos[0] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            for (int i = objetos.length - 1; i > 0; i--) {
                objetos[i] = objetos[i - 1];
            }
        }
        objetos[0] = nuevo;
    }
    public void insertarAlFinal(Object nuevo) {
        if (objetos[objetos.length - 1] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
        }
        objetos[objetos.length - 1] = nuevo;
    }
    public void ordenar() {
        Arrays.sort(objetos);
    }
    public void ordenar(Comparator<Object> comparator) {
        Arrays.sort(objetos, comparator);
    }
    public Object get(int indice) {
        return objetos[indice];
    }
    int[] buscarTodos (Object e) {
        int[] ocurrencias = new int[0];

        for (int i = 0; i < objetos.length; i++) {
            if (objetos[i] == e) {
                ocurrencias = Arrays.copyOf(ocurrencias, ocurrencias.length + 1);
                ocurrencias[ocurrencias.length - 1] = i;
            }
        }

        return ocurrencias;
    }
    boolean eliminarTodos (Object e) {
        List<Object> a = Arrays.asList(objetos);
        boolean flag = a.removeAll(Collections.singleton(e));
        objetos = a.toArray();
        return flag;
    }
}
