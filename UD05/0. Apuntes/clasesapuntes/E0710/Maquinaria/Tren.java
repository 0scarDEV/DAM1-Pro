package clasesapuntes.E0710.Maquinaria;

import clasesapuntes.E0710.Personal.Maquinista;
import clasesapuntes.E0710.Personal.Mecanico;

import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon[] vagones;
    Maquinista maquinista;

    public Tren(Locomotora locomotora, Vagon[] vagones, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.vagones = vagones;
        this.maquinista = maquinista;
    }


    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
    }


    public boolean anhadirVagon(double cargaMaxima, double cargaActual, String tipoMercancia){
        if (vagones == null || vagones.length < 5) {
            //TODO
            if (vagones == null)
                vagones = new Vagon[1];
            else
                vagones = Arrays.copyOf(vagones, vagones.length + 1);
            vagones[vagones.length - 1] = new Vagon(vagones.length, cargaMaxima, cargaActual, tipoMercancia);
            return true;
        }
        return false;

    }


    @Override
    public String toString() {
        String str = "TREN \n";
        str += "- Maquinista = " + maquinista + "\n";
        str += "- Locomotora = " + locomotora + "\n";
        str += "- Vagones=\n";

        for (int i = 0; i < vagones.length; i++)
            str += "... " + vagones[i] + "\n";

        return str;
    }

    public static void main(String[] args) {
        Mecanico m = new Mecanico("Marta Pérez", 0, Mecanico.Especialidad.MOTOR);
        Locomotora l = new Locomotora(null, 0, 2000, m);

        Vagon[] vagones = {
                new Vagon(1, 3000, 2500, "Madera"),
                new Vagon(2, 4000, 3000, "Hierro"),
                new Vagon(3, 5000, 3500, "Pasajeros")
        };

        Maquinista ma = new Maquinista("Pepe López", null, 2000, null);

        Tren t = new Tren(l, vagones, ma);

        System.out.println(t);

    }

}