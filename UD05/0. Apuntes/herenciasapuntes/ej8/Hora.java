package herenciasapuntes.ej8;

public class Hora {
    byte hora;
    byte minuto;
    public void inc() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minuto);
    }
    public Hora(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }
    public boolean setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = (byte)hora;
            return true;
        }
        return false;
    }
    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = (byte)minuto;
            return true;
        }
        return false;
    }
}