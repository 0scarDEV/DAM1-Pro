package herenciasapuntes.instrumento;

public class Trompeta extends InstrumentoDeViento {
    public Trompeta() {
        super("METAL");
    }
    @Override public void interpretar() {
        System.out.print("MELODIA DE TROMPETA: ");
        for (int i = 0; i < melodia.length; i++) {
            System.out.print (melodia[i] + " ");
        }
    }
}
