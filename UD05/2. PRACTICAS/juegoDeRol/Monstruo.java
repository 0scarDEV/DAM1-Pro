package juegoDeRol;

import java.awt.event.MouseAdapter;

public class Monstruo {
    String nombre;
    int ataque;
    int defensa;
    int velocidad;
    int puntosVida;
    boolean perderVida(int puntos) {
        this.puntosVida -= puntosVida;
        return !estaVivo();
    }
    boolean estaVivo() {
        return this.puntosVida > 0;
    }
    int atacar(Personaje p) {
        int puntosAtaque = random(0, 100) * ataque;
        int puntosDefensa = random(0, 100) * p.agilidad;

        int diferencia = puntosAtaque - puntosDefensa;
        if (diferencia > 0) {
            p.perderVida(diferencia);

            if (diferencia > p.puntosVida) {
                p.sumarExperiencia(p.puntosVida);
            } else {
                p.sumarExperiencia(diferencia);
            }

            return diferencia;
        }

        return 0;
    }
    public void mostrar() {
        System.out.println("Monstruo{" +
                "nombre='" + nombre + '\'' +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                ", puntosVida=" + puntosVida +
                '}');
    }

    @Override public String toString() {
        return nombre + "(" + puntosVida + ")";
    }

    // Métodos auxiliares
    protected static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
