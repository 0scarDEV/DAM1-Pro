package examenud03;
import java.util.Scanner;
/* Por Óscar Fernández Pastoriza
* Daremos por asumido (como se indicó en clase) que los valores introducidos son correctos.
*/
public class RecorridoAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor(0,10); // Creamos un ascensor que "quepa" en el edificio.
        Scanner sc = new Scanner(System.in);
        int pisoInicial = sc.nextInt();
        ascensor.setPisoActual(pisoInicial); // Asignamos que el primer entero introducido sea el piso inicial del que parte el ascensor.
        boolean flag = true;
        final int CLAVE_SALIDA = -1;

        int pisoDesdeQueSeLlama = sc.nextInt();  // Pedimos al usuario el primer piso desde el que se llama.
        if (pisoDesdeQueSeLlama == CLAVE_SALIDA) {         // Comprobamos que el primer piso desde el que se llama no sea la clave de salida.
            flag = false;
        }

        int pisosRecorridos = pisoDesdeQueSeLlama - pisoInicial;  // Calculamos el número de pisos recorridos en el primer movimiento, pues que partirá del piso inicial.

        int pisoDeDestino = sc.nextInt();       // Pedimos al usuario el segundo piso desde el que se llama.
        pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama); // Calculamos el número de pisos recorridos en el primer movimiento con un vecino en el interior.

        // El siguiente bucle hace referencia al uso del ascensor por un vecino.
        do {
            pisoDesdeQueSeLlama = sc.nextInt(); // Pedimos al usuario que indique el piso desde el que un vecino llama.
            if (pisoDesdeQueSeLlama != CLAVE_SALIDA) {    // Comprobamos que no sea la clave de salida.
                // Calculamos el número de pisos que recorre el ascensor para atender la solicitud del vecino.
                pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama);

                pisoDeDestino = sc.nextInt();   // Pedimos al usuario que indique el piso al que se desplazará el vecino.
                // Calculamos el número de pisos que recorre el ascensor con el vecino en su interior.
                pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama);
            } else {
                flag = false;
            }
        } while (flag);

        // Mostramos por pantalla el número total de pisos recorridos.
        System.out.println(pisosRecorridos);
    }
}