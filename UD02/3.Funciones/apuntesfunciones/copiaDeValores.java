package apuntesfunciones;

import java.util.Scanner;

public class copiaDeValores {
    // Ejemplo de programa con función con parámetros de entrada y valor de salida
    public static void main(String[] args) {
        int hora, min, seg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora para ver si es correcta o no:");
        
        System.out.print("Escribe la hora: ");
        hora = sc.nextInt();
        
        System.out.print("Escribe los minutos: ");
        min = sc.nextInt();
        
        System.out.print("Escribe los segundos: ");
        seg = sc.nextInt();

        sc.close();
        
        if (esHoraCorrecta(hora, min, seg)) {
            System.out.println("La hora es correcta");
        } else {
            System.out.println("La hora NO es correcta");
        }
    }
    static boolean esHoraCorrecta(int h, int m, int s) {
        boolean horaCorrecta = false;
        if (h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60) {
            horaCorrecta = true;
        }
        return horaCorrecta;
    }
}