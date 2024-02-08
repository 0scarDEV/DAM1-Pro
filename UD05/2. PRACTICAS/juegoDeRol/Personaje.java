package juegoDeRol;
/* Óscar Fernández Pastoriza */
public class Personaje {
    // Variables
    String nombre;
    public enum Raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL}
    Raza raza;
    short fuerza;
    short agilidad;
    short constitucion;
    byte nivel;
    int experiencia;
    short puntosVida;
    final static byte PUNTOS_VIDA_BASE = 50;

    // Constructores
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int puntosVida) {
        if (fuerza <= 0 || agilidad <= 0 || constitucion <= 0 || nivel <= 0 || puntosVida <= 0) {
            throw new IllegalArgumentException("Las características físicas del personaje no pueden ser menores que 1.");
        }
        if (experiencia < 0) {
            throw new IllegalArgumentException("Las experiencia del personaje no puede ser menor que 0.");
        }

        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = (short) fuerza;
        this.agilidad = (short) agilidad;
        this.constitucion = (short) constitucion;
        this.nivel = (byte) nivel;
        this.experiencia = experiencia;
        this.puntosVida = (short) puntosVida;
    }
    public Personaje(String nombre, Raza raza, int fuerza, int agilidad, int constitucion) {
        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0, constitucion + PUNTOS_VIDA_BASE);
    }
    public Personaje(String nombre, Raza raza) {
        this(nombre, raza, random(1, 100), random(1, 100), random(1, 100));
    }
    public Personaje(String nombre) {
        this(nombre, Raza.HUMANO);
    }
    public Personaje() {
        this("Desconocido");
    }
    // Métodos propios
    public void mostrar() {
        System.out.println("Personaje [nombre=" + nombre + ", raza=" + raza + ", fuerza=" + fuerza + ", agilidad=" + agilidad + ", constitucion=" + constitucion + ", nivel=" + nivel + ", experiencia=" + experiencia + ", puntosVida=" + puntosVida + "]");
    }
    @Override public String toString() {
        return nombre + "(" + puntosVida + "/" + (constitucion + Personaje.PUNTOS_VIDA_BASE) + ")";
    }
    public boolean sumarExperiencia(int puntos) {
        boolean subeDeNivel = false;
        experiencia += puntos;
        if (experiencia / 1000 >= nivel) {
            nivel = (byte) (experiencia / 1000);
            subeDeNivel = true;
        }
        return subeDeNivel;
    }
    // Métodos auxiliares
    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Aragorn", Raza.HUMANO, 90, 90, 90, 10, 16252, 125);

        Personaje p2 = new Personaje("Mara", Raza.ELFO, 100, 100, 100);

        Personaje p3 = new Personaje("Dodol Bazbal", Raza.ENANO);

        Personaje p4 = new Personaje("lady Jet");

        Personaje p5 = new Personaje();

        Personaje[] banda = {p1, p2, p3, p4, p5};

        for (int i = 0; i < banda.length; i++) {
            banda[i].mostrar();
        }
    }
}