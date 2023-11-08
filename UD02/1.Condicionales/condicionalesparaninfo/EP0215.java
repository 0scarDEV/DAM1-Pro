package condicionalesparaninfo;

import java.util.Scanner;

public class EP0215 {
    /* Óscar Fernández Pastoriza
     * EP0215. Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo. Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.print("Introduce la medida correspondiente a la base: ");
        base = sc.nextInt();
        System.out.print("Introduce la medida correspondiente a la altura: ");
        altura = sc.nextInt();

        sc.close();
        if (base >= 0 && altura >= 0) {
            area = (base * altura) / 2;
            System.out.println(area);
        } else {
            System.out.println("Alguno de los números introducidos es negativo, no tiene sentido.");
        }
    }
}