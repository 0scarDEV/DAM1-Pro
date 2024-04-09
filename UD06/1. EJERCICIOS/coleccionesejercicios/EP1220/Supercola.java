package coleccionesejercicios.EP1220;
import coleccionesejercicios.EP1217.Cola;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class Supercola {
    /*  EP1220. Utilizando colecciones, implementa la clase Supercola, que tiene como atributos dos colas para enteros, en las que se encola y desencola por separado. Sin embargo, si una de las colas queda vacía, al llamar a su método desencolar(), se desencola de la otra mientras tenga elementos. Solo cuando las dos colas estén vacías, cualquier llamada a desencolar devolverá null. Escribe un programa con el menú:
    * 1. Encolar en cola1.
    * 2. Encolar en cola2.
    * 3. Desencolar de cola1.
    * 4. Desencolar de cola2.
    * 5. Salir

    * Después de cada operación se mostrará el estado de las dos colas para seguir su evolución.
    *  */
    static Cola<Integer> cola1;
    static Cola<Integer> cola2;
    private static void encolar(int cola, int numero) {
        switch (cola) {
            case 1 -> cola1.encolar(numero);
            case 2 -> cola2.encolar(numero);
        }
    }
    private static Integer desencolar(int cola) {
        Integer devolucion = null;

        if (cola1.size() == 0 && cola2.size() == 0) {
            return null;
        }

        switch (cola) {
            case 1 -> {
                if (cola1.size() == 0) {
                    desencolar(2);
                } else {
                    devolucion = cola1.desencolar();
                }
            }
            case 2 -> {
                if (cola2.size() == 0) {
                    desencolar(1);
                } else {
                    devolucion = cola2.desencolar();
                }
            }
        }

        return devolucion;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1 -> {
                    System.out.print("Número a encolar: ");
                    int numero = sc.nextInt();
                    encolar(1, numero);
                }
                case 2 -> {
                    System.out.print("Número a encolar: ");
                    int numero = sc.nextInt();
                    encolar(2, numero);
                }
                case 3 -> desencolar(1);
                case 4 -> desencolar(2);
                default -> System.out.println("Opción incorrecta");
            }
            System.out.println("COLA 1");
            System.out.println(cola1);
            System.out.println("COLA 2");
            System.out.println(cola2);

            mostrarMenu();
            opcion = sc.nextInt();
        }
    }
    private static void mostrarMenu() {
        System.out.println("1. Encolar en cola1");
        System.out.println("2. Encolar en cola2");
        System.out.println("3. Desencolar de cola1");
        System.out.println("4. Desencolar de cola2");
        System.out.println("5. Salir");
    }
}
