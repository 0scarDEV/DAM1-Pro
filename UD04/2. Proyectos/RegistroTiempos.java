import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
/*
Crea un programa que desde que se inicia registre y almacene los segundos transcurridos desde el inicio del programa hasta cada vez que se pulsa la tecla Enter. La entrada de tiempos finalizará cuando se introduzca la letra “F” o “f”, contabilizando también esta entrada en el registro.

Imagina que se trata del cronómetro utilizado por un profesor de Educación física para cronometrar los segundos que tarda el alumnado en dar 5 vueltas al campo.

Al terminar la introducción de datos, el programa imprimirá los tiempos recogidos (en segundos), calculará la media y contabilizará el número de tiempos registrados por encima de la media, imprimiendo los resultados.

Ejemplos:
Se inicia el programa y el usuario pulsa Enter al cabo de 3, 7, y 12 segundos, e introduce una “F” 20 segundos después de iniciado el programa.
El programa imprimirá lo siguiente:

[3, 7, 12, 20]
Media = 10.5
Número de registros por encima de la media: 2


Se inicia el programa y el usuario introduce una “F” al cabo de 5 segundos.
El programa imprimirá lo siguiente:

[5]
Media = 5
Número de registros por encima de la media: 0

Nota: Usa el método now() de la clase LocalTime para obtener la hora del sistema.
 */
public class RegistroTiempos {
    public static void main(String[] args) {
        LocalTime inicio = LocalTime.now();
        String entrada = "";
        int[] segundos = new int[0];

        // Entrada de datos
        int i = -1;
        do {
            entrada = new Scanner(System.in).nextLine();
            if (entrada.isEmpty() || entrada.equals("F") || entrada.equals("f")) {
                // Calculamos los segundos transcurridos
                Duration segundosTranscurridos = Duration.between(inicio, LocalTime.now());
                int sec = (int) segundosTranscurridos.toSeconds();
                System.out.println("Segundos transcurridos desde el inicio del programa: " + sec);

                // Añadimos los segundos al array
                i++;
                segundos = Arrays.copyOf(segundos, segundos.length + 1);
                segundos[i] = sec;
            }
        } while (!entrada.equals("F") && !entrada.equals("f"));

        // Calcular la media
        double media = calculoMedia(segundos);

        System.out.println("La media es " + media);
        System.out.println("Hay " + calculoSegSobreMedia(segundos, media) + " marcas sobre la media.");
    }

    private static double calculoMedia(int[] segundos) {
        int sumando = 0;
        for (int j = 0; j < segundos.length; j++) {
            sumando = segundos[j];
        }
        return  (double) sumando / segundos.length;
    }

    private static int calculoSegSobreMedia(int[] segundos, double media) {
        int segundosSobreMedia = 0;
        for (int j = 0; j < segundos.length; j++) {
            if (segundos[j] > media){
                segundosSobreMedia++;
            }
        }

        return segundosSobreMedia;
    }
}