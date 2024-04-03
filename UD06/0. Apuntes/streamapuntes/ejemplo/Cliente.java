package streamapuntes.ejemplo;

/**
 * Cliente
 */
public class Cliente {
    String dni;
    public String nombre;
    public int edad;
    public Cliente(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
}
