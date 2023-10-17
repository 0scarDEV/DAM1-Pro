package expresiones;

import java.util.Scanner;

public class E925 {
    public static void main(String[] args) {
        // Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo si N contiene el valor 12345, después de la operación contendrá el valor 2345.
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca a continuación el número de mes que quiera comprobar que tiene 30 días:");
        int N = (sc.nextInt() % 10000) ;
        System.out.println("Quitándole la primera cifra al numero N de 5 cifras queda: " + N);

        sc.close();
    }
}
