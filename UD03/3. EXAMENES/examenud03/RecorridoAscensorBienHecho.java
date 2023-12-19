package examenud03;
import java.util.Scanner;
/* Por Óscar Fernández Pastoriza
 * Daremos por asumido (como se indicó en clase) que los valores introducidos son correctos.
 */
public class RecorridoAscensorBienHecho {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(0,10); // Creamos un ascensor que "quepa" en el edificio.
        Scanner sc = new Scanner(System.in);
        int pisoInicial = sc.nextInt();
        ascensor.setPisoActual(pisoInicial); // Asignamos que el primer entero introducido sea el piso inicial del que parte el ascensor.
        boolean flag = true;
        final int CLAVE_SALIDA = -1;

        int pisoDesdeQueSeLlama;
        int pisoDestino;
        int pisosRecorridos = 0;

        do {
            pisoDesdeQueSeLlama = sc.nextInt();
            if (pisoDesdeQueSeLlama == CLAVE_SALIDA) continue;
            pisoDestino = sc.nextInt();

            pisosRecorridos += moverAscensor(pisoDesdeQueSeLlama,ascensor);
            pisosRecorridos += moverAscensor(pisoDestino, ascensor);

        } while (pisoDesdeQueSeLlama != CLAVE_SALIDA);

        // Mostramos por pantalla el número total de pisos recorridos.
        System.out.println(pisosRecorridos);
    }

    public static int moverAscensor(int pisoObjetivo, Ascensor ascensor)
    {
        int pisosRecorridos = Math.abs(pisoObjetivo - ascensor.getPisoActual());

        ascensor.irAlPiso(pisoObjetivo);

        return pisosRecorridos;
    }
}
