package herenciaejercicios.EP0825_27_28;
/* Óscar Fernández Pastoriza */
public class Punto {
    /* EP0825. Define la clase Punto, que tiene como atributos las coordenadas x e y, de tipo entero, que lo sitúan en el plano. Además del constructor, implementa el método
    * double distancia(Punto otroPunto)
    * que devuelve la distancia a otro punto que se le pasa como parámetro.
    * A partir de Punto, por herencia, implementa la clase Punto3D, que representa un punto en tres dimensiones y necesita una coordenada adicional z. Reimplementa el método distancia() para puntos 3D. */
    int x;
    int y;
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double distancia(Punto otroPunto) {
        return Math.sqrt(Math.pow((this.x - otroPunto.x), 2) + Math.pow((this.y - otroPunto.y),2));
    }
    /* EP0827. Implementa el método equals() para las clases Punto y Punto3D, teniendo en cuenta que dos puntos son iguales solo si tienen todas sus coordenadas iguales. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Punto punto = (Punto) o;
        return x == punto.x && y == punto.y;
    }
}