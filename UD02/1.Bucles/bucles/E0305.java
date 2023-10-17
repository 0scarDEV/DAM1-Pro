package bucles;

import java.util.Scanner;

public class E0305 {
    // E0305. Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y 100. Mientras la solución sea correcta, el juego continuará. En caso contrario, el programa terminará y mostrará el número de operaciones realizadas correctamente.
    public static void main(String[] args) {
        // Declaración de variables y constantes
        final int NUM_MAXIMO = 100;
        int operando1;
        int operando2;
        int numUsuario;
        int numAciertos = 0;

        // Entrada de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULO MENTAL: SUMAS");

        // Proceso
        do {
            // Obtener dos números aleatorios
            operando1 = (int)(Math.random()*NUM_MAXIMO + 1);
            operando2 = (int)(Math.random()*NUM_MAXIMO + 1); 

            // Mostrar al usuario y pedir el resultado
            System.out.println(operando1 + " + " + operando2 + " = ?");
            numUsuario = sc.nextInt();

            // Comparar suma con el resultado del usuario
            if (numUsuario == operando1 + operando2) {
                numAciertos++;
            } else {
                System.out.println("Error! El resultado era " + (int)(operando1 + operando2));
            }      
        } while (numUsuario == operando1 + operando2);

        // Salida
        System.out.println("Has conseguido " + numAciertos + " aciertos.");

        sc.close();
    }
}