package examenud04;
/* Óscar Fernández Pastoriza */
public class MontanaRusa {
    public static void main(String[] args) {
        int[] pico1 = {4, 10, 3, 2};
        int[] pico2 = {10, 3, 2, 4};
        int[] pico3 = {4, 10, 10, 3, 2};
        System.out.println(contarPicos(pico1));
        System.out.println(contarPicos(pico2));
        System.out.println(contarPicos(pico3));
    }
    public static int contarPicos(int[] alturas) {
        int contador = 0;
        for (int i = 0; i < alturas.length; i++) {
            if (i == 0) {                                                                       // Si es la primera posición
                if (alturas[alturas.length - 1] < alturas[i] && alturas[i] > alturas[i+1]) {
                    contador++;
                }
            } else if (i == alturas.length - 1){                                                // Si es la última posición
                if (alturas[i - 1] < alturas[i] && alturas[i] > alturas[0]) {
                    contador++;
                }
            }else {                                                                             // Si es cualquier otra posición
                if (alturas[i-1] < alturas[i] && alturas[i] > alturas[i+1]) {
                    contador++;
                }
            }
        }
        return contador;
    }
}