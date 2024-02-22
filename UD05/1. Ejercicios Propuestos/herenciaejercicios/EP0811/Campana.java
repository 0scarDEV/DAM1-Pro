package herenciaejercicios.EP0811;
/* Óscar Fernández Pastoriza
* EP0811. Crea la clase Campana que hereda de Instrumento (definida en la Actividad E084). */
public class Campana extends Instrumento {
    @Override protected void interpretar() {
        System.out.print("MELODIA DE CAMPANA: ");
        for (int i = 0; i < melodia.length; i++) {
            System.out.print (melodia[i] + " ");
        }
    }
}
