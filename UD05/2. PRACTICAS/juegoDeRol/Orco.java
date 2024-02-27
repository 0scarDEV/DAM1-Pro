package juegoDeRol;

public class Orco extends Monstruo {
    public Orco() {
        ataque = random(30, 80);
        defensa = random(30, 50);
        velocidad = random(30, 60);
        puntosVida = random(30, 100);
    }
}