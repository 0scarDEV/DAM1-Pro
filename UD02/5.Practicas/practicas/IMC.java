package practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso = 0, alturaM = 0;
        double alturaCm = 0;

        try {   
            System.out.print("Introduzca a continuación su altura: ");
            alturaCm = sc.nextInt();
            System.out.print("Introduzca a continuación su peso: ");
            peso = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR, INTÉNTELO DE NUEVO");
            boolean flag = false;
            while (flag != true) {
                try {
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Introduzca a continuación su altura: ");
                    alturaCm = sc1.nextInt();
                    System.out.print("Introduzca a continuación su peso: ");
                    peso = sc1.nextInt();
                    flag = true;
                    sc1.close();
                } catch (InputMismatchException d) {
                    System.out.println("ERROR, INTÉNTELO DE NUEVO");
                }
            }
        }
    
        sc.close();

        if (alturaCm >= 50 && alturaCm <= 250) {
            alturaM = alturaCm / 100;
            if (peso >= 20 && peso <= 300) {
                System.out.println(imc(alturaM, peso));
            } else {
                System.out.println("El peso introducido no es correcto.");
            }
        } else {
            System.out.println("La altura introducida no es correcta.");
        }
    }
    static String imc (double altura, double peso) {
        double indiceNum;
        String indice = "", resultado;

        indiceNum = peso / (Math.pow(altura, 2));

        if (indiceNum < 18.5) {
            indice = "está bajo peso.";
        } else if (indiceNum >= 18.5 && indiceNum < 25) {
            indice = "está Normal.";
        } else if (indiceNum >= 25) {
            indice = "tiene sobrepeso.";
        } else if (indiceNum >= 30) {
            indice = "es obeso.";
        }

        resultado = "Su IMC es de " + indiceNum + " y por lo tanto según la OMS usted " + indice;
        return resultado;
    }
}