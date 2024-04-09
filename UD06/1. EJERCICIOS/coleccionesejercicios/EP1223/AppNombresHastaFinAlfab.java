package coleccionesejercicios.EP1223;

import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class AppNombresHastaFinAlfab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        TreeSet<String> conjunto = new TreeSet<>();

        do {
            entrada = sc.nextLine();
            if (!entrada.equalsIgnoreCase("fin")) {
                conjunto.add(entrada);
            }
        } while (!entrada.equalsIgnoreCase("fin"));

        System.out.println(conjunto);
    }
}
