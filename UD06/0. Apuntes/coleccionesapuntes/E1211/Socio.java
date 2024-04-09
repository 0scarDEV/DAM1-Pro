package coleccionesapuntes.E1211;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio> {
    /* E1211. Implementar la clase Socio, cuyos atributos son dni, nombre y fechaAlta, que deberá incluir el método equals(), la interfaz Comparable basada en el dni y el método antiguedad(). Implementar un programa que gestione los socios de un club guardando los datos en el fichero socios.dat. Al arrancar la aplicación, se leen los datos del fichero y se abre un menú con las opciones: 1. Alta; 2. Baja; 3. Modificación; 4. Listado por DNI; 5. Listado por antiguedad, y 6. Salir. */
    String dni;
    String nombre;
    LocalDate fechaAlta;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni) && Objects.equals(nombre, socio.nombre) &&
                Objects.equals(fechaAlta, socio.fechaAlta);
    }
    @Override
    public int compareTo(Socio o) {
        return dni.compareTo(o.dni);
    }
    public int antiguedad() {
        return (int) fechaAlta.until(LocalDate.now(), ChronoUnit.DAYS);
    }
}