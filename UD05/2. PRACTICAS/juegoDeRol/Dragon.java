package juegoDeRol;

public class Dragon extends Monstruo {
    public Dragon() {
        ataque = random(100, 200);
        defensa = random(60, 100);
        velocidad = random(80, 120);
        puntosVida = random(120, 250);
    }
}