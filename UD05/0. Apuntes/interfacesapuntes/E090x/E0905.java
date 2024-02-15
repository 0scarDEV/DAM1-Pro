package interfacesapuntes.E090x;
import java.util.Arrays;
import java.util.Scanner;

public class E0905 {
    public static void main(String[] args) {

        Cola cola = new Cola() {
            Integer[] elementos = new Integer[0];
            // En una clase anónima tengo que implementar los métodos de la interfaz
            public void encolar(Integer e){
                elementos = Arrays.copyOf(elementos, elementos.length+1);
                elementos[elementos.length-1] = e;
            }

            public Integer desencolar(){
                Integer e = null;
                if (elementos.length > 0){
                    e = elementos[0];
                    elementos = Arrays.copyOfRange(elementos, 1, elementos.length);
                }
                return e;
            }

            // En una clase anónima puedo redefinir métodos heredados de Object.
            @Override
            public String toString() {
                return Arrays.toString(elementos);
            }

        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un número entero (negativo para terminar): ");
        int numero = sc.nextInt();

        while (numero >= 0) {
            cola.encolar(numero);

            System.out.println("Escribe otro número entero: ");
            numero = sc.nextInt();
        }

        System.out.println(cola);


        // Sacar elementos de la cola
        System.out.println("Elementos desencolados:");
        Integer e;
        e = cola.desencolar();
        while (e != null){
            System.out.println(e);
            e = cola.desencolar();
        }
//…
    }
}