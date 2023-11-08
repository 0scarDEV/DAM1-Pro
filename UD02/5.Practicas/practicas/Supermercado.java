package practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {
    /* Implementa un programa que simule el proceso de cobro en la caja de un supermercado.
        Para calcular el importe total que debe pagar cada cliente el programa solicitará introducir el precio de cada producto, expresado en euros con hasta 2 decimales, y la cantidad de unidades del mismo, expresado como un número entero.
        El programa deberá controlar los posibles errores o excepciones en la entrada de datos por teclado, informando al usuario y permitiendo repetir la entrada. 
        La condición para finalizar la introducción de productos queda a criterio del programador. Puede ser, por ejemplo, introducir un importe igual a cero o negativo.
        Una vez terminado de introducir los productos, el programa mostrará el importe total de la compra y solicitará al usuario el medio de pago elegido por el cliente: “con tarjeta” o “en efectivo”.
        Si el método de pago elegido es “con tarjeta”, se dará por finalizada la compra de ese cliente.
        Si el método de pago elegido es “en efectivo”, entonces se solicitará el importe pagado por el cliente y se calculará el cambio a devover, desglosando dicha cantidad en billetes y monedas de € y de 1 céntimos de euro.
        Una vez finalizada la compra de un cliente el programa solicitará si se desea repetir el proceso para un nuevo cliente.

        Implementa el programa utilizando programación modular para descomponer el problema en subproblemas más sencillos implementados con funciones.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        boolean flagRoot = false;
        do {
            double precio = 0, precioPorProducto = 0, precioTotal = 0;
            int cantidad = 0;
            String pago = "";
        
            System.out.println("Cuando no tenga más productos, escriba 0 cuando se le solicite el precio.");
            
            precio(precioTotal, precio, cantidad, precioPorProducto);
            
            System.out.println("Existen dos métodos de pago, \"con tarjeta\" o \"en efectivo\"");
            
            boolean flag = false;
            do {
                Scanner sc2 = new Scanner(System.in);
                    try {
                        System.out.print("Escriba como desea pagar: ");
                        pago = sc2.next();
                        flag = true;
                    } catch (Exception e) {
                        System.out.println("ERROR: Debe introducir por teclado las cadenas de caracter \"con tarjeta\" o \"en efectivo\".");
                    }
                sc2.close();
            } while (flag = false);
            System.out.println("¿Opción válida? " + flag);
            
            if (pago == "con tarjeta") {
                System.out.println("Pago finalizado con éxito");
            } else if (pago == "en efectivo"){
                efectivo(precioTotal);
            }

            System.out.println("¿Desea repetir el proceso?");
            String respuesta = sc3.next();
            sc.close();
            sc3.close();

            if (respuesta == "Si") {
                flagRoot = false;
            } else {
                flagRoot = true;
            }
            System.out.println("¿Se repetirá el proceso? " + flagRoot);
        } while (flagRoot = false);
    }

    static void precio(double precioTotal, double precio, int cantidad, double precioPorProducto) {
            Scanner sc1 = new Scanner(System.in);    
            do  {
                    try {
                        System.out.print("Introduzca a continuación el precio de cada producto: ");
                        precio = sc1.nextDouble();
                        
                        System.out.print("Introduzca a continuación la cantidad de este producto: ");
                        cantidad = sc1.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("ERROR: Debe introducir números por teclado, los números introducidos como cantidad de producto deben ser enteros.");
                    }
                    precioPorProducto = precio * cantidad;
                    precioTotal = precioTotal + precioPorProducto;
            } while (precio != 0);

            System.out.println("El precio total de la compra introducida es: " + precioTotal);
            sc1.close();
    }

    static void efectivo(double precioTotal) {

    }
}