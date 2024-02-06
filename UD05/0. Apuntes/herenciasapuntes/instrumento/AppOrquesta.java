package herenciasapuntes.instrumento;
public class AppOrquesta {
    public static void main(String[] args) {
        Piano piano = new Piano();
        piano.add(Instrumento.Nota.DO);
        piano.add(Instrumento.Nota.MI);
        piano.add(Instrumento.Nota.FA);

        Trompeta trompeta = new Trompeta();
        trompeta.add(Instrumento.Nota.SOL);
        trompeta.add(Instrumento.Nota.DO);
        trompeta.add(Instrumento.Nota.RE);

        Guitarra guitarra = new Guitarra();
        guitarra.add(Instrumento.Nota.SOL);
        guitarra.add(Instrumento.Nota.DO);
        guitarra.add(Instrumento.Nota.RE);

        Oboe oboe = new Oboe();
        oboe.add(Instrumento.Nota.SOL);
        oboe.add(Instrumento.Nota.DO);
        oboe.add(Instrumento.Nota.RE);

        Instrumento[] orquesta = {
                piano,
                trompeta,
                oboe
        };

        System.out.println("CONCIERTO EN REm:");
        for(Instrumento instrumento : orquesta){
            instrumento.interpretar();
            System.out.println();
        }
    }
}