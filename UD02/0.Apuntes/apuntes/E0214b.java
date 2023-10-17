package apuntes;

import java.util.Scanner;

public class E0214b {
    // E0214. Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la fecha correspondiente al día siguiente. 
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int año, mes, dia;

        // Entrada
        System.out.print("Introduzca a continuación un año (Ej: 2020) ");
        año = sc.nextInt();
        System.out.print("Introduzca a continuación el mes (Ej: 11) ");
        mes = sc.nextInt();
        System.out.print("Introduzca a continuación el día (Ej: 28) ");
        dia = sc.nextInt();

        // Operaciones
            if (mes > 0 && mes <= 12) {
                switch (mes) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        if (dia > 0 && dia < 31) {
                            dia++;
                        } else if (dia == 31) {
                            dia = 1;
                            mes++;
                        }
                        
                        if (mes == 12) {
                            mes = 1;
                            año++;
                        }
                        break;
                    case 2:
                        if (dia > 0 && dia < 28) {
                            dia++;
                        } else if (dia == 28) {
                            dia = 1;
                            mes++;
                        }
                        break;
                    case 4, 6, 9, 11:
                        if (dia > 0 && dia < 30) {
                            dia++;
                        } else if (dia == 30) {
                            dia = 1;
                            mes++;
                        }
                }
            }

        // Salida
        System.out.println("Tras sumarle un día a la fecha introducida es el " + dia + " de " + mes + " del " + año);
        sc.close();
    }
}