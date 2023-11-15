package ejerciciosResueltos;

public class Gestor {
    /* ATRIBUTOS */
    double importeMax;
    public String nombre;
    public final String telefono;

    /* CONSTRUCTORES */
    public Gestor(String nombre, String telefono) {
        this(nombre, telefono, 10000);
    }

    public Gestor(String nombre, String telefono, double importeMax) {
        this.nombre = nombre;
        this.telefono = telefono;
        setImporteMax(importeMax);
    }

    /* SETTERS Y GETTERS */
    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporteMax() {return importeMax;}
    public void setImporteMax(double importeMax) {
        this.importeMax = importeMax < 0 ? 0 : importeMax;
    }

    public String getTelefono() {return telefono;}

    /* MÉTODOS */
    public void mostrar() {
        System.out.println("GESTOR: " + nombre + ". TELÉFONO: " + telefono + ". IMPORTE MÁXIMO AUTORIZADO: " + importeMax);
    }
}