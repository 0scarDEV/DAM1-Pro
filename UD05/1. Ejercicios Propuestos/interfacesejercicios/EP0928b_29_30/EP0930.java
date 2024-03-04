package interfacesejercicios.EP0928b_29_30;
import interfacesejercicios.EP0916_17_18_24_25.Lista;
import java.time.LocalDateTime;
/* Óscar Fernández Pastoriza */
public class EP0930 {
    /* EP0930. Implementar una clase comparadora para ordenar las jornadas de trabajo (ver actividades anteriores) por orden de número de minutos trabajados. Ordenar la lista de la Actividad de ampliación EP0929 por dicho orden y mostrarla por pantalla. */
    public static void main(String[] args) {
        Lista l = new Lista();
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.now().plusMinutes(40);
        LocalDateTime l3 = LocalDateTime.now().plusMinutes(20);
        LocalDateTime l4 = LocalDateTime.now().plusMinutes(30);

        Jornada j1 = new Jornada("1234", l1, l2);
        Jornada j2 = new Jornada("1111", l1, l2);
        Jornada j3 = new Jornada("1222", l1, l3);
        Jornada j4 = new Jornada("1333", l1, l4);

        l.addInicio(j4);
        l.addInicio(j2);
        l.addInicio(j1);
        l.addInicio(j3);

        l.ordenar(new ComparadorMinutos());

        l.mostrar();
    }
}
