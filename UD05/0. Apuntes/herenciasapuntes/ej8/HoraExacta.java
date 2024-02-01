package herenciasapuntes.ej8;
public class HoraExacta extends Hora{
    int segundo;
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }
    void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }
    void inc() {
        this.segundo++;
        if (this.segundo == 60) {
            super.inc();
        }
    }
    boolean equals(HoraExacta otraHora) {
        if (hora == otraHora.hora && minuto == otraHora.minuto && segundo == otraHora.segundo) {
            return true;
        }
        return false;
    }
}