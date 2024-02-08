package inmobiliaria;
/* Óscar Fernández Pastoriza */
public class Piso extends Inmueble {
    String tipoInmueble = String.valueOf(TIPO_INMUEBLE.Piso);
    int numBanh;
    int planta;
    public Piso(String direccion, int metros, int numHab, int numBanh, int planta) {
        super.direccion = direccion;
        super.metros = metros;
        super.numHab = numHab;
        this.numBanh = numBanh;
        this.planta = planta;
    }
    @Override public String detalle() {
        String str = tipoInmueble + " en " + direccion + ".\n" +
                metros + " m2, " + numHab + " hab, " + numBanh + " baños, " + planta + "ª planta.\n";
        if (precioAlquiler != 0) {
            str = str.concat("Precio de Alquiler: " + precioAlquiler + " euros.\n");
        }
        if (precioVenta != 0) {
            str = str.concat("Precio de Venta: " + precioVenta + " euros.");
        }
        return str;
    }
}