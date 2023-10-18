package apuntesbucles;

import java.util.Scanner;

public class E0304 {
    // Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. Para ello introducirá por teclado la altura (en centímetros) de cada árbol (terminando la introducción de datos cuando se utilice el -1 como altura). Los árboles se identifican mediante etiquetas con números únicos correlativos, comenznado en 0. Diseñar una aplicación que resuelva el problema planetado.
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        int altura = 0, idArbol = 0, idArbolAlto = 0, alturaAnterior;

        // Operaciones
        while (altura != -1) {
            alturaAnterior = altura;
            System.out.println("Introduzca la altura del árbol número " + idArbol + ". Introduzca -1 para terminar.");
            altura = sc.nextInt();
            if (altura >= alturaAnterior) {
                alturaAnterior = altura;
                idArbolAlto = idArbol;
            }
            idArbol++;
        }
        System.out.println("El árbol más alto es el Árbol número " + idArbolAlto);
        sc.close();
    }
}