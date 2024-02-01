package clasesapuntes.E0710.Personal;

public class Mecanico {
    String nombre;
    String telefono;
    public enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}
    Especialidad especialidad;

    public Mecanico(String nombre, int telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = String.valueOf(telefono);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        String str = nombre;

        str += telefono != null ? "; Teléfono = " + telefono : "";
        str += especialidad != null ? "; Especialidad = " + especialidad : "";

        return str;

    }


}