package interfacesejercicios.EP0928b_29_30;
import interfacesejercicios.EP0916_17_18_24_25.Lista;
import java.time.LocalDateTime;
/* Óscar Fernández Pastoriza */
public class EP0929 {
    /* EP0929. Usar la clase Lista de elementos Object para almacenar una serie de jornadas de empleados como las de la Actividad de ampliación EP0928. Una vez insertadas, ordenar la lista y mostrar por pantalla sus elementos. */
    public static void main(String[] args) {
        Lista l = new Lista();
        LocalDateTime l1 = LocalDateTime.now();
        LocalDateTime l2 = LocalDateTime.now();

        Jornada j1 = new Jornada("1234", l1, l2);
        Jornada j2 = new Jornada("1111", l1, l2);
        Jornada j3 = new Jornada("1222", l1, l2);
        Jornada j4 = new Jornada("1333", l1, l2);

        l.addInicio(j4);
        l.addInicio(j2);
        l.addInicio(j1);
        l.addInicio(j3);

        l.ordenar();

        l.mostrar();
    }
}
