package interfacesejercicios.EP0934;
import java.util.Random;
/* Óscar Fernández Pastoriza */
public class Carta implements Comparable<Carta> {
    /* EP0934. Las cartas, formadas por un palo y un número, son la base para muchos juegos de azar. Construir las clases necesarias que permitan ordenar una serie de cartas según el palo y el número, o solamente por su número. Asimismo, como el azar es algo ligado a los juegos de cartas, implementar en la clase Carta un método estático que construya y devuelva una carta al azar. */
    public enum Palo {Bastos, Espadas, Oro, Copas};
    Palo palo;
    int num;
    public Carta(Palo palo, int num) {
        this.palo = palo;
        this.num = num;
    }
    @Override
    public int compareTo(Carta o) {
        return num - o.num;
    }
    static ComparadorPorPaloyNumero comparador = new ComparadorPorPaloyNumero();
    static Carta generadorAleatorio() {
        Random random = new Random();
        Palo[] palos = Palo.values();
        int numAleatorio = random.nextInt(12) + 1;
        int numPalo = random.nextInt(palos.length);
        return new Carta(palos[numPalo], numAleatorio);
    }
    @Override public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", num=" + num +
                '}';
    }
}