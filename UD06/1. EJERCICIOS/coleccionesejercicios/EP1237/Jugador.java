package coleccionesejercicios.EP1237;
import java.util.Objects;

public class Jugador {
    public enum Posicion {PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO};
    String dni;
    String nombre;
    Posicion posicion;
    int estatura;
    public Jugador(String dni, String nombre, Posicion posicion, int estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }
    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return estatura == jugador.estatura && Objects.equals(dni, jugador.dni) && Objects.equals(nombre, jugador.nombre) &&
                posicion == jugador.posicion;
    }
    @Override public int hashCode() {
        return Objects.hash(dni, nombre, posicion, estatura);
    }
    @Override public String toString() {
        return nombre + '(' + posicion + ')';
    }
}