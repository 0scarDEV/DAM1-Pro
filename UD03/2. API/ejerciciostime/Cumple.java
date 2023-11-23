package ejerciciostime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * Escribe un programa que solicite al usuario su fecha de nacimiento (LocalDate) y calcule el tiempo restante hasta su próximo cumpleaños. Muestra el resultado en días, horas y minutos.
 */
public class Cumple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su fecha de nacimiento (YYYY MM DD): ");
        int anhoCumpleanhos = sc.nextInt();
        int mesCumpleanhos = sc.nextInt();
        int diaCumpleanhos = sc.nextInt();
        
        sc.close();
        // static YearMonth of (int Year, int Month)
        //atDay ( int day of month)
        int mesActual = LocalDate.now().getMonthValue();
        int diaActual = LocalDate.now().getDayOfMonth();
        int horaActual = LocalDateTime.now().getHour();
        int minutoActual = LocalDateTime.now().getMinute();

        int faltanMeses = mesCumpleanhos - mesActual;
        int faltanDias = diaCumpleanhos - diaActual;
        int faltanHoras = (faltanDias + (faltanMeses * 30) * 24) - horaActual;
        int faltanMinutos = (faltanHoras * 60) - minutoActual;

        System.out.println("Hoy es " + LocalDate.now().getYear() + mesActual + diaActual + " y son las " + horaActual + minutoActual);
        System.out.println("Hasta tu próximo cumpleaños quedan " + faltanDias + " días.");
        System.out.println("Hasta tu próximo cumpleaños quedan " + faltanHoras + " horas.");
        System.out.println("Hasta tu próximo cumpleaños quedan " + faltanMinutos + " minutos.");
    }
}