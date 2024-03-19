package coleccionesejercicios.EP1211;
import java.util.Arrays;
/* Óscar Fernández Pastoriza*/
public class Contenedor1<T> {
    /* E1202. Implementar, con tipos genéricos, la clase Contenedor, donde podremos guardar tantos objetos como deseemos. Para ello utilizaremos una tabla, que inicialmente tendrá tamaño cero y se irá redimensionando según añadamos o eliminemos elementos. La clase, además del constructor y toString(), tendrá los siguientes métodos:
   * void insertarAlPrincipio(T nuevo)
   * void insertarAlFinal(T nuevo)
   * T extraerDelPrincipio()
   * T extraerDelFinal()
   * void ordenar()
   */
    private T[] objetos;
    public Contenedor1() {
        objetos = (T[]) new Object[1];
    }
    @Override public String toString() {
        return Arrays.toString(objetos);
    }
    public T extraerDelPrincipio() {
        T res = objetos[0];
        objetos[0] = null;
        return res;
    }
    public T extraerDelFinal() {
        T res = objetos[objetos.length - 1];
        objetos[objetos.length - 1] = null;
        return res;
    }
    public void insertarAlPrincipio(T nuevo) {
        if (objetos[0] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            for (int i = objetos.length - 1; i > 0; i--) {
                objetos[i] = objetos[i - 1];
            }
        }
        objetos[0] = nuevo;
    }
    public void insertarAlFinal(T nuevo) {
        if (objetos[objetos.length - 1] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
        }
        objetos[objetos.length - 1] = nuevo;
    }
    public void ordenar() {
        Arrays.sort(objetos);
    }
}