package examenud02;
/* Óscar Fernández Pastoriza */
public class CosteViaje {
    /*  
    Crea una función que calcula el importe en euros de un viaje en coche en función de los kilómetros del trayecto, el tipo de combustible utilizado (0 = Gasolina, 1 = Diesel, 2 = Electricidad) y el consumo medio (litros por cada 100 km para coches gasolina y diesel o Kilovatios/Hora para coches eléctricos).
        Considera en los cálculos de la función los siguientes precios medios en euros de los distintos combustibles, según https://www.dieselogasolina.com/ y https://tarifaluzhora.es:
        ● Gasolina, Sin plomo 95: 1.638 € / litro
        ● Diesel, Gasóleo A: 1.638 € / litro
        ● Electricidad, kWh: 0.1692 € / kWh
    */
    static double costeViaje(double km, byte tipoCombustible, double consumoMedio) {
        double coste = 0.0;
        final double precioGasolina = 1.638, precioDiesel = 1.638, precioElectricidad = 0.1692;

        switch (tipoCombustible) {
            case 0 -> {
                coste = precioGasolina * km * consumoMedio;
            }
            case 1 -> {
                coste = precioDiesel * km * consumoMedio;
            }
            case 2 -> {
                coste = precioElectricidad * km * consumoMedio;
            }
        }
        return coste;
    }
    
    /* "PROGRAMA" COMPLETO.
     *import java.util.Scanner;
     *public static void main(String[] args) {
        double km, consumoMedio;
        byte tipoCombustible;
    
        System.out.println("Este programa calcula el importe en euros de un viaje en coche.");
    
        System.out.print("Introduzca a continuación el número de kilómetros del trayecto: ");
        km = new Scanner(System.in).nextDouble();
    
        System.out.print("Para \"0\" - Gasolina, \"1\" - Diésel y \"2\" - Eléctrico. Introduzca a continuación el tipo de combustible usado por el coche: ");
        tipoCombustible = new Scanner(System.in).nextByte();
    
        System.out.print("Introduzca a continuación el consumo medio del coche: ");
        consumoMedio = new Scanner(System.in).nextDouble();
    
        System.out.println("Su viaje tendrá un coste de " + costeViaje(km, tipoCombustible, consumoMedio) + " euros.");
    }
     */
}