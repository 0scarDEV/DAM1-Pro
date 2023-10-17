package operadores;
import java.util.Scanner;

    public class E0104 {
        public static void main(String[] args) {
        short actualYear;
        short birthYear;
        short edadUsuario;
        
        System.out.print("Introduce a continuación el año actual: ");
        Scanner sc = new Scanner(System.in);
        actualYear = sc.nextShort();
        System.out.print("Introduce a continuación tu año de nacimiento: ");
        birthYear = sc.nextShort();
        
        edadUsuario = (short)(actualYear - birthYear);

        System.out.println("Si ya has cumplido años este año, tienes: " + edadUsuario + " años.");
        sc.close();
    }
}
