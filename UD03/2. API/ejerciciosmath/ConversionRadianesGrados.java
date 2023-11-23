package ejerciciosmath;

import java.util.Scanner;

/* Óscar Fernández Pastoriza
 * Desarrolla dos funciones que conviertan una medida en radianes a grados, y viceversa. Desarrolla un programa que pida al usuario ingresar la medida en radianes y utiliza la fórmula 
 */
public class ConversionRadianesGrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        double num, resultado;

        System.out.print(
                "Introduzca \"grados\" para obtener grados a partir de radianes o introduzca \"radianes\" para obtener radianes a partir de grados: ");
        opcion = sc.nextLine();

        switch (opcion) {
            case "grados" -> {
                System.out.print("Introduzca el número de radianes: ");
                num = sc.nextDouble();
                resultado = radianesAgrados(num);
                System.out.println(num + " radianes son " + resultado + " grados.");
            }
                
            case "radianes" -> {
                System.out.print("Introduzca el número de grados: ");
                num = sc.nextDouble();
                resultado = gradosAradianes(num);
                System.out.println(num + " grados son "+ resultado + " radianes.");
            } 
            default -> {
                System.out.println("Opción introducida no válida.");
            }
        }
        sc.close();
    }
    
    static double radianesAgrados(double num) {
        double grados;
        grados = (num * 180) / Math.PI;
        return grados;
    }

    static double gradosAradianes(double num) {
        double radianes;
        radianes = (num * Math.PI) / 180;
        return radianes;
    }
}