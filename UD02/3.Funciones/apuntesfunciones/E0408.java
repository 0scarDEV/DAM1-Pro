package apuntesfunciones;

import java.util.Scanner;

public class E0408 {
    /* E0408. Diseñar la función calculadora(), a la que se le pasan dos números reales
    (operandos) y qué operación se desea realizar con ellas. Las operaciones disponibles se
    especifican con un número y son: sumar(1), restar(2), multiplicar(3) o
    dividir(4). La función devolverá el resultado de la operación mediante un número
    real. */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op1, op2, operacion;

        // Entrada de datos
        System.out.println("El programa le devolverá un resultado según los operandos y la operación indicados.");
        System.out.print("Introduzca el primer operando: ");
        op1 = sc.nextInt();
        System.out.print("Introduzca el segundo operando: ");
        op2 = sc.nextInt();

        System.out.println("Para 1 (Sumar), 2 (Restar), 3 (Multiplicar) y 4 (Dividir)");
        System.out.print("Introduzca la operación deseada: ");
        operacion = sc.nextInt();

        sc.close();

        // Salida
        System.out.println("El resultado con los operandos y operación deseada es: " + calculadora(op1, op2, operacion));
    }

    static int calculadora(int op1, int op2, int operacion) {
        int resultado = 0;
        switch (operacion) {
            case 1 -> {
                resultado = op1 + op2;            
                }
            case 2 -> {
                resultado = op1 - op2;  
                }
            case 3 -> {
                resultado = op1 * op2;  
                }
            case 4 -> {
                resultado = op1 / op2;  
                }
            default -> {
                System.out.println("La operación introducida no es válida.");}
        }
        return resultado;
    }
}