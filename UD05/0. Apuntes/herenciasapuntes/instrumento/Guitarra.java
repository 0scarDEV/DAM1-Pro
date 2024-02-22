package herenciasapuntes.instrumento;

public class Guitarra extends Instrumento {
    @Override public void interpretar() {
        System.out.print("MELODIA DE GUITARRA: ");
        for (int i = 0; i < melodia.length; i++) {
            System.out.print (melodia[i] + " ");
        }
    }
}
