package buclesparaninfo;

import java.util.Scanner;

public class EP0313 {
    /* Óscar Fernández Pastoriza
     * EP0313. Escribe un programa que incremente la hora de un reloj. Se pedirán por teclado la hora, minutos y segundos, así como cuántos segundos se desea incrementar la hora introducida. La aplicación mostrará la nueva hora. Por ejemplo, si las 13:59:51 se incrementan en 10 segundos, resultan las 14:00:01. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos, segundosSumados, i;

        System.out.print("Introduzca a continuación la hora: ");
        hora = sc.nextInt();

        System.out.print("Introduzca a continuación los minutos: ");
        minutos = sc.nextInt();

        System.out.print("Introduzca a continuación los segundos: ");
        segundos = sc.nextInt();

        System.out.print("¿En cuánto tiempo desea incrementar la hora introducida? ");
        segundosSumados = sc.nextInt();

        sc.close();

        for (i = 0; i < segundosSumados; i++) {
            segundos++;
            if (segundos >= 60) {
                minutos++;
                segundos = 0;
            } else if (minutos >= 60) {
                hora++;
                minutos = 0;
            } else if (hora >= 24) {
                hora = 0;
            }
        }
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }
}
