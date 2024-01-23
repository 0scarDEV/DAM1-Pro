package arraysejercicios;
/* Óscar Fernández Pastoriza */
public class CuadradoDiabolico {
    public static void main(String[] args) {
        /* int[][] t = {{22,	47,	16,	41,	10,	35,	4},
                     {5,	23,	48,	17,	42,	11,	29},
                     {30,	6,	24,	49,	18,	36,	12},
                     {13,	31,	7,	25,	43,	19,	37},
                     {38,	14,	32,	1,	26,	44,	20},
                     {21,	39,	8,	33,	2,	27,	45},
                     {46,	15,	40,	9,	34,	3,	28}};
        */
        int[][] t = {{1,	63,	62,	4,	5,	59,	58,	8,},
                {56,	10,	11,	53,	52,	14,	15,	49,},
                {48,	18,	19,	45,	44,	22,	23,	41,},
                {25,	39,	38,	28,	29,	35,	34,	32},
                {33,	31,	30,	36,	37,	27,	26,	40},
                {24,	42,	43,	21,	20,	46,	47,	17},
                {16,	50,	51,	13,	12,	54,	55,	9},
                {57,	7,	6,	60,	61,	3,	2,	64}};
        if (esCuadrada(t) && esMatrizMagicaDiabolica(t) && esCifraValida(t) && esConstanteMagica2(t)) {
            if (t.length % 2 != 0) {
                if (imparCentroLados(t) == esquinas(t) && imparCentroLados(t) == imparCentro(t)) {
                    System.out.println("ESOTÉRICO");
                } else {
                    System.out.println("NO");
                }
            } else {
                if (parCentroLados(t) == (2 * esquinas(t)) && esquinas(t) == parCentro(t)) {
                    System.out.println("ESOTÉRICO");
                } else {
                    System.out.println("NO");
                }
            }
        } else {
            System.out.println("Fallo");
        }
    }
    public static int parCentroLados(int[][] t) {
        int mitadSuperior =  t[0][(t.length - 1) / 2]               +   t[0][t.length / 2];
        int mitadInferior =  t[t.length - 1][(t.length - 1) / 2]    +   t[t.length - 1][t.length / 2];
        int mitadDerecha =   t[(t.length - 1) / 2][t.length - 1]    +   t[t.length / 2][t.length - 1];
        int mitadIzquierda = t[(t.length - 1) / 2][0]               +   t[t.length / 2][0];

        return mitadSuperior + mitadInferior + mitadDerecha + mitadIzquierda;
    }
    public static int parCentro(int[][] t) {
        int arribaIzq = t[t.length / 2 - 1][t.length / 2 - 1];
        int abajoIzq =  t[t.length / 2 - 1][t.length / 2];
        int arribaDer = t[t.length / 2][t.length / 2 - 1];
        int abajoDer =  t[t.length / 2][t.length / 2];

        return arribaIzq + abajoIzq + arribaDer + abajoDer;
    }
    public static int imparCentro (int[][] t) {
        return 4 * t[(t.length - 1) / 2][(t.length - 1) / 2];
    }
    public static int esquinas (int[][] t) {
        return t[0][0] + t[0][t.length - 1] + t[t.length - 1][0] + t[t.length - 1][t.length - 1];
    }
    public static int imparCentroLados (int[][] t) {
        int mitadSuperior =  t[0][(t.length - 1) / 2];
        int mitadInferior =  t[t.length - 1][(t.length - 1) / 2];
        int mitadDerecha =   t[(t.length - 1) / 2][t.length - 1];
        int mitadIzquierda = t[(t.length - 1) / 2][0];

        return mitadSuperior + mitadInferior + mitadDerecha + mitadIzquierda;
    }
    public static boolean esConstanteMagica2 (int[][] t) {
        return t[0][0] + t[t.length - 1][t.length - 1] + t[0][t.length - 1] + t[t.length - 1][0] == (4 * constanteMagica(t)) / t.length;
    }
    public static boolean esCifraValida(int[][]t) {
        boolean esCifraValida = true;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (t[i][j] > (t.length * t[0].length)) {
                    esCifraValida = false;
                }
            }
        }
        return esCifraValida;
    }
    public static boolean esMatrizMagicaDiabolica(int[][] t) {
        return (sumatorioFilasEsIgual(t) == sumatorioColumnasEsIgual(t) && sumatorioColumnasEsIgual(t) == sumaDiagonalesPrincipales(t));
    }
    public static int constanteMagica(int[][] t) {
        if (esMatrizMagicaDiabolica(t)) {
            return sumaDiagonalesPrincipales(t);
        } else {
            return 0;
        }
    }
    private static int sumaDiagonalesPrincipales(int[][] t) {
        int sumatorioIzqDer = 0;
        int sumatorioDerIzq = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (i == j) {
                    sumatorioIzqDer += t[i][j];
                }
            }
        }
        for (int i = t.length -1; i >= 0; i--) {
            for (int j = t[0].length; j >= 0; j--) {
                if (i == j) {
                    sumatorioDerIzq += t[i][j];
                }
            }
        }
        if (sumatorioIzqDer == sumatorioDerIzq) {
            return sumatorioIzqDer;
        } else {
            return 0;
        }
    }
    private static int sumatorioFilasEsIgual(int[][] t){
        int sumatorioFila1 = 0, sumatorioFila2 = 0, sumatorioFila3 = 0, sumatorioFila4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[i][j];
                switch (i) {
                    case 0 -> sumatorioFila1 = sumatorio;
                    case 1 -> sumatorioFila2 = sumatorio;
                    case 2 -> sumatorioFila3 = sumatorio;
//                    case 3 -> sumatorioFila4 = sumatorio;
                }
            }
        }
        if (sumatorioFila1 == sumatorioFila2 && sumatorioFila2 == sumatorioFila3) {
            return sumatorioFila1;
        } else {
            return 0;
        }
    }
    private static int sumatorioColumnasEsIgual(int[][] t){
        int sumatorioFila1 = 0, sumatorioFila2 = 0, sumatorioFila3 = 0, sumatorioFila4 = 0;
        for (int i = 0; i < t.length; i++) {
            int sumatorio = 0;
            for (int j = 0; j < t[0].length; j++) {
                sumatorio += t[i][j];
                switch (i) {
                    case 0 -> sumatorioFila1 = sumatorio;
                    case 1 -> sumatorioFila2 = sumatorio;
                    case 2 -> sumatorioFila3 = sumatorio;
   //                 case 3 -> sumatorioFila4 = sumatorio;
                }
            }
        }
        if (sumatorioFila1 == sumatorioFila2 && sumatorioFila2 == sumatorioFila3) {
            return sumatorioFila1;
        } else {
            return 0;
        }
    }
    public static Boolean esCuadrada(int[][] t){
        Boolean res = null;
        if (esMatrizValida(t)) {
            res = t.length == t[0].length;
        }
        return res;
    }
    public static Boolean esMatrizValida(int[][] t){
        return t != null && t.length > 0 && t[0].length > 0;
    }
}