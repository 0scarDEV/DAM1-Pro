package condicionalesparaninfo;

import java.util.Scanner;

public class EP0211 {
    /* 
     * Óscar Fernández Pastoriza
     * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
    */
    public static void main(String[] args) {
        // Declaramos.
        Scanner sc = new Scanner(System.in);
        int numero, digitos;
        int unidad, decena, centena, millar;
        boolean capicua;
        String resultado = "";

        // Entrada
        System.out.print("Introduce a continuación el número deseado: ");
        numero = sc.nextInt();
        sc.close();

        // Comprobamos que el número sea válido
        if (numero >= 0 && numero <= 9999) {
            digitos = (int) (Math.log10(numero) + 1);
            
            // Sacamos el millar:
            millar = (numero / 1000) % 10;
            // Sacamos la centena:
            centena = (numero / 100) % 10;
            // Sacamos la decena:
            decena = (numero / 10) % 10;
            // Sacamos la unidad:
            unidad = numero % 10;

            switch (digitos) {
                case 1:
                    resultado = "El número introducido solo tiene un dígito, siempre es capicúa.";
                    break;
                case 2:
                    capicua = (decena == unidad);
                    resultado = (capicua ? "El número introducido es capicúa" : "El número introducido no es capicúa");
                    break;
                case 3:
                    capicua = (centena == unidad);
                    resultado = (capicua ? "El número introducido es capicúa" : "El número introducido no es capicúa");
                    break;
                case 4:
                    capicua = (millar == unidad) && (centena == decena);
                    resultado = (capicua ? "El número introducido es capicúa" : "El número introducido no es capicúa");
            }
            System.out.println(resultado);
        } else {
            System.out.println("El número introducido no es válido, debe ser un número entre 0 y 9999 (ambos incluidos)");
        }
    }
}