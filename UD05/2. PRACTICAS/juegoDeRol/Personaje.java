package juegoDeRol;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

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
    final static byte PORCENTAJE_SUBIDA_NIVEL = 5;
    final static byte PUNTOS_VIDA_BASE = 50;
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public short getConstitucion() {
        return constitucion;
    }
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
    // Métodos auxiliares
    private static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Aragorn", Raza.HUMANO, 90, 90, 90, 10, 16252, 125);
        p1.sumarExperiencia(2000);

        Personaje p2 = new Personaje("Mara", Raza.ELFO, 100, 100, 100);

        Personaje p3 = new Personaje("Dodol Bazbal", Raza.ENANO);

        Personaje p4 = new Personaje("lady Jet");

        Personaje p5 = new Personaje();

        Personaje[] banda = {p2, p1, p3, p4, p5};

        for (int i = 0; i < banda.length; i++) {
            banda[i].mostrar();
        }

        ComparadorPersonajes comparador = new ComparadorPersonajes();
        Arrays.sort(banda, comparador);

        System.out.println();
        for (int i = 0; i < banda.length; i++) {
            banda[i].mostrar();
        }
    }
    // Combate Singular
    public byte sumarExperiencia(int puntos) {
        byte nivelesQueSube = 0;
        experiencia += puntos;

        while (experiencia >= 1000) {
            nivelesQueSube++;
            experiencia -= 1000;
        }

        return nivelesQueSube;
    }
    public void subirNivel() {
        nivel++;
        fuerza *= 1 + (PORCENTAJE_SUBIDA_NIVEL / 100);
        agilidad *= 1 + (PORCENTAJE_SUBIDA_NIVEL / 100);
        constitucion *= 1 + (PORCENTAJE_SUBIDA_NIVEL / 100);
    }
    boolean perderVida(int puntos) {
        this.puntosVida -= puntosVida;
        return !estaVivo();
    }
    boolean estaVivo() {
        return this.puntosVida > 0;
    }
    int atacar(Personaje enemigo) {
        int puntosAtaque = random(0, 100) * fuerza;
        int puntosDefensa = random(0, 100) * enemigo.agilidad;

        int danho = puntosAtaque - puntosDefensa;
        if (danho > 0) {
            enemigo.perderVida(danho);

            if (danho > enemigo.puntosVida) {
                danho = enemigo.puntosVida;
            }

            this.sumarExperiencia(danho);
            enemigo.sumarExperiencia(danho);

        } else if (danho < 0) {
            danho = 0;
        }

        return danho;
    }
    // Monstruos
    int atacar(Monstruo enemigo) {
        int puntosAtaque = random(0, 100) * fuerza;
        int puntosDefensa = random(0, 100) * enemigo.defensa;

        int danho = puntosAtaque - puntosDefensa;
        if (danho >= 0) {
            enemigo.perderVida(danho);

            if (danho > enemigo.puntosVida) {
                danho = enemigo.puntosVida;
            }

            this.sumarExperiencia(danho);
        } else {
            danho = 0;
        }

        return danho;
    }
    // Equals y ordenar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return  fuerza == personaje.fuerza
                && agilidad == personaje.agilidad
                && constitucion == personaje.constitucion
                && nivel == personaje.nivel
                && experiencia == personaje.experiencia
                && puntosVida == personaje.puntosVida
                && Objects.equals(nombre, personaje.nombre)
                && raza == personaje.raza;
    }
    static Personaje[] sortAgilidadDesc(Personaje[] personajes){
        Personaje[] A = Arrays.copyOf(personajes, personajes.length);

        int i, j;
        Personaje aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1].agilidad > A[j].agilidad) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
}