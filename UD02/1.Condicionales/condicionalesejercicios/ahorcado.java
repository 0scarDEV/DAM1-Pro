package condicionalesejercicios;

import java.util.Scanner;

/*
 * Óscar Fernández Pastoriza
 * Ahorcado. Haz un programa que lea por teclado un número de fallos en el juego del ahorcado, entre 0 y 7, y que imprima un dibujo de un ahorcado más o menos completo en función del número de fallos.
 */

public class ahorcado {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int numFallos;

        // Entrada de datos
        System.out.print("Introduzca a continuación el número de fallos: ");
        numFallos = sc.nextInt();

        sc.close();

        // Salida de datos
        // Partes comunes iniciales del ahorcado
        System.out.println(" ___");
        System.out.println(" | |");
        switch (numFallos) {
            case 0:
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 1:
                System.out.println(" O |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 2:
                System.out.println(" O |");
                System.out.println(" / |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 3:
                System.out.println(" O |");
                System.out.println(" /| |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 4:
                // Hay que “escapar” la barra ‘\’ para imprimirla
                System.out.println(" O |");
                System.out.println(" /|\\ |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 5:
                System.out.println(" O |");
                System.out.println(" /|\\ |");
                System.out.println(" | |");
                System.out.println(" |");
                break;
            case 6:
                System.out.println(" O |");
                System.out.println(" /|\\ |");
                System.out.println(" | |");
                System.out.println(" / |");
                break;
            case 7:
                System.out.println(" O |");
                System.out.println(" /|\\ |");
                System.out.println(" | |");
                System.out.println(" / \\ |");
                break;
        }
        // Partes comunes finales
        System.out.println(" |");
        System.out.println(" ______|");
    }
}