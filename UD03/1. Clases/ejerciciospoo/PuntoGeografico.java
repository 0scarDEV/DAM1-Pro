package ejerciciospoo;
public class PuntoGeografico {
    private double latidud;
    private double longitud;
    public PuntoGeografico() {
        this.latidud = 0.0;
        this.longitud = 0.0;
    }
    public PuntoGeografico(double latitud, double longitud) {
        try {
            setLatidud(latitud);
            setLongitud(longitud);
        } catch (IllegalArgumentException l){
            throw l;
        }
    }
    public double getLatidud() {
        return latidud;
    }
    public void setLatidud(double latitud) {
        if (latitud < -90 || latitud > 90) {
            throw new IllegalArgumentException("ERROR. La latitud introducida no es válida");
        } else {
            this.latidud = latitud;
        }
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        if (longitud < -180 || longitud > 180) {
            throw new IllegalArgumentException("ERROR. La longitud introducida no es válida");
        } else {
            this.longitud = longitud;
        }
    }

    public void main(String[] args) {
        setLongitud(-200);
    }
}