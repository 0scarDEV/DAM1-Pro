package expresiones;

public class E200 {
    public static void main(String[] args) {
/* 2. Convierte en expresiones algorítmicas las siguientes expresiones algebráicas. Coloca paréntesis solamente donde sean necesarios.
 */
        double a = 1, b = 1, c = 1, d = 1, x = 1, y = 1, z = 1;

        double varA = b / 2 - 4 * a * c;
        System.out.println("varA: " + varA);

        double varB = 3 * x * y - 5 * x + 12 * x - 17;
        System.out.println("varB: " + varB);

        double varC = (b + d) / (c + 4);
        System.out.println("varC: " + varC);

        double varD = (x * y) / y + 2;
        System.out.println("varD: " + varD);

        double varE = 1 / y + 3 * x / z + 1;
        System.out.println("varE: " + varE);

        double varF = 1 / (y + 3) + x / y + 1;
        System.out.println("varF: " + varF);
    
        double varG = 1 / y + (3 + x) / (y + 1);
        System.out.println("varG: " + varG);
    }
}
