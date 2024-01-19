package arraysejercicios;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * EjArrays08. Leer el nombre y sueldo de 20 empleados y mostrar el nombre y sueldo del empleado que más gana. */
public class EjArrays08 {
    public static void main(String[] args) {
        String[] nombres = new String[20];
        int[] sueldos = new int[20];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Escribre el nombre del empleado " + i + ":");
            nombres[i] = new Scanner(System.in).nextLine();

            System.out.println("Escribre el sueldo del empleado " + i + ":");
            sueldos[i] = new Scanner(System.in).nextInt();
        }

        int sueldoMax = 0;
        int pos = 0;

        for (int i = 0; i < sueldos.length; i++) {
            if (sueldoMax < sueldos[i]) {
                sueldoMax = sueldos[i];
                pos = i;
            }
        }

        System.out.println("El empleado con más sueldo se llama " + nombres[pos] + " y cobra " + sueldoMax);
    }
}