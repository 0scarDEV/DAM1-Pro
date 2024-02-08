package inmobiliaria;
/* Óscar Fernández Pastoriza */
public abstract class Inmueble {
    public enum TIPO_INMUEBLE {Piso, Casa};
    String direccion;
    int metros;
    int numHab;
    int precioAlquiler;
    int precioVenta;
    public abstract String detalle();
    public String toString() {
        return "Inmueble en " + direccion + " (" + metros + " m2, " + numHab + " hab)";
    }
    public void setPrecioAlquiler(int precio) {
        precioAlquiler = precio;
    }
    public void setPrecioVenta(int precio) {
        precioVenta = precio;
    }
}