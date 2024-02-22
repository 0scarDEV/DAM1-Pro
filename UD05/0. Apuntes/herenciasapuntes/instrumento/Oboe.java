package herenciasapuntes.instrumento;

public class Oboe extends InstrumentoDeViento {
    public Oboe() {
        super("MADERA");
    }
    @Override public void interpretar() {
        System.out.print("MELODIA DE OBOE: ");
        for (int i = 0; i < melodia.length; i++) {
            System.out.print (melodia[i] + " ");
        }
    }
}