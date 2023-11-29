package ejerciciostime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * IntervaloFechas.
 * Escribe un programa que tome dos fechas (LocalDate) como entrada y determine el número de días, meses y años entre ellas. Muestra el resultado de manera clara y precisa.
 */
public class IntervaloFechas {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingresa la primera fecha (YYYY-MM-DD): ");
            String fechaStr1 = sc.next();
            LocalDate fecha1 = LocalDate.parse(fechaStr1);

            System.out.print("Ingresa la segunda fecha (YYYY-MM-DD): ");
            String fechaStr2 = sc.next();
            LocalDate fecha2 = LocalDate.parse(fechaStr2);

            sc.close();

            Period periodo = Period.between(fecha1, fecha2);

            System.out.println("Resultado:");
            System.out.println("Años: " + periodo.getYears());
            System.out.println("Meses: " + periodo.getMonths());
            System.out.println("Días: " + periodo.getDays());
        }
}