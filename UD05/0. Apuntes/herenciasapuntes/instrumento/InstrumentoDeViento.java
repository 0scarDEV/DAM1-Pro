package herenciasapuntes.instrumento;

public abstract class InstrumentoDeViento extends Instrumento {
    Tipo tipo;
    public enum Tipo {METAL, MADERA}
    public InstrumentoDeViento(String tipo) {
        this.tipo = Tipo.valueOf(tipo);
    }
}