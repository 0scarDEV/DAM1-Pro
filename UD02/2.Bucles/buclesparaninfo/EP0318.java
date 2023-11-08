package buclesparaninfo;

import java.util.Scanner;

public class EP0318 {
    /* Óscar Fernández Pastoriza
     * EP0318. De forma similar a la actividad anterior (EP0317), implementa un algoritmo que calcule el minimo común múltiplo de dos números dados. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i, minimoComúnMúltiplo;
        boolean flag = false;

        System.out.println("Introduzca un valor: ");
        a = sc.nextInt();
        System.out.println("Introduzca otro valor: ");
        b = sc.nextInt();

        sc.close();

        if (a > b) {
            for (i = b; flag == false; i++) {
                if (a % i == 0 && b % i == 0) {
                    flag = true;
                }
            }
        } else {
            for (i = a; flag == true; i++) {
                if (a % i == 0 && b % i == 0) {
                    flag = true;
                }
            }
        }

        minimoComúnMúltiplo = (a * b) / i;
        System.out.println("El mínimo común múltiplo es: " + minimoComúnMúltiplo);
    }
}