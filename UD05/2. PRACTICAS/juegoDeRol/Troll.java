package juegoDeRol;

public class Troll extends Monstruo {
    public Troll() {
        ataque = random(60, 120);
        defensa = random(50, 70);
        velocidad = random(20, 40);
        puntosVida = random(100, 200);
    }
}