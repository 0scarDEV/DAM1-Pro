package ejerciciosResueltos;

import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {return hora;}
    public void setHora(int hora) {
        if (hora >= 24){
            setHora(0);
        } else {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        if (minuto >= 60) {
            setHora(hora+1);;
            setMinuto(0);
        } else {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 60) {
            setMinuto(minuto+1);
            setSegundo(0);
        } else {
            this.segundo = segundo;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, minuto, segundo;
        int n;

        System.out.print("Introduzca la hora: ");
        hora = Math.abs(sc.nextInt());
        System.out.print("Introduzca el minuto: ");
        minuto = Math.abs(sc.nextInt());
        System.out.print("Introduzca el segundo: ");
        segundo = Math.abs(sc.nextInt());;

        System.out.print("Introduzca un número n: ");
        n = sc.nextInt();

        Hora h1 = new Hora(hora, minuto, segundo);
        
        System.out.println("Son las " + h1.getHora() + ":" + h1.getMinuto() + ":" + h1.getSegundo());
        for (int i = 1; i <= n; i++) {
            h1.setSegundo(h1.getSegundo() + 1);
            System.out.println("Son las " + h1.getHora() + ":" + h1.getMinuto() + ":" + h1.getSegundo());
        }
        sc.close();
    }
}