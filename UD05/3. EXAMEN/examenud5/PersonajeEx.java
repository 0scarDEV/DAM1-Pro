package examenud5;
/* Óscar Fernández Pastoriza */
import juegoDeRol.Personaje;
import java.util.Arrays;
public class PersonajeEx extends Personaje {
    /* INVENTARIO DE PERSONAJE */
    int numMonedas = 0;
    Item[] inventario = new Item[0];
    private double cargaActual = 0;
    private final double CARGA_MAX = 50 + getConstitucion() * 2;
    public PersonajeEx(String nombre, String raza) {
        super(nombre, Raza.valueOf(raza));
    }
    boolean addToInventario(Item item) {
        // Si se excede la carga, devuelve false y no hace nada.
        if (cargaActual + item.peso >= CARGA_MAX) {
            return false;
        }

        // Si no se excede la carga, se añade el objeto al inventario.
        inventario = Arrays.copyOf(inventario, inventario.length + 1);
        inventario[inventario.length - 1] = item;
        cargaActual += item.peso;
        return true;
    }
    void setMonedas(int num) {
        numMonedas = num;
    }
    void mostrarInventario() {
        System.out.println();
        System.out.println("Inventario de " + getNombre() + ":");
        for (int i = 0; i < inventario.length; i++) {
            System.out.println((i+1) + ". " + inventario[i].toString());
        }
        /*
        System.out.println();
        System.out.println("Carga total transportada: " + cargaActual + "/" + CARGA_MAX + " kilos");
        */
    }
    public double getCargaActual() {
        return cargaActual;
    }
    public double getCargaMaxima() {
        return CARGA_MAX;
    }
    /* ARMAS Y ARMADURAS */
    private Item itemManoIzq = null;
    private Item itemManoDch = null;
    public boolean setItemManoIzq(Arma itemManoIzq) {
        boolean res = true;
        if (itemManoIzq.dosManos) {
            if (itemManoDch == null && this.itemManoIzq == null){
                this.itemManoIzq = itemManoIzq;
                this.itemManoDch = itemManoIzq;
            } else {
                res = false;
            }
        } else {
            if (this.itemManoIzq == null) {
                this.itemManoIzq = itemManoIzq;
            } else {
                res = false;
            }
        }
        return res;
    }
    public boolean setItemManoIzq(Armadura itemManoIzq) {
        if (itemManoIzq.getTipo().equals(Armadura.Tipo.ESCUDO) && this.itemManoIzq == null) {
            this.itemManoIzq = itemManoIzq;
            return true;
        }
        return false;
    }
    public boolean setItemManoDch(Arma itemManoDch) {
        boolean res = true;
        if (itemManoDch.dosManos) {
            if (this.itemManoDch == null && itemManoIzq == null){
                this.itemManoDch = itemManoDch;
                this.itemManoIzq = itemManoDch;
            } else {
                res = false;
            }
        } else {
            if (itemManoDch == null) {
                this.itemManoDch = itemManoDch;
            } else {
                res = false;
            }
        }
        return res;
    }
    public boolean setItemManoDch(Armadura itemManoDch) {
        if (itemManoDch.getTipo().equals(Armadura.Tipo.ESCUDO) && this.itemManoDch == null) {
            this.itemManoDch = itemManoDch;
            return true;
        }
        return false;
    }
    private Armadura armaduraCabeza = null;
    private Armadura armaduraCuerpo = null;
    /*
    public void setArmaduraCabeza(Armadura armaduraCabeza) {
        if (armaduraCabeza.getTipo().equals(Armadura.Tipo.YELMO) && this.armaduraCabeza == null) {
            this.armaduraCabeza = armaduraCabeza;
        }
    }
    public void setArmaduraCuerpo(Armadura armaduraCuerpo) {
        if (armaduraCuerpo.getTipo().equals(Armadura.Tipo.ARMADURA) && this.armaduraCuerpo == null) {
            this.armaduraCuerpo = armaduraCuerpo;
        }
    }
     */
    public boolean equipar(Arma item) {
        boolean res = true;
        if (item.dosManos) {
            if (!setItemManoDch(item)) {
                res = false;
            }
        } else {
            if (!setItemManoDch(item)) {
                res = setItemManoIzq(item);
            }
        }
        return res;
    }
    public boolean equipar(Armadura item) {
        boolean res = true;
        if (item.getTipo().equals(Armadura.Tipo.YELMO)) {
            if (this.armaduraCabeza != null) {
                res = false;
            } else {
                this.armaduraCabeza = item;
            }
        }
        if (item.getTipo().equals(Armadura.Tipo.ARMADURA)) {
            if (this.armaduraCuerpo == null) {
                this.armaduraCuerpo = item;
            } else {
                res = false;
            }
        }
        if (item.getTipo().equals(Armadura.Tipo.ESCUDO)) {
            if (!setItemManoDch(item)) {
                res = setItemManoIzq(item);
            }
        }
        return res;
    }
    public void mostrarEquipo() {
        System.out.println("Equipo de combate de " + getNombre());
        if (armaduraCabeza != null) {
            System.out.println(armaduraCabeza);
        }
        if (armaduraCuerpo != null) {
            System.out.println(armaduraCuerpo);
        }
        if (itemManoDch != null) {
            System.out.println(itemManoDch);
        }
        if (itemManoIzq != null && !itemManoIzq.equals(itemManoDch)) {
            System.out.println(itemManoIzq);
        }
        System.out.println();
    }
}