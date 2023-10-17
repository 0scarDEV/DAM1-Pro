package parejas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Receta {
    public static void main(String[] args) {
/*
 * Copiloto: Óscar Fernández
 * Driver: Marcos Costoya
 */
        System.out.println("Receta compota de manzana");

        System.out.println("https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");

        byte personas;
        double manzanas = 1500;
        double azucar = 120;
        double limon = 5;
        double canela = 70;
        double pielNaranja = 35;
        final double PRECIOMANZANAS = 1.99 ;
        final double PRECIOAZUCAR = 1.35;

        System.out.println("Se necesitan para 6 personas un total de " + manzanas  + " gramos de manzana, " + azucar + " gramos de azucar,  y " +
                            limon + " militros de zumo de limon " );
        System.out.println("Ademas necesitaras " + canela + "gramos de canela y " + pielNaranja + "gramos de piel de naranja");

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Introduce el numero de personas: ");
        personas = sc.nextByte();

        System.out.println("Se necesitan " + (manzanas/6) * personas + " gramos de manzana, " + (azucar/6) * personas + " gramos de azucar,  y " +
                            df.format((limon/6) * personas) + " mililitros de zumo de limon "  );

        double totalPrecio = (((manzanas/6) * personas)/1000) * PRECIOMANZANAS +  (((azucar/6) * personas)/1000) * PRECIOAZUCAR;                   
        System.out.println("Comprando en el Dia el precio de los productos sera de " + df.format(totalPrecio) + " €");


        sc.close();
    }    
}