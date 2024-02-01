package clasesapuntes.E0710.Maquinaria;
import clasesapuntes.E0710.Personal.Mecanico;
import java.time.LocalDate;

public class Locomotora {
    final String MATRICULA;
    double potencia;
    int anhoFabricacion;
    Mecanico mecanico;

    public Locomotora(String mATRICULA, double potencia, int anhoFabricacion, Mecanico mecanico) {
        MATRICULA = mATRICULA;
        this.potencia = potencia;
        this.anhoFabricacion = anhoFabricacion;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        String str = "";

        str += MATRICULA != null ? MATRICULA : "";
        str += potencia != 0 ? " Potencia = " + potencia : "";
        str += anhoFabricacion != 0 ? " Año de Fabricación = " + anhoFabricacion : "";
        str += mecanico != null ? " Mecánico = " + mecanico : "";

        return str;
    }



}