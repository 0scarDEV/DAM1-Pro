package apuntes;

import java.util.Scanner;

public class E0213 {
    // E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo: hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int hora, minutos, segundos;

        // Entrada
        System.out.print("Introduzca a continuación una hora (Ej: 14) ");
        hora = sc.nextInt();
        System.out.print("Introduzca a continuación los minutos (Ej: 54) ");
        minutos = sc.nextInt();
        System.out.print("Introduzca a continuación los segundos (Ej: 50) ");
        segundos = sc.nextInt();

        // Operaciones
        if (hora >= 0 && hora <= 23) {
            if (minutos >= 0 && minutos <= 60) {
                if (segundos >= 0 && segundos <= 60) {
                    switch (segundos) {
                        case 59:
                            segundos = 00;
                            minutos++;
                            break;
                        default:
                            segundos++;
                    }
                    if (minutos == 59) {
                        minutos = 00;
                        hora++;
                    }
                }
            }
        }

        // Salida
        System.out.println("Tras sumarle un segundo a la hora introducida son las " + hora + " horas, " + minutos + " minutos y " + segundos + " segundos.");
        sc.close();
    }
}