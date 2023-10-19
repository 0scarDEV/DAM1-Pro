package apuntesbucles;

public class E0310 {
    // E0310. Diseñar un programa que muestre la suma de los 10 primeros números impares.
    public static void main(String[] args) {
        int suma = 0;
        final int ULTIMO_PAR = 2*10;

        for (int i = 1; i < ULTIMO_PAR; i+=2) {
            suma += i;
        }
        System.out.println("La suma de los 10 primeros números impares es: " + suma);
    }
}