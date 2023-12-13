package examenud03;
import java.util.Scanner;
/* Por Óscar Fernández Pastoriza */
public class RecorridoDosAscensores {
    public static void main(String[] args) {
        // Variables
        Ascensor ascensor1 = new Ascensor(0,10);
        Ascensor ascensor2 = new Ascensor(0,10);
        Scanner sc = new Scanner(System.in);
        int pisoInicialAscensor1 = sc.nextInt();
        ascensor1.setPisoActual(pisoInicialAscensor1);
        int pisoInicialAscensor2 = sc.nextInt();
        ascensor1.setPisoActual(pisoInicialAscensor2);
        boolean flag = true;
        int pisosRecorridos;

        // Pedimos al usuario datos
        int pisoDesdeQueSeLlama = sc.nextInt();
        if (pisoDesdeQueSeLlama == -1) {
            flag = false;
        }

        // Comprobamos qué ascensor llega antes.
        if (ascensorMasProximo(ascensor1, ascensor2, pisoDesdeQueSeLlama) == ascensor1) {
            pisosRecorridos = pisoDesdeQueSeLlama - pisoInicialAscensor1;
        } else {
            pisosRecorridos = pisoDesdeQueSeLlama - pisoInicialAscensor2;
        }

        int pisoDeDestino = sc.nextInt();
        pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama);

        do {
            pisoDesdeQueSeLlama = sc.nextInt();
            if (pisoDesdeQueSeLlama != -1) {
                pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama);

                pisoDeDestino = sc.nextInt();
                pisosRecorridos = pisosRecorridos + Math.abs(pisoDeDestino - pisoDesdeQueSeLlama);
            } else {
                flag = false;
            }
        } while (flag);
        System.out.println(pisosRecorridos);
    }

    public static Ascensor ascensorMasProximo(Ascensor ascensor1, Ascensor ascensor2, int pisoDesdeQueSeLlama) {
        if (Math.abs(ascensor1.getPisoActual() - pisoDesdeQueSeLlama) > Math.abs(ascensor2.getPisoActual()) - pisoDesdeQueSeLlama) {
            return ascensor1;
        } else {
            return ascensor2;
        }
    }
}