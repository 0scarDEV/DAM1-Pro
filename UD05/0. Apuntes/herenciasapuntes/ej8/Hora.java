package herenciasapuntes.ej8;

public class Hora {
    int hora;
    int minuto;

    void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
        }
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }

    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }
}