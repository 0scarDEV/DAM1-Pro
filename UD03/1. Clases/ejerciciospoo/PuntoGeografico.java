package ejerciciospoo;
import java.util.Random;
/* Óscar Fernández Pastoriza
 * PuntoGeografico. Investiga en Internet el funcionamiento del sistema GPS y las coordenadas de latitud y longitud.
 * Implementa la clase PuntoGeografico con las siguientes especificaciones:
        Atributos privados para almacenar la latitud y longitud
        Un constructor por defecto que inicialice el punto al paso del meridiano de Greenwich por el Ecuador.
        Un constructor que permita introducir coordenadas de latitud y longitud válidas o que devuelva una excepción si no lo son.
        Un método que muestre por pantalla la información del punto en formato de grados decimales.
        Un  método que muestre la información del punto en formato DMS (grados, minutos y segundos, y punto cardinal)
        Un método que devuelva un punto geográfico cuya latitud y longitud se generen aleatoriamente.
        Un método que devuelve una cadena de caracteres como la siguiente: https://www.google.es/maps/@42.3716382,-8.6897279,12z  
        Un método que devuelve una cadena de caracteres como la siguiente: https://www.openstreetmap.org/#map=14/42.3716382/-8.6897279 
 * Añade a la clase los siguientes métodos 
        Un método que devuelve una cadena de caracteres como la siguiente: https://nominatim.openstreetmap.org/reverse?format=xml&lat=42.3716382&lon=-8.6897279&zoom=14  
        Un método que devuelve una cadena de caracteres como la siguiente: https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=42.3716382&lon=-8.6897279 
 */
public class PuntoGeografico {
    // Variables
    private double latitud;
    private double longitud;
    // Constructores
    public PuntoGeografico() {
        this.latitud = 0.0;
        this.longitud = 0.0;
    }
    public PuntoGeografico(double latitud, double longitud) {
        try {
            setLatitud(latitud);
            setLongitud(longitud);
        } catch (IllegalArgumentException l){
            throw l;
        }
    }
    // Getters y setters
    public double getLatitud() {return latitud;}
    public void setLatitud(double latitud) {
        if (latitud < -90 || latitud > 90) {
            throw new IllegalArgumentException("ERROR. La latitud introducida no es válida");
        } else {
            this.latitud = latitud;
        }
    }
    public double getLongitud() {return longitud;}
    public void setLongitud(double longitud) {
        if (longitud < -180 || longitud > 180) {
            throw new IllegalArgumentException("ERROR. La longitud introducida no es válida");
        } else {
            this.longitud = longitud;
        }
    }
    // Métodos
    public void mostrarGradosDecimales() {
        System.out.println("La latitud de las coordenadas actuales es: " + latitud);
        System.out.println("La longitud de las coordenadas actuales es: " + longitud);
    }
    public void mostrarFormatoDNS() {
        int gradoLatitud = (int) this.latitud;
        int minutoLatitud = (int) (this.latitud * 100.0) % 100;
        int segundoLatitud = (int) (minutoLatitud * 100.0) % 100;
        System.out.println("La latitud es: " + gradoLatitud + "º " + minutoLatitud + "\' " + segundoLatitud + "\" .");

        int gradoLongitud = (int) this.longitud;
        int minutoLongitud = (int) (this.longitud * 100.0) % 100;
        int segundoLongitud = (int) (minutoLongitud * 100.0) % 100;
        System.out.println("La longitud es: " + gradoLongitud + "º " + minutoLongitud + "\' " + segundoLongitud + "\" .");
    }
    public PuntoGeografico generarAleatorio() {
        Random random = new Random();
        
        double latitudAleatoria = -90 + (90 - (-90)) * random.nextDouble();
        double longitudAleatoria = -180 + (180 - (-180)) * random.nextDouble();

        return new PuntoGeografico(latitudAleatoria, longitudAleatoria);
    }
    public String urlGoogleMaps(){
        String url = "https://www.google.es/maps/@" + this.latitud + "," + this.longitud + ",12z";
        return url;
    }
    public String urlOpenStreetMaps(){
        String url = "https://www.openstreetmap.org/#map=14/" + this.latitud + "/" + this.longitud;
        return url;
    }
    public String urlNominatimXml() {
        String url = "https://nominatim.openstreetmap.org/reverse?format=xml&lat=" + latitud + "&lon=" + longitud + "&zoom=14";
        return url;
    }
    public String urlNominatimJson() {
        String url = "https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=" + latitud + "&lon=" + longitud;
        return url;
    }

    public static void main(String[] args) {
        PuntoGeografico pg1 = new PuntoGeografico(42.3716382, -8.6897279);
        PuntoGeografico pg2 = new PuntoGeografico().generarAleatorio();
        pg1.mostrarGradosDecimales();
        System.out.println(pg2.urlGoogleMaps());
        System.out.println(pg2.urlOpenStreetMaps());
    }
}