package ejerciciosrepaso;
import java.util.Scanner;

public class CamelCasi {
    public static void main(String[] args) {
        int numEntradas = new Scanner(System.in).nextInt();
        Scanner sc = new Scanner(System.in);
        String[] entradas = new String[numEntradas];

        for (int i = 0; i < numEntradas; i++) {
            entradas[i] = sc.nextLine();
        }

        sc.close();

        for (int i = 0; i < entradas.length; i++) {
            // Identificar cual está bien escrita
            String bienEscrita = "";
            if (Character.isUpperCase(entradas[i].charAt(0))) {
                bienEscrita = entradas[i];
            }
            // Cambiar todas las que sean iguales al formato correcto.
            for (int j = 0; j < entradas.length; j++) {
                if (entradas[j].equalsIgnoreCase(bienEscrita)) {
                    entradas[j] = bienEscrita;
                }
            }
        }

        // Mostramos el resultado.
        for (int i = 0; i < entradas.length; i++) {
            System.out.println(entradas[i]);
        }
        System.out.println("---");
    }
}
