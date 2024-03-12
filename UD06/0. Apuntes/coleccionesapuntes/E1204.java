package coleccionesapuntes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class E1204 {
    /*
    * E1204. Implementar una aplicación que pida por consola números enteros no negativos hasta que se introduce un -1. Los números se irán insertando en una colección, pudiéndose repetir. Al terminar, se mostrará la colección por pantalla.
    * A continuación, se mostrarán todos los valores pares. Por último, se eliminarán todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
    * Practica el uso de iteradores y bucles for-each para recorrer la colección.
    */
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != -1) {
            listaEnteros.add(n);
            n = sc.nextInt();
        }

        System.out.println("\n Todos los números");
        System.out.println(listaEnteros);

        System.out.println("\n Numeros pares (for-each)");
        for (Integer num: listaEnteros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n Numeros pares (iterador)");
        Iterator<Integer> it = listaEnteros.iterator();
        while (it.hasNext()) {
            Integer num2 = it.next();
            if (num2 % 2 == 0) {
                System.out.print(num2);
            }
        }

        for (Integer num3: listaEnteros) {
            if (num3 % 3 == 0) {
                listaEnteros.remove(num3);
            }
        }
    }
}