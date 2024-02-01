package clasesejercicios;
import clasesapuntes.Lista;
import java.util.Objects;
/* Óscar Fernández Pastoriza */
/* EP0721. Un conjunto es una estructura dinámica de datos como la lista, con dos diferencias en primer lugar, en una lista puede haber elementos repetidos, mientras que en un conjunto, no. Además, en una lista el orden de inserción de los elementos puede ser relevante y debemos tenerlo en cuenta, mientras que en un conjunto solo interesa si un elemento pertenece o no al conjunto y no el lugar que ocupa. Se pide implementar la clase Conjunto utilizando una lista para almacenar números de tipo Integer. Implementa los siguientes métodos:

Un constructor sin parámetros.
int numeroElementos(): devuelve el número de elementos del conjunto.
boolean insertar(Integer nuevo): inserta un nuevo elemento en el conjunto.
boolean insertar(Conjunto otroConjunto): añade al conjunto los elementos del conjunto otroConjunto.
boolean eliminar(Integer elemento): en caso de pertenecer al conjunto elimina elemento.
boolean eliminar(Conjunto otroConjunto): elimina del conjunto invocante los elementos del conjunto que se pasa como parámetro.
boolean pertenece(Integer elemento): indica si el elemento que se le pasa como parámetro pertenece o no al conjunto.
mostrar(): muestra el conjunto por consola.

De forma general, los métodos que devuelven un booleano indican con él si el conjunto se ha modificado.
*/
public class Conjunto {
    private Lista lista;
    public Conjunto() {
        this.lista = new Lista();
    }
    public int numeroElementos() {
        return lista.numElementos();
    }
    public boolean insertar(Integer nuevo) {
        if (lista.buscarValorEnLista(nuevo) == -1) {
            lista.addFin(nuevo);
            return true;
        }
        return false;
    }
    public boolean insertar(Conjunto otroConjunto) {
        boolean bandera = false;
        for (int i = 0; i < otroConjunto.lista.numElementos(); i++) {
            if (insertar(otroConjunto.lista.obtenerValor(i))) {
                    bandera = true;
            } else {
                    return false;
            }
        }
        return bandera;
    }
    public boolean eliminar(Integer elemento) {
        if (lista.buscarValorEnLista(elemento) != -1) {
            lista.eliminarEnLista(lista.buscarValorEnLista(elemento));
            return true;
        }
        return false;
    }
    public boolean eliminar(Conjunto otroConjunto) {
        boolean bandera = false;
        for (int i = 0; i < otroConjunto.lista.numElementos(); i++) {
            int valor = lista.buscarValorEnLista(otroConjunto.lista.obtenerValor(i));
            if (valor != -1) {
                lista.eliminarEnLista(valor);
                bandera = true;
            } else {
                return false;
            }
        }
        return bandera;
    }
    public boolean pertenece(Integer elemento) {
        for (int i = 0; i < lista.numElementos(); i++) {
            if (Objects.equals(elemento, lista.obtenerValor(i))) {
                return true;
            }
        }
        return false;
    }
    public void mostrar() {
        this.lista.mostrar();
    }
    public static boolean incluido(Conjunto c1, Conjunto c2) {
        for (int j = 0; j < c1.lista.numElementos(); j++) {
            if (c2.lista.buscarValorEnLista(c1.lista.obtenerValor(j)) == -1) {
                return false;
            }
        }
        return true;
    }
    public static Conjunto union(Conjunto c1, Conjunto c2) {
        Conjunto cr = new Conjunto();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            if (!incluido(c1, cr)) {
                cr.insertar(c1.lista.obtenerValor(i));
            }
        }
        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!incluido(c2, cr)) {
                cr.insertar(c2.lista.obtenerValor(i));
            }
        }
        return cr;
    }
    public static Conjunto interseccion(Conjunto c1, Conjunto c2) {
        Conjunto cr = new Conjunto();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            for (int j = 0; j < c2.numeroElementos(); j++) {
                if (incluido(c1, c2) && incluido(c2, c1)) {
                    cr.insertar(c1.lista.obtenerValor(i));
                }
            }
        }
        return cr;
    }
    public static Conjunto diferencia(Conjunto c1, Conjunto c2) {
        Conjunto cr = new Conjunto();
        for (int i = 0; i < c1.numeroElementos(); i++) {
            if (!incluido(c2, c1)) {
                cr.insertar(c1.lista.obtenerValor(i));
            }
        }
        for (int i = 0; i < c2.numeroElementos(); i++) {
            if (!incluido(c1, c2)) {
                cr.insertar(c2.lista.obtenerValor(i));
            }
        }
        return cr;
    }

    public static void main(String[] args) {
        // Métodos de instancia
        System.out.println("Instance");
        Conjunto c1 = new Conjunto();

        System.out.println(c1.insertar(7));
        System.out.println(c1.insertar(6));
        System.out.println(c1.insertar(7));

        Conjunto c2 = new Conjunto();
        c2.insertar(5);
        c2.insertar(6);

        System.out.println(c1.insertar(c2));
        System.out.println(c1.eliminar(4));
        System.out.println(c1.eliminar(7));

        System.out.println(c1.pertenece(6));
        c1.mostrar();


        // Métodos estáticos
        System.out.println("Static");

        Conjunto a = new Conjunto();
        Conjunto b = new Conjunto();
        Conjunto c = new Conjunto();
        a.insertar(1);
        a.insertar(2);
        b.insertar(3);
        b.insertar(4);
        c.insertar(2);
        c.insertar(6);

        Conjunto.union(a,b).mostrar();
        Conjunto.union(a,c).mostrar();
        Conjunto.interseccion(a,c).mostrar();
        Conjunto.interseccion(a,c).mostrar();
    }
}