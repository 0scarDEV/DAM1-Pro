package simud0401;
import java.util.Arrays;
import java.util.Scanner;

/*Óscar Fernández Pastoriza*/
public class AbadiasAcabado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, r = 0, k = 0, entrada;
        int[] altura = new int[0];
        int[] montanhaValidas = new int[0];
        System.out.println("Introduce las alturas de las montañas de OESTE a ESTE. Para finalizar escribe un número negativo.");
        do {
            // Leemos por entrada la altura de las montañas de OESTE a ESTE
            entrada = sc.nextInt();
            // Si la entrada es válida seguimos aumentando el array.
            altura = Arrays.copyOf(altura, altura.length+1);
            altura[i] = entrada;
            i++;
        } while (i < 1000 && entrada > 0);

        // Para cada montaña, recorremos las siguientes posiciones del array, si la altura es menor, se sumará al listado de montañas disponibles, si es mayor, no.
        for (int j = 0; j < altura.length; j++){
            for (; k < j; k++){
                if (altura[k] < altura[j]) {
                    montanhaValidas = Arrays.copyOf(montanhaValidas, montanhaValidas.length + 1);
                    montanhaValidas[r] = altura[j];
                    r++;
                } else if (altura[j] == -1){
                    montanhaValidas = Arrays.copyOf(montanhaValidas, montanhaValidas.length + 1);
                    montanhaValidas[r] = altura[j-1];
                    r++;
                }
            }
        }
        System.out.println("Número máximo de abadías que se pueden construir: " + montanhaValidas.length);
        System.out.println("A continuación se muestra el índice de las montañas en las que se puede construir:");
        System.out.println(Arrays.toString(montanhaValidas));
    }
}