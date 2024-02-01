package clasesapuntes.E0710.Personal;

public class Maquinista {
    String nombre;
    final String DNI;
    double sueldo;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    @Override
    public String toString() {
        String str = nombre;

        str += DNI != null ? "; DNI=" + DNI : "";
        str += sueldo != 0 ? "; Sueldo=" + sueldo : "";
        str += rango != null ? "; Rango=" + rango : "";

        return str;

    }
}