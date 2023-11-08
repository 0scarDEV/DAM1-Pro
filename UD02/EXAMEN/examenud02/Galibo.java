package examenud02;
/* Óscar Fernández Pastoriza */
import java.util.Scanner;

public class Galibo {
    /*
     * Se conoce como el gálibo a la dimensión máxima que debe tener un vehículo
     * para poder pasar por una zona de una vía de tamaño reducido como un túnel o
     * un puente. En carretera el gálibo del que hay que preocuparse normalmente
     * suele ser el vertical, es decir, la altura libre por debajo del puente que
     * define la altura máxima de los vehículos que podrán atravesarlo.
     * Para evitar problemas con los vehículos más grandes en las carreteras se
     * colocan carteles y otros mecanismos para indicar a los conductores la altura
     * de puente próximo. Gracias a esta información se pueden registrar las alturas
     * de los puentes de un trayecto para conocer si el vehículo grande podrá pasar
     * por debajo de todos ellos.
     * Escribe un programa que lea el número de puentes o túneles (hasta 100) que
     * hay en el trayecto que se desea hacer. A continuación, para cada uno se leerá
     * de teclado el número de carriles que pasan por debajo (como mucho 5) y la
     * altura de cada uno de los carriles en centímetros (un número entre 200 y
     * 800).
     * Para terminar, el programa escribirá en pantalla la altura máxima que puede
     * tener el camión para poder realizar el trayecto, teniendo en cuenta que este
     * puede utilizar cualquiera de los carriles disponibles en cada puente/túnel.
     */
    public static void main(String[] args) {
        int pasos, carriles = 0, altura = 0, alturaMaxima = 200;

        System.out.print("Introduzca el número de puentes o túneles en el trayecto deseado:");
        pasos = new Scanner(System.in).nextInt();

        if (pasos <= 100) {
            for (int i = 1; i <= pasos; i++) {
                System.out.print("Introduzca el número de carriles del puente o túnel " + i + ": ");
                carriles = new Scanner(System.in).nextInt();
                if (carriles > 0 && carriles <= 5) {
                    for (int j = 1; j <= carriles; j++) {
                        System.out.print("Introduzca la altura (en centímetros) del carril " + j + " del puente o túnel " + i + ": ");
                        altura = new Scanner(System.in).nextInt();
                        if (altura >= 200 && altura <= 800) {
                            alturaMaxima = altura;
                        } else {
                            System.out.println("Altura no válida.");
                        }
                    }
                } else {
                    System.out.println("Número de carriles no válido.");
                }
            }
        } else {
            System.out.println("Has introducido demasiados puentes y túneles.");
        }
        System.out.println("La altura máxima del camión para poder pasar por todos los carriles en todos los túneles y puentes es de " + alturaMaxima + " centímetros.");
    }
}