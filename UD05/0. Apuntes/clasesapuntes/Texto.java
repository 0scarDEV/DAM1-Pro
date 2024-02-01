package clasesapuntes;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
    String cadenaCaracteres;
    final int LONGITUD_MAXIMA;
    LocalDate fechaCreacion;
    LocalDateTime fechaUltModificacion;
    public Texto(int longitudMaxima) {
        this.cadenaCaracteres = "";
        this.LONGITUD_MAXIMA = longitudMaxima;
        this.fechaCreacion = LocalDate.now();
        this.fechaUltModificacion = LocalDateTime.now();
    }
    public void mostrarInfo() {
        System.out.println("Texto: \"" + cadenaCaracteres + "\"");
        System.out.println("Longitud máxima: " + LONGITUD_MAXIMA);
        System.out.println("Fecha de creación: " + fechaCreacion);
        System.out.println("Fecha de última modificación: " + fechaUltModificacion);
        System.out.println("Número de vocales: " + contarVocales());
    }
    public boolean addInicio(char caracter) {
        if (cadenaCaracteres.length() < LONGITUD_MAXIMA) {
            cadenaCaracteres = String.valueOf(caracter).concat(cadenaCaracteres);
            fechaUltModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }
    public boolean addInicio(String cadenaAuxiliar) {
        if (cadenaCaracteres.length() + cadenaAuxiliar.length() <= LONGITUD_MAXIMA) {
            cadenaCaracteres = cadenaAuxiliar.concat(cadenaCaracteres);
            fechaUltModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }
    public boolean addFinal(char caracter) {
        if (cadenaCaracteres.length() < LONGITUD_MAXIMA) {
            cadenaCaracteres = cadenaCaracteres.concat(String.valueOf(caracter));
            fechaUltModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }
    public boolean addFinal(String cadenaAuxiliar) {
        if (cadenaCaracteres.length() + cadenaAuxiliar.length() <= LONGITUD_MAXIMA) {
            cadenaCaracteres = cadenaCaracteres.concat(cadenaAuxiliar);
            fechaUltModificacion = LocalDateTime.now();
            return true;
        }
        return false;
    }
    private int contarVocales() {
        int contarVocales = 0;
        String vocales = "aeiouáéíóúü";
        for (int i = 0; i < cadenaCaracteres.length(); i++) {
            for (int j = 0; j < vocales.length();j++) {
                if (cadenaCaracteres.toLowerCase().charAt(i) == vocales.charAt(j)) {
                    contarVocales++;
                }
            }
        }
        return contarVocales;
    }
}