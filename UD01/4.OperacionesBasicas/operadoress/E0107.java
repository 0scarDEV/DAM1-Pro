package operadoress;

import java.util.Scanner;

public class E0107 {
    public static void main(String[] args) {
        float radio;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce a continuación el radio del círculo: ");
        radio = sc.nextFloat();

        float perimetro = radio * 2 * 3.1416f;
        float area = radio * radio * 3.1416f;

        System.out.println("Un círculo con radio " + radio + " tiene un perímetro " + perimetro + " y un área " + area);
        sc.close();
    }
}
