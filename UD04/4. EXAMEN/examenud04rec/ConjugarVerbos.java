package examenud04rec;
import java.util.Scanner;
/* Óscar Fernández Pastoriza*/
public class ConjugarVerbos {
    /* 1. */
    public static String[] conjugarPresente(String verbo) {
        String terminacion = verbo.substring(verbo.length() - 2);
        String[] conjugacion = new String[6];
        String raiz = verbo.substring(0, verbo.length() - 2);
        String raizMasLetra = verbo.substring(0, raiz.length() + 1);

        // Si verbo no tiene una terminación válida:
        if (!(terminacion.equals("ar") || terminacion.equals("er") || terminacion.equals("ir"))) {
            return null;
        }

        // 1ra persona del singular
        conjugacion[0] = raiz + "o";
        // 1ra persona del plural
        conjugacion[3] = verbo.substring(0, raiz.length() + 1) + "mos";

        // Casos exclusivos de cada terminación
        switch (terminacion) {
            case "ar" -> {
                conjugacion[1] = raiz + "as";   // 2da persona del singular
                conjugacion[2] = raiz + "a";    // 3ra persona del singular
                conjugacion[4] = raiz + "áis";  // 2da persona del plural
            }
            case "er" -> {
                conjugacion[4] = raiz + "éis";  // 2da persona del plural
            }
            default -> {
                conjugacion[4] = raiz + "ís";   // 2da persona del plural
                conjugacion[5] = raiz + "en";   // 3ra persona del plural
            }
        }

        // Casos comunes a las terminaciones "er" e "ir"
        if (terminacion.equals("er") || terminacion.equals("ir")) {
            conjugacion[1] = raiz + "es";   // 2da persona del singular
            conjugacion[2] = raiz + "e";    // 3ra persona del singular
        }

        // Caso comun a la terminación "ar" y "er"
        if (terminacion.equals("ar") || terminacion.equals("er")) {
            conjugacion[5] = raizMasLetra + "n";   // 3ra persona del plural
        }

        return conjugacion;
    }
    /* 2. */
    public static void main(String[] args) {
        String[] persona = {
                "Yo",
                "Tu",
                "El, Ella, Usted",
                "Nosotros / Nosotras",
                "Vosotros / Vosotras",
                "Ellos / Ellas / Ustedes"
        };
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce por teclado un verbo en infinitivo o escribe \"fin\" para terminar: ");
        String infinitivo = sc.nextLine();

        while (!infinitivo.equals("fin")) {
            String terminacion = infinitivo.substring(infinitivo.length() - 2);

            // Si la terminación no es válida, excepción.
            if (!(terminacion.equals("ar") || terminacion.equals("er") || terminacion.equals("ir"))) {
                throw new IllegalArgumentException("ERROR. El valor introducido no se encuentra en infinitivo.");
            }

            String[] conjugaciones = conjugarPresente(infinitivo);
            if (conjugaciones != null) {
                for (int i = 0; i < 6; i++) {
                    System.out.println(persona[i] + " " + conjugaciones[i]);
                }
            }

            System.out.println("Introduce por teclado un verbo en infinitivo o escribe \"fin\" para terminar: ");
            infinitivo = sc.next();
        }

    }

    /* 3. */
    public static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal) {
        String terminacion = verbo.substring(verbo.length() - 2);
        String[] conjugacion;

        // Si verbo no tiene una terminación válida:
        if (!(terminacion.equals("ar") || terminacion.equals("er") || terminacion.equals("ir"))) {
            return null;
        }

        switch (tiempoVerbal) {
            case "Presente simple" -> {
                conjugacion = conjugarPresente(verbo);
            }
            case "Pretérito perfecto simple" -> {
                conjugacion = conjugarPreteritoPerfectoSimple(verbo);
            }
            case "Futuro simple" -> {
                conjugacion = conjugarFuturoSimple(verbo);
            }
            // Si no es una opción válida:
            default -> {
                conjugacion = null;
            }
        }
        return conjugacion;
    }

    private static String[] conjugarPreteritoPerfectoSimple(String verbo) {
        String terminacion = verbo.substring(verbo.length() - 2);
        String raiz = verbo.substring(0, verbo.length() - 2);
        String raizMasLetra = verbo.substring(0, raiz.length() + 1);

        String[] conjugaciones = new String[6];

        switch (terminacion) {
            case "ar" -> {
                conjugaciones[0] = raiz + "é";
                conjugaciones[1] = raizMasLetra + "ste";
                conjugaciones[2] = raiz + "ó";
                conjugaciones[3] = raizMasLetra + "mos";
                conjugaciones[4] = raiz + "ásteis";
                conjugaciones[5] = verbo + "on";

            }
            case "er" -> {
                conjugaciones[0] = raiz + "í";
                conjugaciones[1] = raiz + "iste";
                conjugaciones[2] = raiz + "ió";
                conjugaciones[3] = raiz + "imos";
                conjugaciones[4] = raiz + "ísteis";
                conjugaciones[5] = raiz + "ieron";
            }
            default -> {
                conjugaciones[0] = raiz + "í";
                conjugaciones[1] = raizMasLetra + "ste";
                conjugaciones[2] = raizMasLetra + "ó";
                conjugaciones[3] = raizMasLetra + "mos";
                conjugaciones[4] = raiz + "ísteis";
                conjugaciones[5] = raizMasLetra + "eron";
            }
        }

        return conjugaciones;
    }
    private static String[] conjugarFuturoSimple(String verbo) {
        final String[] CONJUNCIONES = {"é", "ás", "á", "emos", "éis", "án"};
        String[] conjugacion = new String[6];

        for (int i = 0; i < 6; i++) {
            conjugacion[i] = verbo + CONJUNCIONES[i];
        }

        return conjugacion;
    }
}
