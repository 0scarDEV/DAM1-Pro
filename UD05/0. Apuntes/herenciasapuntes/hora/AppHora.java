package herenciasapuntes.hora;

public class AppHora {
    public static void main(String[] args) {
        System.out.println("HORA");
        Hora hora = new Hora(23,58);
        for (int i = 0; i < 10; i++) {
            hora.inc();
            System.out.println(hora.toString());
        }

        System.out.println("HORA EXACTA");
        HoraExacta horaExacta = new HoraExacta(23,59, 58);
        for (int i = 0; i < 10; i++) {
            horaExacta.inc();
            System.out.println(horaExacta.toString());
        }

        HoraExacta otraHoraExacta = new HoraExacta(0,0, 8);
        System.out.println(horaExacta.equals(otraHoraExacta));
    }
}
