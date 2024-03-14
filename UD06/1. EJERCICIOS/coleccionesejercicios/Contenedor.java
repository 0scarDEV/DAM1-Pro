package coleccionesejercicios;

import java.util.Arrays;

public class Contenedor<T> {
    private T[] objetos;
    public Contenedor() {
        objetos = (T[]) new Object[0];
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
        if (objetos[0] == null) {
            objetos[0] = nuevo;
        } else {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            System.arraycopy(objetos, 0, objetos,  1, objetos.length);
        }
    }
    public void insertarAlFinal(T nuevo) {
        if (objetos[objetos.length - 1] == null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            objetos[objetos.length - 1] = nuevo;
        }
    }
    void ordenar() {
        Arrays.sort(objetos);
    }
}