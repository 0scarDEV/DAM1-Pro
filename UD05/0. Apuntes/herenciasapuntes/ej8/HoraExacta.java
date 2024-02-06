package herenciasapuntes.ej8;
public class HoraExacta extends Hora {
    byte segundo;
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        setSegundo(segundo);
    }
    void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = (byte)segundo;
        }
    }
    public void inc() {
        this.segundo++;
        if (this.segundo == 60) {
            super.inc();
        }
    }
    boolean equals(HoraExacta otraHora) {
        return hora == otraHora.hora && minuto == otraHora.minuto && segundo == otraHora.segundo;
    }
}