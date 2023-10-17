package expresiones;

public class E500 {
    public static void main(String[] args) {
// 5. Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:

        boolean X = true;
        boolean Y = false;
        boolean Z = true;

        // Salida
        System.out.println((X && Y) || (X && Z));
        System.out.println((X || !Y) && (!X || Z));
        System.out.println(X || Y && Z);
        System.out.println(!(X || Y) && Z);
        System.out.println(X || Y || X && !Z && !Y);
        System.out.println(!X || !Y || Z && X && !Y);
    }       
}