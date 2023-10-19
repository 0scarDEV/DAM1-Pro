package condicionalesparaninfo;

import java.util.Scanner;

public class EP0213 {
    /* En una granja se compra diariamente una cantidad de comida para los animales. El número de animales que alimentar (todos de la misma especie) es "numAnimales", y sabemos que cada animal come una media de "kilosPorAnimal"
    Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno de los animales.
    
    Nota: Evitar que la aplicación realice divisiones por cero.*/ 
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        double comidaDiaria = 0, kilosPorAnimal = 0;
        int numAnimales = 0;
        double comidaPorAnimal;

        // Entrada
        System.out.print("Introduzca a continuación la cantidad de comida comprada hoy: ");
        comidaDiaria = sc.nextDouble();
        System.out.print("Introduzca a continuación el número de animales que alimentar (misma especie): ");
        numAnimales = sc.nextInt();
        System.out.print("Introduzca a continuación la media de comida consumida por esa especie de animal: ");
        kilosPorAnimal = sc.nextDouble();
        sc.close();

        // Operaciones
        comidaPorAnimal = (comidaDiaria / numAnimales);
        if (comidaPorAnimal >= kilosPorAnimal) {
            System.out.println("Tienes la comida suficiente para el día de hoy.");
        } else if (comidaPorAnimal < kilosPorAnimal && comidaDiaria > 0) {
            System.out.println("Hoy a cada animal le toca comer " + comidaPorAnimal + " kilos de comida.");
        } else if (comidaDiaria == 0) {
            System.out.println("Hoy no hay comida");
        }
    }
}
