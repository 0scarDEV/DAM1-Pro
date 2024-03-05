package simud5;
/* Óscar Fernández Pastoriza */
public class Arma extends Item {
    /* ARMAS Y ARMADURAS */
    int ataque;
    boolean dosManos = false;
    public Arma(String nombre, double peso, int precioBase, int ataque, boolean dosManos) {
        super(nombre, peso, precioBase);
        this.ataque = ataque;
        this.dosManos = dosManos;
    }
    @Override public String toString() {
        return "- " + nombre + " (+" + ataque + " ataque)";
    }
}
