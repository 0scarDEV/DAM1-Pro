package herenciaejercicios.EP0826;
/* Óscar Fernández Pastoriza
 * EP0715. Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La clase debe disponer de los métodos:
 * Calendario(int año, int mes, int dia): que crea un objeto con los datos pasados como parámetros, siempre y cuando, la fecha que representen sea correcta.
        void incrementarDia(): que incrementa en un día la fecha del calendario.
        void incrementarMes(): que incrementa en un mes la fecha del calendario.
        void incrementarAño(int cantidad): que incrementa la fecha del calendario en el número de años especificados. Ten en cuenta que el año 0 no existió.
        void mostrar(): muestra la fecha por consola.
        boolean iguales(Calendario otraFecha): que determina si la fecha invocante y la que se pasa como parámetro son iguales o distintas.
 * Por simplicidad, solo tendremos en consideración que existen meses con distinto número de días, pero no tendremos en cuenta los años bisiestos.
 * Amplía el programa para tener en cuenta también los años bisiestos.
 */
public class Calendario {
    int anho, mes, dia;
    public Calendario(int dia, int mes, int anho) {
        this.anho = anho;
        this.mes = mes;
        this.dia = dia;
    }
    public void setAnho(int anho) {
        if (anho != 0) {
            this.anho = anho;
        } else {
            throw new IllegalArgumentException("El año 0 no existió.");
        }
    }
    public void setMes(int mes) {
        if (mes > 12 || mes < 1) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mes introducido no válido.");
        }
    }
    public void setDia(int dia) {
        switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (dia > 31 || dia <= 0) {
                    throw new IllegalArgumentException("Dia introducido no válido para el mes introducido.");
                } else {
                    this.dia = dia;
                }
            }
            case 4, 6, 9, 11 -> {
                if (dia > 30 || dia <= 0) {
                    throw new IllegalArgumentException("Dia introducido no válido para el mes introducido.");
                } else {
                    this.dia = dia;
                }
            }
            case 2 -> {
                if (dia > 28 || dia <= 0) {
                    throw new IllegalArgumentException("Dia introducido no válido para el mes introducido.");
                } else {
                    this.dia = dia;
                }
            }
            default -> {
                this.dia = 0;
            }
        }
    }
    void incrementarDia() {
        int diaIncrementado;
        diaIncrementado = this.dia + 1;
        switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (diaIncrementado >= 31) {
                    this.dia = 1;
                    this.mes = this.mes + 1;
                } else {
                    this.dia = diaIncrementado;
                }
            }
            case 4, 6, 9, 11 -> {
                if (diaIncrementado >= 30) {
                    this.dia = 1;
                    this.mes = this.mes + 1;
                } else {
                    this.dia = diaIncrementado;
                }
            }
            case 2 -> {
                if (diaIncrementado >= 28) {
                    this.dia = 0;
                    this.mes = this.mes + 1;
                } else {
                    this.dia = diaIncrementado;
                }
            }
            default -> {
                this.dia = 0;
            }
        }
    }
    void incrementarMes() {
        if (this.mes == 12) {
            this.mes = 1;
        } else {
            this.mes = this.mes + 1;
        }
    }
    void incrementarAnho() {
        if (this.anho == -1) {
            this.anho = 1;
        } else {
            this.anho = this.anho + 1;
        }
    }
    void mostrar() {
        System.out.println("DD/MM/AAAA");
        System.out.println(this.dia + "/" + this.mes + "/" + this.anho);
    }
    boolean iguales(Calendario otraFecha) {
        if (this.anho == otraFecha.anho && this.mes == otraFecha.mes && this.dia == otraFecha.dia) {
            return true;
        } else {
            return false;
        }
    }
}