package coleccionesapuntes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class Actividad2ColeccionesReales {
    /*Implementa una aplicación donde se generen 100 números reales entre -100 y 100. A medida que se generan, los valores positivos se insertan en una colección y los negativos en otra. Al final se muestran ambas colecciones y las sumas de los elementos de cada una de ellas. Por último, se eliminan de ambas colecciones todos los valores que sean mayores que 10 o menores de -10 y se vuelven a mostrar.*/
    public static void main(String[] args) {
        Random random = new Random();
        Collection<Integer> numPos = new ArrayList<>();
        Collection<Integer> numNeg = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int n = random.nextInt(-100, 101);
            if (n >= 0) {
                numPos.add(n);
            } else {
                numNeg.add(n);
            }
        }

        System.out.println("\nElementos de la colección de positivos: ");
        for (int n: numPos) {
            System.out.print(n + " ");
        }

        System.out.println("\nElementos de la colección de negativos: ");
        for (int n: numNeg) {
            System.out.print(n + " ");
        }

        System.out.println("\nEliminando numeros mayores que 10 y -10...");
        Iterator<Integer> itP = numPos.iterator();
        while (itP.hasNext()) {
            if (itP.next() > 10) {
                itP.remove();
            }
        }
        Iterator<Integer> itN = numNeg.iterator();
        while (itN.hasNext()) {
            if (Math.abs(itN.next()) > 10) {
                itN.remove();
            }
        }

        System.out.println("\nElementos de la colección de positivos: ");
        for (int n: numPos) {
            System.out.print(n + " ");
        }

        System.out.println("\nElementos de la colección de negativos: ");
        for (int n: numNeg) {
            System.out.print(n + " ");
        }
    }
}