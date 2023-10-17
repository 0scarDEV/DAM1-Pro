package paraninfo01;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Dado el siguiente polinomio de segundo grado: "y = ax2 + bx + c" crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 */
public class EP0115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        // Presentamos el programa y pedimos los datos al usuario.
        System.out.println("Este programa calcula el resultado del polinomio de segundo grado y = ax2 + bx + c");
        System.out.println("----------------------------------------------------------------------------------");
     
        System.out.print("Introduce a continuación el coeficiente A: ");
        double a = sc.nextDouble();

        System.out.print("Introduce a continuación el coeficiente B: ");
        double b = sc.nextDouble();
        
        System.out.print("Introduce a continuación el coeficiente C: ");
        double c = sc.nextDouble();

        System.out.print("Introduce a continuación el coeficiente X: ");
        double x = sc.nextDouble();

        // Realizamos la operación y mostramos el resultado:
        double y = a * x * 2 + b * x + c;
        System.out.println("Con los datos introducidos y el polinomio presentado, y tiene el valor de " + y);

        sc.close();
    }
}
