package expresiones;

import java.util.Scanner;

public class E928 {
    public static void main(String[] args) {
        // Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación una fecha de nacimiento: ");

        System.out.print("Día: ");
        byte DN = sc.nextByte();

        System.out.print("Mes: ");
        byte MN = sc.nextByte();

        System.out.print("Año: ");
        short AN = sc.nextShort();

        System.out.println("---------------------------------------------");
        System.out.println("Introduzca a continuación una fecha, el programa te dirá si con la fecha de nacimiento introducida eres o no mayor de edad: ");

        System.out.print("Día: ");
        byte DA = sc.nextByte();

        System.out.print("Mes: ");
        byte MA = sc.nextByte();

        System.out.print("Año: ");
        short AA = sc.nextShort();

        boolean añoMayorEdad = (AA - AN) >= 18; // Comprueba que la diferencia entre el año actual y el año de nacimiento sea mayor a 18 años.

        boolean mayorEdad = añoMayorEdad && ((MA > MN) || (MA == MN && DA > DN)); // Comprueba que la diferencia entre el año actual y el año de nacimiento sea mayor a 18 años Y que el mes actual sea el mayor que el de nacimiento O que el mes actual sea igual que el mes de nacimiento Y que el día actual sea mayor al día de nacimiento
        System.out.println(mayorEdad);

        sc.close();
    }
}
