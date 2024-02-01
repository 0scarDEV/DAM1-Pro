package clasesapuntes.E0710;

import clasesapuntes.E0710.Maquinaria.Locomotora;
import clasesapuntes.E0710.Maquinaria.Tren;
import clasesapuntes.E0710.Personal.Maquinista;
import clasesapuntes.E0710.Personal.Mecanico;
import clasesapuntes.E0710.Personal.Mecanico.Especialidad;

public class App {

    public static void main(String[] args) {
        Mecanico m = new Mecanico("Marta Pérez", 0, Especialidad.MOTOR);
        Locomotora l = new Locomotora(null, 0, 2000, m);

        Maquinista ma = new Maquinista("Pepe López", null, 2000, null);

        Tren t = new Tren(l, ma);

        t.anhadirVagon(3000, 2500, "Madera");
        t.anhadirVagon(4000, 3000, "Hierro");
        t.anhadirVagon(5000, 3500, "Pasajeros");

        System.out.println(t);

    }

}