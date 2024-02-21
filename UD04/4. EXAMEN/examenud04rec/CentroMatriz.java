package examenud04rec;
/* Óscar Fernández Pastoriza */
public class CentroMatriz {
    public static int centroMatriz(int[][] t) {
        int media = 0;

        // Si no se recibe una matriz válida:
        if (t == null || t.length == 0) {
            return 0;
        }

        int casillaCentralEnFila = t.length / 2;
        int casillaCentralEnColumna = t[0].length / 2;
        boolean filasPar = t.length % 2 == 0;
        boolean columnasPar = t[0].length % 2 == 0;
        boolean filasImpar = t.length % 2 != 0;
        boolean columnasImpar = t[0].length % 2 != 0;

        if (filasPar && columnasImpar) {
            int casillaSup = t[casillaCentralEnFila - 1][casillaCentralEnColumna];
            int casillaInf = t[casillaCentralEnFila][casillaCentralEnColumna];
            media = (casillaSup + casillaInf) / 2;
        }
        if (filasImpar && columnasPar) {
            int casillaIzq = t[casillaCentralEnFila][casillaCentralEnColumna - 1];
            int casillaDer = t[casillaCentralEnFila][casillaCentralEnColumna];
            media = (casillaIzq + casillaDer) / 2;
        }
        if (filasPar && columnasPar) {
            media = parCentro(t) / 4;
        }
        if (filasImpar && columnasImpar) {
            media = imparCentro(t);
        }

        // La media siempre será redondeada hacia abajo ya que la función devuelve números enteros.
        return media;
    }
    private static int parCentro(int[][] t) {
        int arribaIzq = t[t.length / 2 - 1][t[0].length / 2 - 1];
        int abajoIzq =  t[t.length / 2 - 1][t[0].length / 2];
        int arribaDer = t[t.length / 2][t[0].length / 2 - 1];
        int abajoDer =  t[t.length / 2][t[0].length / 2];

        return arribaIzq + abajoIzq + arribaDer + abajoDer;
    }
    private static int imparCentro (int[][] t) {
        return t[(t.length - 1) / 2][(t[0].length - 1) / 2];
    }
}