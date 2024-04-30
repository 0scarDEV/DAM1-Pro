package EmpresaCRUD;

import java.util.Objects;

public class Empresa {
    private int id;
    private String nombre;
    private String web;

    public Empresa(int id, String nombre, String web) {
        this.id = id;
        this.nombre = nombre;
        this.web = web;
    }

    @Override
    public String toString() {
        return id + ".- " + nombre + " (" + web + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return id == empresa.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
