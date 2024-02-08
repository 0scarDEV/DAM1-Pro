package inmobiliaria;
/* Óscar Fernández Pastoriza */
public class Casa extends Inmueble {
    String tipoInmueble = String.valueOf(TIPO_INMUEBLE.Casa);
    int numBanh;
    int extensionTerreno;
    public Casa(String direccion, int metros, int numHab, int numBanh, int extensionTerreno) {
        super.direccion = direccion;
        super.metros = metros;
        super.numHab = numHab;
        this.numBanh = numBanh;
        this.extensionTerreno = extensionTerreno;
    }
    @Override public String detalle() {
        String str = tipoInmueble + " en " + direccion + ".\n" +
                metros + " m2, " + numHab + " hab, " + numBanh + " baños, con terrerno de " + extensionTerreno + " m2.\n";
        if (precioAlquiler != 0) {
            str = str.concat("Precio de Alquiler: " + precioAlquiler + " euros.\n");
        }
        if (precioVenta != 0) {
            str = str.concat("Precio de Venta: " + precioVenta + " euros.");
        }
        return str;
    }
}
