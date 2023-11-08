package buclesparaninfo;

import java.util.Scanner;

public class EP0317 {
    /* Óscar Fernández Pastoriza
     * EP0317. Para dos números dados, a y b, es posible buscar el máximo común divisor (el número más grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, el primer número que divide a ambos simultáneamente. Realiza un programa que calcule el máximo común divisor de dos números.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, i;
        boolean flag = false;

        System.out.println("Introduzca un valor: ");
        a = sc.nextInt();
        System.out.println("Introduzca otro valor: ");
        b = sc.nextInt();

        sc.close();

        if (a > b) {
            for (i = b; flag == false; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Para los números dados, el máximo común divisor es: " + i);
                    flag = true;
                }
            }
        } else {
            for (i = a; flag == true; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Para los números dados, el máximo común divisor es: " + i);
                    flag = true;
                }
            }
        }
    }
}