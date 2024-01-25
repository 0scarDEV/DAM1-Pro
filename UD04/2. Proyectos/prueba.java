public class prueba {
    public static void main(String[] args) {
        String cb = "65839522";
        char[] caracter = cb.toCharArray(); // Pasamos el String a un array de caracteres
        int[] num = new int[caracter.length];
        int sumatorio1 = 0;

        for (int i = 0; i < caracter.length; i++) {     // Pasamos esos caracteres a numeros enteros
            num[i] = Integer.parseInt(String.valueOf(caracter[i]));
        }

        for (int i = caracter.length - 2; i >= 0; i--) {    // Empezando desde la n-2 posición (quitando el caracter de control) vemos si es posicion par o impar y sumamos.
            if (i % 2 == 0) {
                sumatorio1 += (num[i] * 3);
            } else {
                sumatorio1 += num[i];
            }
        }

        System.out.println(sumatorio1);
    }
}