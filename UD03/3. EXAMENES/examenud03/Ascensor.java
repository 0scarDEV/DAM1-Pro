package examenud03;
/* Por Óscar Fernández Pastoriza */
public class Ascensor {
    private int pisoActual;
    public final int PLANTA_MAS_BAJA, PLANTA_MAS_ALTA;

    public Ascensor(int pisoActual, int PLANTA_MAS_BAJA, int PLANTA_MAS_ALTA) {
        setPisoActual(pisoActual);
        if (PLANTA_MAS_BAJA >= PLANTA_MAS_ALTA || (pisoActual > PLANTA_MAS_ALTA && pisoActual < PLANTA_MAS_BAJA)) {
            throw new IllegalArgumentException("ERROR. La planta más baja es mayor que la planta más alta o el piso actual no se encuentra entre ellas.");
        } else {
            this.PLANTA_MAS_BAJA = PLANTA_MAS_BAJA;
            this.PLANTA_MAS_ALTA = PLANTA_MAS_ALTA;
        }
    }

    public Ascensor( int PLANTA_MAS_BAJA, int PLANTA_MAS_ALTA) {
        this(PLANTA_MAS_BAJA, PLANTA_MAS_BAJA, PLANTA_MAS_ALTA);
    }

    public Ascensor() {
        this.PLANTA_MAS_BAJA = -2;
        setPisoActual(this.PLANTA_MAS_BAJA);
        this.PLANTA_MAS_ALTA = 9;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        if (pisoActual > PLANTA_MAS_ALTA && pisoActual < PLANTA_MAS_BAJA) {
            throw new IllegalArgumentException("ERROR. De llevar a cabo la operación el ascensor saldría del rango de pisos.");
        } else {
            this.pisoActual = pisoActual;
        }
    }

    public boolean subir(){
        return subirN(1);
    }
    public boolean bajar(){
        return bajarN(1);
    }

    public boolean subirN(int n){
        if ((pisoActual + n) > PLANTA_MAS_ALTA) {
            return false;
        } else {
            this.pisoActual = this.pisoActual + n;
            return true;
        }
    }
    public boolean bajarN(int n){
        if ((pisoActual - n) < PLANTA_MAS_BAJA) {
            return false;
        } else {
            this.pisoActual = this.pisoActual - n;
            return true;
        }
    }
    public boolean irAlPisto(int destino){
        if (destino < PLANTA_MAS_BAJA || destino > PLANTA_MAS_ALTA) {
            return false;
        } else {
            this.pisoActual = destino;
            return true;
        }
    }

    public void mostrar(){
        System.out.println(this.pisoActual);
    }
}