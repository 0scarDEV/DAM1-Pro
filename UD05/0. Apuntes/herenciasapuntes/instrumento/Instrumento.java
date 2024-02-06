package herenciasapuntes.instrumento;
import java.util.Arrays;

public abstract class Instrumento {
    public enum Nota {DO, RE, MI, FA, SOL, LA, SI}
    Nota[] melodia;
    public Instrumento() {
        melodia = new Nota[0];
    }
    public void add(Nota nota) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);
        melodia[melodia.length - 1] = nota;
    }
    abstract void interpretar();
}