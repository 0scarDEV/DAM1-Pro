package practicas;

import java.util.Scanner;

public class Radar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int limite = 120;
        final int distancia = 10;
        int segundos;

        System.out.print("Introduzca a continuación el tiempo (en segundos) que tardó el vehículo en recorrer la distancia: ");
        segundos = sc.nextInt();
        sc.close();
        
        System.out.println(multaInfraccion(limite, excesoVelocidad(distancia, segundos, limite)));      
    }
    static int excesoVelocidad (double distancia, double segundos, int limite){
        int exceso;
        double velocidad, horas;
        
        horas = segundos / 3600;
        velocidad = distancia / horas;
        exceso = (int)(velocidad - limite);
        
        return exceso;
    }

    static String multaInfraccion(int limite, double exceso){
        String infracción = "";
        if (exceso > 120 && exceso <= 150) {
            infracción = "Infracción por exceso de velocidade!! Multa de 100 euros!!";
        } else if (exceso > 150 && exceso <= 170) {
            infracción = "Infracción por exceso de velocidade!! Multa de 300 euros!!";
        } else if (exceso > 170 && exceso <= 180) {
            infracción = "Infracción por exceso de velocidade!! Multa de 400 euros!!";
        } else if (exceso > 180 && exceso <= 190) {
            infracción = "Infracción por exceso de velocidade!! Multa de 500 euros!!";
        } else if (exceso > 190) {
            infracción = "Infracción por exceso de velocidade!! Multa de 600 euros!!";
        } else {
            infracción = "Velocidad dentro del límite";
        }
        return infracción;
    }
}