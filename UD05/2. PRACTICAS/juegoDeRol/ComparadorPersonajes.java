package juegoDeRol;

import java.util.Comparator;

public class ComparadorPersonajes implements Comparator {
    @Override public int compare(Object o1, Object o2) {
        Personaje p1 = (Personaje) o1;
        Personaje p2 = (Personaje) o2;

        int res = p2.nivel - p1.nivel;
        if (res == 0) {
            res = p2.experiencia - p1.experiencia;
        }

        return res;
    }
}
