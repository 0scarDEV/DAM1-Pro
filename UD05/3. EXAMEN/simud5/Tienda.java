package simud5;

import java.util.Arrays;

public class Tienda {
    String nombre;
    Item[] stock;
    int saldo;
    public Tienda(String nombre) {
        this.nombre = nombre;
    }
    public void setStock(Item[] stock) {
        this.stock = stock;
    }
    public Item[] getStock() {
        return stock;
    }
    public void mostrar() {
        for (int i = 0; i < stock.length; i++) {
            System.out.println((i+1) + ". " + stock[i].toString());
        }
    }
    public void retirarItem(int index) {
        Item[] aux = new Item[stock.length - 1];
        index -= 1;
        int j = 0;
        for (int i = 0; i < stock.length; i++) {
            if (i != index) {
                aux[j] = stock[i];
                j++;
            }
        }
        this.saldo += stock[index].precioBase;
        this.stock = aux;
    }

    public void addItem(Item item) {
        stock = Arrays.copyOf(stock, stock.length + 1);
        stock[stock.length - 1] = item;
        saldo -= item.precioBase;
    }
}