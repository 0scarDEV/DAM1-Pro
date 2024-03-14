package coleccionesejercicios.EP1226;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class RepartoAlumnos {
    /* EP1226. Un centro educativo necesita distribuir de forma aleatoria a los alumnos de un curso entre los grupos disponibles para ese curso. Diseña la función
     * List<List<String>> repartoAlumnos(List<String> lista, int numGrupos)
     que devuelve una lista de listas, cada una de las cuales corresponde a un grupo. Cada nombre de la lista de alumnos se asigna a uno de los grupos.*/
    public static void main(String[] args) {
        List<String> listado = new ArrayList<>();
        listado.add("Marcos");
        listado.add("Oscar");
        listado.add("Yoel");
        listado.add("Victoria");
        listado.add("Borja");

        List<List<String>> listadoRes = repartoAlumnos(listado, 4);

        System.out.println(listadoRes);
    }
    static List<List<String>> repartoAlumnos(List<String> lista, int numGrupos) {
        Iterator<String> it = lista.iterator();
        List<List<String>> listaRes = new ArrayList<>();

        for (int i = 0; i < numGrupos; i++) {
            listaRes.add(new ArrayList<>());
        }

        while (it.hasNext()) {
            for (int i = 0; i < listaRes.size(); i++) {
                if (it.hasNext()) {
                    listaRes.get(i).add(it.next());
                    it.remove();
                }
            }
        }

        return listaRes;
    }
}