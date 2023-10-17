package expresiones;

public class E600 {
    public static void main(String[] args) {
        
        boolean W = false, X = true, Y = true, Z = false;
        
        System.out.println(W || Y && X && W || Z);
        System.out.println(X && !Y && !X || !W && Y);
        System.out.println(!(W || !Y) && X || Z);
        System.out.println(X && Y && W || Z || X);
        System.out.println(Y || !(Y || Z && W));
        System.out.println(!X && Y && (!Z || !X));
    }
}
