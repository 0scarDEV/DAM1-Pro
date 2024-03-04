package interfacesejercicios.EP0931_32_33;
import interfacesejercicios.EP0916_17_18_24_25.Lista;
/* Óscar Fernández Pastoriza */
public class EP0932 {
    public static void main(String[] args) {
        /* EP0932. Utilizar la clase Lista para guardar una serie de llamadas. A continuación, ordenarla con el criterio de orden natural y mostrarla por pantalla. */

        Lista l = new Lista();
        Llamada l1 = new Llamada();
        Llamada l2 = new Llamada();
        Llamada l3 = new Llamada();
        Llamada l4 = new Llamada();

        l.addInicio(l4);
        l.addInicio(l2);
        l.addInicio(l1);
        l.addInicio(l3);

        l.ordenar();

        l.mostrar();

        /* EP0933. Implementar una clase comparadora que ordene las llamadas por coste. Usarla para ordenar la lista de la Actividad de ampliación EP0932 y mostrar el resultado por pantalla. */

        l.ordenar(new ComparadorCoste());

        l.mostrar();
    }
}