package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Solicita al usuario tres distancias:
                - La primera, medida en milímetros.
                - La segunda, medida en centímetros.
                - La última, medida en metros.
    Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centimetros).
 */
public class EP0117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Presentamos el programa y solicitamos los datos al usuario.
        System.out.println("Este programa suma las distancias introducidas en milímetros, centímetros y metros.");
        System.out.println("-----------------------------------------------------------------------------------");
        
        System.out.print("Introduce una medida a sumar en mílimetros: ");
        double mm = sc.nextDouble();

        System.out.print("Introduce una medida a sumar en centímetros: ");
        double cm = sc.nextDouble();

        System.out.print("Introduce una medida a sumar en metros: ");
        double m = sc.nextDouble();
        
        // Hacemos los cálculos.
        double mmEnCm = mm / 10;
        double mEnCm = m * 100;

        // Hacemos la suma final y mostramos el resultado.
        double resultado = mmEnCm + mEnCm + cm;
        System.out.println("A continuación mostramos la suma de los milímetros, centímetros y metros: " + resultado + " cm.");

        sc.close();
    }
}
