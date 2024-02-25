package herenciaejercicios.EP0826;
/* Óscar Fernández Pastoriza */
public class CalendarioExacto extends Calendario {
    /* EP0826. A partir de la clase Calendario, implementada en la Actividad de aplicación 7.15, escribe la clase CalendarioExacto, que determina un instante de tiempo exacto formado por un año, un mes, un día, una hora y un minuto. Implementa los métodos toString(), equals() y aquellos necesarios para manejar la clase. */
    private int hora;
    private int minuto;
    public CalendarioExacto(int anho, int mes, int dia, int hora, int minuto) {
        super(dia, mes, anho);
        this.hora = hora;
        this.minuto = minuto;
    }
    @Override
    public String toString() {
        return hora + ":" + minuto + "-" + dia + "/" + mes + "/" + anho;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CalendarioExacto c = (CalendarioExacto) o;
        return anho == c.anho && mes == c.mes && dia == c.dia && hora == c.hora && minuto == c.minuto;
    }
    public void setHora(int hora) {
        if (hora < 24 && hora >= 0) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora introducida no válido.");
        }
    }
    public void setMinuto(int minuto) {
        if (hora < 60 && hora >= 0) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minutos introducido no válido.");
        }
    }
    public void incrementarHora() {
        if (this.hora < 23) {
            setHora(this.hora++);
        } else if (this.hora == 23) {
            setHora(0);
            incrementarDia();
        }
    }
    public void incrementarMinuto() {
        if (this.minuto < 59) {
            setMinuto(minuto++);
        } else if (this.minuto == 59) {
            setMinuto(0);
            incrementarHora();
        }
    }
}