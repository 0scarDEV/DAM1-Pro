package otrosejercicios;
import java.util.Scanner;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Convertir una temperatura introducida por teclado en grados Celius o grados Farenheit, medida que el usuario podrá también indicar por teclado, al valor correspondiente en la otra medida de temperatura.
 */
public class EP0126 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Presentamos el programa y pedimos datos al usuario.
        System.out.println("Este programa convierte de Celsius a Farenheit según indiques.");
        System.out.println("--------------------------------------------------------------");

        System.out.print("Introduce la temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.print("¿Deseas convertir a Celsius (C) o Fahrenheit (F)? ");
        String unidadDestino = sc.next();

        // Hacemos las operaciones.
        double resultado = unidadDestino.equalsIgnoreCase("C") ? (temperatura - 32) * 5 / 9 : (temperatura * 9 / 5) + 32;
        
        // Mostramos la salida.
        System.out.println("-----------------------------------------");
        System.out.println("La temperatura en grados " + unidadDestino.toUpperCase() + " es: " + resultado);

        sc.close();
    }
}