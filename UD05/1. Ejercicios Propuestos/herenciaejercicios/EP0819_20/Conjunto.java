package herenciaejercicios.EP0819_20;
import herenciaejercicios.EP0814_15.Lista;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class Conjunto extends Lista {
    /* EP0819. Un conjunto es un objeto similar a las listas, capaz de guardar valores de un tipo determinado, con la diferencia de que sus elementos no pueden estar repetidos. Escribe la clase Conjunto para enteros heredando de Lista y reimplementando los métodos de inserción para evitar las repeticiones. */
    private Integer[] elementos;
    public Conjunto() {
        elementos = new Integer[0];
    }
    public int numeroElementos(){
        return elementos.length;
    }
    boolean insertar(Integer nuevo) {
        boolean insertar = true;
        int i = 0;
        while (i < elementos.length && insertar) {
            if (elementos[i] == nuevo)
                insertar = false;
            else
                i++;
        }

        if (insertar){
            elementos = Arrays.copyOf(elementos, elementos.length + 1);
            elementos[elementos.length - 1] = nuevo;
        }

        return insertar;
    }
    public boolean insertar(Conjunto otroConjunto){
        boolean insertar = false;

        for (int i = 0; i < otroConjunto.numeroElementos(); i++){
            if (insertar(otroConjunto.elementos[i]))
                insertar = true;
        }

        return insertar;
    }
    /* EP0820. Implementa el método equals() en la clase Conjunto. Dos conjuntos se consideran iguales si tienen los mismos elementos, no importa en qué orden. */
    public boolean equals(Conjunto c) {
        if (this == c) return true;
        if (c == null || getClass() != c.getClass()) return false;
        return Arrays.equals(elementos, c.elementos);
    }
}