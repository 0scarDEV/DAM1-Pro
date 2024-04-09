package coleccionesejercicios.EP1222;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class AppNombresHastaFin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();

        do {
            entrada = sc.nextLine();
            if (!entrada.equalsIgnoreCase("fin")) {
                conjunto.add(entrada);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        System.out.println(conjunto);
    }
}
