package herenciasapuntes.hora;
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
            this.segundo = 0;
            super.inc();
        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format(":%02d", segundo);
    }
    boolean equals(HoraExacta otraHoraExacta) {
        return hora == otraHoraExacta.hora && minuto == otraHoraExacta.minuto && segundo == otraHoraExacta.segundo;
    }
}