package examenud02;
/* Óscar Fernández Pastoriza */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViajeCompartido {
    /* 
     * Escribe un programa que simule una sencilla aplicación de viajes en coche compartido. El programa debe pedir al usuario que introduzca:
        1. El origen y destino del viaje
        2. La distancia en kilómetros a recorrer (debe ser mayor o igual a 1 y puede tener decimales)
        3. El número de plazas disponibles para pasajeros (un número entero entre 1 y 4)
        4. El tipo de combustible (0 = Gasolina, 1 = Diesel, 2 = Electricidad)
        5. El consumo medio del vehículo (litros o kWh según el tipo de combustible)
     * A continuación, el programa debe mostrar el coste total del viaje, utilizando la función costeViaje(), y preguntar al usuario el precio por plaza en euros, que deberá ser mayor que cero y no podrá exceder de los 5 céntimos de euro por kilómetro. El programa puede informar al usuario del precio máximo permitido por plaza y solicitará repetir la entrada si no se ajusta a lo permitido.
     * Para terminar, el programa solicitará el número de pasajeros (que deberá estar entre 0 y el número de plazas disponibles) y mostrará el total en euros que ingresará el conductor por el viaje.
     * El programa debe validar los datos introducidos por el usuario y solicitar que repita la entrada de datos si no son correctos. 
     * El programa imprimirá los importes en euros con dos decimales y, en general, cualquier otro número no entero.
     */
    public static void main(String[] args) {
        String origen, destino;
        int plazas = 0;
        double km = 0, consumoMedio, precioPorPlaza = 0, precioPorKm = 0, ingresos;
        byte tipoCombustible;
        boolean flagPlazas = true, flagKm = true, flagPrecioPorPlaza = true, flagPrecioPorKm = true;

        // Entrada de datos
        System.out.print("Introduzca a continuación la localidad de origen del trayecto: ");
        origen = new Scanner(System.in).nextLine();

        System.out.print("Introduzca a continuación la localidad de destino del trayecto: ");
        destino = new Scanner(System.in).nextLine();

        while (flagPlazas) {
            try {
                System.out.print("Introduzca a continuación las plazas disponibles para pasajeros: ");
                plazas = new Scanner(System.in).nextInt();
            } catch (InputMismatchException a) {
                System.out
                        .println("Has introducido un valor no válido, el valor introducido debe ser un número entero.");
            }
            if (plazas < 1 || plazas > 4) {
                System.out
                        .println("Número de plazas introducidas no válido. Debe introducir una cantidad entre 1 y 4.");
            } else {
                flagPlazas = false;
            }
        }
        while (flagKm) {
            try {
                System.out.print("Introduzca a continuación el número de kilómetros del trayecto: ");
                km = new Scanner(System.in).nextDouble();
            } catch (InputMismatchException b) {
                System.out.println("Has introducido un valor no válido, el valor introducido debe ser un número.");
            }
            if (km < 1.00) {
                System.out.println("Kilómetros introducidos no válidos. Debe introducir una cantidad mayor a 1.");
            } else {
                flagKm = false;
            }
        }
        System.out.print("Para \"0\" - Gasolina, \"1\" - Diésel y \"2\" - Eléctrico. Introduzca a continuación el tipo de combustible usado por el coche: ");
        tipoCombustible = new Scanner(System.in).nextByte();

        System.out.print("Introduzca a continuación el consumo medio del coche: ");
        consumoMedio = new Scanner(System.in).nextDouble();

        System.out.println(
                "El trayecto entre " + origen + " y " + destino + " es " + costeViaje(km, tipoCombustible, consumoMedio) + " euros."
            );
        
            while (flagPrecioPorPlaza) {
                try {
                    System.out.print("Introduzca a continuación el precio deberán abonar los pasajeros (X,XX): ");
                    precioPorPlaza = new Scanner(System.in).nextDouble();
                    flagPrecioPorPlaza = false;
                } catch (InputMismatchException c) {
                    System.out.println(
                            "Has introducido un valor no válido, el valor introducido debe ser un número, en caso de introducir decimales debe ser separado con una coma (\",\").");
                }
            }
            while (flagPrecioPorKm) {
                precioPorKm = precioPorPlaza / km;
                if (precioPorKm < 0.00 || precioPorKm > 0.05) {
                    System.out.println(
                            "Precio por kilómetro introducido no válido. Debe introducir una precio que se entre 0.00 y 0.05 euros por kilómetro.");
                } else {
                    flagPrecioPorKm = false;
                }
            }

        ingresos = precioPorPlaza * plazas;
        System.out.println("Ingresará " + ingresos + " euros por el viaje desde " + origen + " hasta " + destino + ".");
    }
    
    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        double coste = 0.0, consumo = km * consumoMedio / 100;
        final double PRECIO_GASOLINA = 1.638, PRECIO_DIESEL = 1.638, PRECIO_ELECTICIDAD = 0.1692;

        switch (tipoCombustible) {
            case 0 -> {
                coste = PRECIO_GASOLINA * consumo;
            }
            case 1 -> {
                coste = PRECIO_DIESEL * consumo;
            }
            case 2 -> {
                coste = PRECIO_ELECTICIDAD * consumo;
            }
        }
        return coste;
    }
}