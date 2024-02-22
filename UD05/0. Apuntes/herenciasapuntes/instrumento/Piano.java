package herenciasapuntes.instrumento;

public class Piano extends Instrumento {
    @Override public void interpretar() {
        System.out.print("MELODIA DE PIANO: ");
        for (int i = 0; i < melodia.length; i++) {
            System.out.print (melodia[i] + " ");
        }
    }
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.add(Nota.RE);
        piano.add(Nota.DO);
        piano.interpretar();
    }
}
