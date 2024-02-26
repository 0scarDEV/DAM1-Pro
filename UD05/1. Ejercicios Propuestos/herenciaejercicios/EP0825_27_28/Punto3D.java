package herenciaejercicios.EP0825_27_28;
/* Óscar Fernández Pastoriza */
public class Punto3D extends Punto {
    int z;
    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    double distancia(Punto3D otroPunto) {
        return Math.sqrt(Math.pow((this.x - otroPunto.x), 2) + Math.pow((this.y - otroPunto.y),2) + Math.pow((this.z - otroPunto.z), 2));
    }
    /* EP0827. Implementa el método equals() para las clases Punto y Punto3D, teniendo en cuenta que dos puntos son iguales solo si tienen todas sus coordenadas iguales. */
    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Punto3D punto3D = (Punto3D) o;
        return x == punto3D.x && y == punto3D.y && z == punto3D.z;
    }
}