package interfacesejercicios.EP0915;
import herenciaejercicios.EP0817.Cola;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
 * EP0915. Implementar la clase Supercola, que tiene como atributos dos colas para enteros, en las que se encola y desencola por separado. Sin embargo, si una de las colas queda vacía, al llamar a su método desencolar, se desencola de la otra mientras tenga elementos. Solo cuando las dos colas estén vacías, cualquier llamada a desencolar devolverá null. Escribir un programa con el menú:

 * 1. Encolar en cola1.
 * 2. Encolar en cola2.
 * 3. Desencolar de cola1.
 * 4. Desencolar de cola2.
 * 5. Salir

 * Después de cada operación se mostrará el estado de las dos colas para seguir su evolución.*/
public class Supercola {
    Cola cola1;
    Cola cola2;
    public static void mostrarMenu() {
        System.out.println("======================");
        System.out.println("======== MENÚ ========");
        System.out.println("======================");
        System.out.println();
        System.out.println("1. Encolar en cola1.");
        System.out.println("2. Encolar en cola2.");
        System.out.println("3. Desencolar de cola1.");
        System.out.println("4. Desencolar de cola2.");
        System.out.println("5. Salir.");
        System.out.println();
    }
    public static void main(String[] args) {
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
             mostrarMenu();
             opcion = sc.nextInt();
             switch (opcion) {
                 case 1 -> {
                     System.out.print("Introduce el valor a encolar: ");
                     cola1.encolar(sc.nextInt());
                 }
                 case 2 -> {
                     System.out.print("Introduce el valor a encolar: ");
                     cola2.encolar(sc.nextInt());
                 }
                 case 3 -> {
                     if (cola1.numElementos() != 0) {
                         System.out.println("Desencolado el valor " + cola1.desencolar() + " de la cola 1.");
                     } else {
                         System.out.println("Desencolado el valor " + cola2.desencolar() + " de la cola 2.");
                     }
                 }
                 case 4 -> {
                     if (cola2.numElementos() != 0) {
                         System.out.println("Desencolado el valor " + cola2.desencolar() + " de la cola 2.");
                     } else {
                         System.out.println("Desencolado el valor " + cola1.desencolar() + " de la cola 1.");
                     }
                 }
                 case 5 -> {
                 }
                 default -> System.out.println("Opción inválida, inténtelo de nuevo.");
             }
        } while (opcion != 5);
    }
}