package arraysparaninfo;
import java.util.Arrays;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
EP0519. Diseña una aplicación para gestionar la llegada a meta de los participantes de una carrera. Cada uno de ellos dispone de un dorsal (un número entero) que los identifica. En la aplicación se introduce el número de dorsal de cada corredor cuando éste llega a la meta. Para indicar que la carrera ha finalizado (han llegado todos los corredores a la meta), se introduce como dorsal el número -1.
A continuación, la aplicación solicita información extra de los corredores. En primer lugar, se introducen los dorsales de todos los corredores menores de edad; para premiarlos por su esfuerzo se les avanza un puesto en el ranking general de la carrera, es decir, es como si hubieran adelantado al corredor que llevaban delante. En segundo lugar, se introducen los dorsales de los corredores que han dado positivo en el test antidopaje, lo que provoca su expulsión inmediata. Para finalizar, se introducen los dorsales de los corredores que no han pagado su inscripción en la carrera, lo que provoca que se releguen a los últimos puestos del ranking general. La aplicación debe mostrar los dorsales de los corredores que han conseguido las medallas de oro, plata y bronce. */
public class EP0519 {
    public static void main(String[] args) {
        int[] ranking;

        System.out.println("Introduce los dorsales de los participantes conforme vayan llegando a la meta. Para finalizar introduce -1.");
        ranking = introducirDatos();

        System.out.println("Introduce los dorsales de los participantes menores de edad. Para finalizar introduce -1.");
        ranking = menoresEdad(ranking);

        System.out.println(Arrays.toString(ranking));

        System.out.println("Introduce los dorsales de los participantes que no hayan superado el test antidoping. Para finalizar introduce -1.");
        ranking = dopados(ranking);

        System.out.println(Arrays.toString(ranking));
        /*
        System.out.println("Introduce los dorsales de los participantes que no hayan abonado su inscripción. Para finalizar introduce -1.");
        ranking = noInscritos(ranking);
 */
    }
    private static int[] introducirDatos() {
        int[] t = new int[0];
        int i = -1;
        do {
            i++;
            t = Arrays.copyOf(t, t.length + 1);
            int entradaDatos = new Scanner(System.in).nextInt();
            t[i] = entradaDatos;
        } while (t[i] != -1);
        t = Arrays.copyOf(t, t.length - 1);
        return t;
    }
    private static int[] menoresEdad(int[] t) {
        int[] menoresEdad = introducirDatos();
        for (int i = 0; i < menoresEdad.length; i++) {
            int pos = Arrays.binarySearch(t, Arrays.toString(t).indexOf(menoresEdad[i]));

            if (pos == -1) {
                System.out.println("No se encuentra el dorsal " + t[i]);
            } else {
                int aux = t[pos];
                t[pos] = t[pos-1];
                t[pos-1] = aux;
            }

            /*
            int temp = t[i];
            t[i] = t[indiceAleatorio];
            t[indiceAleatorio] = temp;
            */
        }
        return t;
    }

    private static int[] dopados(int[] t) {
        int[] dopados = introducirDatos();
        int[] listadoAux = null;

        for (int i = 0; i < t.length; i++) {
            String prubea = t;
            int pos = prubea.indexOf(dopados[i-1]);
            if (pos == -1) {
                System.out.println("No se encuentra el dorsal " + t[i+1]);
            } else {
                listadoAux = Arrays.copyOf(t, t.length - 1);
                System.arraycopy(t, pos + 1, listadoAux, pos, t.length - pos - 1);
            }
        }
        return listadoAux;
    }

    /*
    private static int[] noInscritos(int[] t) {
        int[] noInscritos = introducirDatos();
        return listaMod;
    }
    */
}