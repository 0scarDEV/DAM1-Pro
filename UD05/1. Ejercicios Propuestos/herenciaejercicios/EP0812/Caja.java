package herenciaejercicios.EP0812;
/* Óscar Fernández Pastoriza
* EP0812. Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mercancías en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho, un alto y un fondo y, una vez creada, se mantiene inmutable. Cada caja lleva pegada una etiqueta, de un máximo de 30 caracteres, con información útil como el nombre del destinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:
* Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja con las dimensiones especificadas, que pueden encontrarse en “cm” (centímetros) o “m” (metros).
* double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
* void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
* String toString(): que devuelve una cadena con la representación de la caja. */
public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    public enum Unidad {cm, m}
    Unidad unidad;
    String etiqueta;
    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }
    public double getVolumen() {
        double cubicos;

        if (unidad.toString().equals("cm")) {
            cubicos = (ancho / 100.0) * (alto / 100.0) * (fondo / 100.0);
        } else {
            cubicos = ancho * alto * fondo;
        }

        return cubicos;
    }
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    @Override
    public String toString() {
        return "Ancho = " + ancho + "; Alto = " + alto + "; Fondo = " + fondo +  "; Unidad = " + unidad.toString() + "; Etiqueta = \"" + etiqueta  + "\"; Volumen" + getVolumen();
    }
}