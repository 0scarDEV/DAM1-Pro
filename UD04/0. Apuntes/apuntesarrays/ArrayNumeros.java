package apuntesarrays;
import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de números a introducir: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 19 - 9);
        }

        System.out.println("Este es el array generado: ");
        imprimir(numeros);
        System.out.println("\nLa media de los números positivos es: " + mediaPositivos(numeros));
        System.out.println("La media de los números negativos es: " + mediaNegativos(numeros));
        System.out.println("La cantidad de veces que aparece el 0 es: " + contarCeros(numeros));
        System.out.print("Este es el array inverso: ");
        imprimirInversos(numeros);
        System.out.println("\nBuscaremos el número 0. -> " + buscar(numeros, 0));
    }

    public static double mediaPositivos(int[] t) {
        int sumaPositivos = 0;
        int cantidadPositivos = 0;
        if (longitudCero(t)) {
            for (int i = 0; i < t.length; i++) {
                if (t[i] > 0) {
                    cantidadPositivos++;
                    sumaPositivos += t[i];
                }
            }
        }
        return (double) sumaPositivos / cantidadPositivos;
    }

    public static double mediaNegativos(int[] t) {
        int sumaNegativos = 0;
        int cantidadNegativos = 0;
        if (longitudCero(t)) {
            for (int i = 0; i < t.length; i++) {
                if (t[i] < 0){
                    cantidadNegativos++;
                    sumaNegativos += t[i];
                }
            }
        }
        return (double) sumaNegativos / cantidadNegativos;
    }

    public static int contarCeros(int[] t) {
        int cantidadCeros = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == 0){
                cantidadCeros++;
            }
        }
        return cantidadCeros;
    }

    public static void imprimir(int[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
    }

    public static void imprimirInversos(int[] t) {
        for (int i = t.length - 1; i >= 0; i--){
            System.out.print(t[i] + " ");
        }
    }

    public static boolean longitudCero(int[] t) {
        if (t != null || t.length > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int buscar(int[] t, int clave) {
        int posicion = -1;
        int i = 0;
        while (i < t.length && posicion == -1) {
            if (t[i] == clave) {
                posicion = i;
            }
            i++;
        }
        return posicion;
    }
}