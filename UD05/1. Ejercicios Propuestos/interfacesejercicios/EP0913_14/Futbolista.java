package interfacesejercicios.EP0913_14;
import java.util.Arrays;
import java.util.Comparator;
/* Óscar Fernández Pastoriza */
public class Futbolista implements Comparable {
    /* EP0913. Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de goles. Implementar:
        * Un constructor y los métodos toString() y equals() (este último basado en el DNI).
        * La interfaz Comparable con un criterio de ordenación basado también en el DNI.
        * Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.
        * Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
     */
    String dni;
    String nombre;
    Integer edad;
    Integer numGoles;
    public Futbolista(String dni, String nombre, Integer edad, Integer numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }
    @Override
    public String toString() {
        return "DNI = " + dni + "; Nombre = " + nombre + "; Edad = " + edad + "; Número de goles = " + numGoles;
    }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista otro = (Futbolista) o;

        return dni.equals(otro.dni);
    }
    @Override
    public int compareTo(Object o) {
        return this.dni.compareTo(((Futbolista) o).dni);
    }
    static Comparator comparadorNombre = new Comparator() {
        @Override public int compare(Object o1, Object o2) {
            Futbolista f1 = (Futbolista) o1;
            Futbolista f2 = (Futbolista) o2;
            return f1.nombre.compareTo(f2.nombre);
        }
    };
    static Comparator comparadorEdad = new Comparator() {
        @Override public int compare(Object o1, Object o2) {
            Futbolista f1 = (Futbolista) o1;
            Futbolista f2 = (Futbolista) o2;
            return f1.edad - f2.edad;
        }
    };
    /* EP0914. Añadir a la Actividad de aplicación EP0913 un comparador que ordene los futbolistas por edades y, para aquellos que tienen la misma edad, por nombres. */
    static Comparator comparadorMixto = new Comparator() {
        @Override public int compare(Object o1, Object o2) {
            Futbolista f1 = (Futbolista) o1;
            Futbolista f2 = (Futbolista) o2;

            int res = f1.edad - f2.edad;

            if (res == 0){
                res = f1.nombre.compareTo(f2.nombre);
            }
            return res;
        }
    };

    public static void main(String[] args) {
        Futbolista[] t = new Futbolista[5];
        t[0] = new Futbolista("55555555", "Pepito", 27, 30);
        t[1] = new Futbolista("11111111", "Juanito", 25, 75);
        t[2] = new Futbolista("44444444", "Cristiano",30, 175);
        t[3] = new Futbolista("22222222", "Messi", 30, 175);
        t[4] = new Futbolista("33333333", "Mbappe", 23, 50);

        System.out.println("Futbolistas ordenados por DNI");
        Arrays.sort(t);
        for (Futbolista futbolista : t) {
            System.out.println(futbolista.toString());
        }

        System.out.println("Futbolistas ordenados por Nombre");
        Arrays.sort(t, comparadorNombre);
        for (Futbolista futbolista : t) {
            System.out.println(futbolista.toString());
        }

        System.out.println("Futbolistas ordenados por Edad");
        Arrays.sort(t, comparadorEdad);
        for (Futbolista futbolista : t) {
            System.out.println(futbolista.toString());
        }
    }
}