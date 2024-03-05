package simud5;
/* Óscar Fernández Pastoriza */
public class Armadura extends Item {
    /* ARMAS Y ARMADURAS */
    private int defensa;
    public enum Tipo {YELMO, ARMADURA, ESCUDO};
    private Tipo tipo;
    public Armadura(String nombre, double peso, int precioBase, int defensa, String tipo) {
        super(nombre, peso, precioBase);
        this.defensa = defensa;
        this.tipo = Tipo.valueOf(tipo);
    }
    public Tipo getTipo() {
        return tipo;
    }
    @Override public String toString() {
        return "- " + nombre + " (+" + defensa + " defensa)";
    }
}