package interfacesejercicios.EP0913;

import java.util.Comparator;
import java.util.Objects;

/* Óscar Fernández Pastoriza
        EP0913. Diseñar la clase Futbolista con los siguientes atributos: dni, nombre, edad y número de goles. Implementar:

        Un constructor y los métodos toString() y equals() (este último basado en el DNI).
        La interfaz Comparable con un criterio de ordenación basado también en el DNI.
        Un comparador para hacer ordenaciones basadas en el nombre y otro basado en la edad.

        Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI, por nombre y por edad.
 */
public class Futbolista implements Comparable {
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
    Comparator comparadorNombre = new Comparator() {
        @Override public int compare(Object o1, Object o2) {
            Futbolista f1 = (Futbolista) o1;
            Futbolista f2 = (Futbolista) o2;
            return f1.nombre.compareTo(f2.nombre);
        }
    };
    Comparator comparadorEdad = new Comparator() {
        @Override public int compare(Object o1, Object o2) {
            Futbolista f1 = (Futbolista) o1;
            Futbolista f2 = (Futbolista) o2;
            return f1.edad - f2.edad;
        }
    };
}