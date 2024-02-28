package juegoDeRol;
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

        int danho = puntosAtaque - puntosDefensa;
        if (danho > 0) {
            p.perderVida(danho);

            if (danho > p.puntosVida) {
                danho = p.puntosVida;
            }
            p.sumarExperiencia(danho);
        } else {
            danho = 0;
        }

        return danho;
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
    public static Monstruo generaMonstruoAleatorio() {
        return switch (random(1, 10)) {
            case 1, 2, 3, 4 -> new Orco();
            case 5, 6, 7 -> new Aranha();
            case 8, 9 -> new Troll();
            default -> new Dragon();
        };
    }
    // Métodos auxiliares
    protected static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
