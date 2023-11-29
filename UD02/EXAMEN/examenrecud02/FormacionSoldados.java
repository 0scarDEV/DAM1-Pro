package examenrecud02;

public class FormacionSoldados {
    static final int NUM_LADOS = 4;
    public static void main(String[] args) {
        int numTropas = 72;

        int tropasPorLado = (int) ((int) numTropas / Math.sqrt(numTropas));
        int tropasSobrantes = (int) (numTropas % Math.sqrt(numTropas));
        bucle(tropasPorLado);
        bucle(tropasSobrantes);
    }

    static void bucle(int tropas) {
        if (tropas >= NUM_LADOS) {
            System.out.println("Formación cuadrada: " + tropas + " soldados.");
            for (int i = 0; i < tropas; i++) {
                    for (int j = 0; j < tropas; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
            }
        } else if (tropas < NUM_LADOS) {
            System.out.println("Formación en línea: " + tropas + " soldados.");
            for (int j = 0; j < tropas; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}