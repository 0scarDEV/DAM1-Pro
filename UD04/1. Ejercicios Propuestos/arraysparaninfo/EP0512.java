package arraysparaninfo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/*EP0512. Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.*/
public class EP0512 {
    public static void main(String[] args) {

        int[] t = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(desordenar(t)));

    }
    static int[] desordenar(int[] t) {
        int[] t2, aleatorizar, aleatorio = new int[0];
        for (int i = 0; i < 5; i++) {
            t2 = Arrays.copyOf(t, t.length); // Generamos una copia del array original para aleatorizar.
            aleatorizar = generarNumerosUnicos(t.length, t.length); // Generamos una lista de posiciones aleatorias en las que añadir los números de t2.
            aleatorio = new int[t.length];
            for (int j = 0; j < (t.length - 1); j++) {  // Recorremos uno a uno los elementos de la tabla ALEATORIZAR y al valor que se corresponde con esa posición de T2, se la asignamos en la nueva tabla ALEATORIO
                aleatorio[aleatorizar[j]] = t2[j];
            }
        }
        return aleatorio;
    }
    // Generamos un array de números únicos para reordenar los valores del array.
    private static int[] generarNumerosUnicos(int cantidadNumeros, int rangoNumeros) {
        if (cantidadNumeros > rangoNumeros) {
            throw new IllegalArgumentException("La cantidad de números no puede ser mayor que el rango de números");
        }
        Random random = new Random();
        Set<Integer> numerosGenerados = new HashSet<>();
        while (numerosGenerados.size() < cantidadNumeros) {
            int numeroAleatorio = random.nextInt(rangoNumeros) + 1;
            numerosGenerados.add(numeroAleatorio);
        }
        // Convertir el HashSet a un array de enteros
        int[] numerosUnicos = new int[cantidadNumeros];
        int indice = 0;
        for (int numero : numerosGenerados) {
            numerosUnicos[indice] = numero;
            indice++;
        }
        return numerosUnicos;
    }
}