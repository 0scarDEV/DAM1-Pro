package herenciaejercicios.EP0824;
import herenciaejercicios.EP0823.Poligono;
/* Óscar Fernández Pastoriza
* EP0824. Heredando de Poligono, implementa las clases no abstractas Triangulo y Rectangulo. */
public class Rectangulo extends Poligono {
    @Override public double area() {
        return super.base * super.altura;
    }
}