package paraninfo02;

import java.util.Scanner;

public class EP0212 {
    /* El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número de la siguiente forma:
    
            letra = numeroDNI % 23
    
    Con el código para generar la letra del DNI, elabora un programa que a partir del número de DNI muestre la letra que corresponde.*/
    public static void main(String[] args) {
        // Declaramos
        Scanner sc = new Scanner(System.in);
        int num;
        final int numeroLetra;
        String letra = "";

        // Entrada
        System.out.print("Introduzca a continuación los ocho dígitos de su DNI: ");
        num = sc.nextInt();
        sc.close();

        // Operaciones
        if (num >= 10000000 && num <= 99999999) {
            numeroLetra = num % 23;
            switch (numeroLetra) {
                default -> 
                    System.out.println("Resultado no esperado");
                case 0 ->
                    letra = "T";
                case 1 ->
                    letra = "R";
                case 2 ->
                    letra = "W";
                case 3 ->
                    letra = "A";
                case 4 ->
                    letra = "G";
                case 5 ->
                    letra = "M";
                case 6 ->
                    letra = "Y";
                case 7 ->
                    letra = "F";
                case 8 ->
                    letra = "P";
                case 9 ->
                    letra = "D";
                case 10 ->
                    letra = "X";
                case 11 ->
                    letra = "B";
                case 12 ->
                    letra = "N";
                case 13 ->
                    letra = "J";
                case 14 ->
                    letra = "Z";
                case 15 ->
                    letra = "S";
                case 16 ->
                    letra = "Q";
                case 17 ->
                    letra = "V";
                case 18 ->
                    letra = "H";
                case 19 ->
                    letra = "L";
                case 20 ->
                    letra = "C";
                case 21 ->
                    letra = "K";
                case 22 ->
                    letra = "E";
            }
            System.out.println("Su DNI es: " + num + letra);
        } else {
            System.out.println("No has introducido un número de 8 dígitos.");
        }
    }
}