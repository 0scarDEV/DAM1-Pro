package apuntesfunciones;

public class E0411 {
    /*
     * E0411. Escribir una función que calcule de forma recursiva el máximo común divisor de dos números. Para ello sabemos:
     * 
     *      mcd(a,b) = 
     *      mcd(a - b, b)	si a >= b
     *      mcd(a, b - a)	si b > a
     *      a	        	si b = 0
     *      b			    si a = 0
     *
     */
        public static void main(String[] args) {
        // Declaración de variables y constantes
        int mcd = mcd(45, 132);
        
        // Salida
        System.out.println(mcd);
    }    
    static int mcd(int a, int b) {
        int resultado = 0;
        
        if (a == 0) {
            resultado = b;
        } else if (b == 0) {
            resultado = a;
        } else if (b > a) {
            resultado = mcd(a, b - a);
        } else if (a >= b) {
            resultado = mcd(a - b, b);
        }
        
        return resultado;
    }        
}