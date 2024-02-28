package examenud5;
/* Óscar Fernández Pastoriza */
import java.util.Objects;
public class Item {
    /* INVENTARIO DE PERSONAJE */
    String nombre;
    double peso;
    int precioBase;
    public Item(String nombre, double peso, int precioBase) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioBase = precioBase;
    }
    @Override
    public String toString() {
        return nombre + ", peso: " + peso + " kilos, precio: " + precioBase + " monedas";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return peso == item.peso && precioBase == item.precioBase && Objects.equals(nombre, item.nombre);
    }
}