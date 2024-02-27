package interfacesejercicios.EP0935;
/* Óscar Fernández Pastoriza */
public class AppBanco {
    public static void main(String[] args) {
        Persona p1 = new Persona("12345678D", "Pepe", true, true);
        System.out.println(p1);
        p1.incrementarHorasTrabajadas(20);
        p1.incrementarSaldo(1000);
        System.out.println(p1);
    }
}