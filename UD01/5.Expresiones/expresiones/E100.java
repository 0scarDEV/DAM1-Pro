package expresiones;

public class E100 {
    public static void main(String[] args) {
        double x = 1, y = 1, a = 1, b = 1, c = 1, d = 1, e = 1, f = 1, g = 1, h = 1, j = 1, m = 1, n = 1, p = 1, q = 1, r = 1, s = 1;
/* 1. Convierte en expresiones algorítmicas las siguientes expresiones algebráicas. Coloca paréntesis solamente donde sean necesarios.*/
        double varA = 3 / 2.0 + 4 / 3.0;
        System.out.println("varA: " + varA);

        double varB = 1.0 / (x - 5) - 3 * x * y / 4;
        System.out.println("varB: " + varB);

        double varC = 1.0 / 2 + 7;
        System.out.println("varC: " + varC);

        double varD = 7.0 + 1 / 2;
        System.out.println("varD: " + varD);

        double varE = a * a / (b - c) + (d - e) / (f - g * h / j);
        System.out.println("varE: " + varE);

        double varF = m / n + p;
        System.out.println("varF: " + varF);

        double varG = m + n / (p - q);
        System.out.println("varG: " + varG);

        double varH = a * a / (b * b) + c * c / (d * d);
        System.out.println("varH: " + varH);

        double varI = (m + n / p) / (q - r / s) ;
        System.out.println("varI: " + varI);
    
        double varJ = (3.0 * a + b) / (c - (d + 5 * e) / (f + g / (2 * h)));
        System.out.println("varJ: " + varJ);

        double varK = (a * a + 2.0 * a * b + b * b) / (1 / (x * x)) + 2;
        System.out.println("varK: " + varK);
    }
}
