package operadores;

import java.util.Scanner;

public class E0108 {
    public static void main(String[] args) {
        int edadUsuario;
        System.out.print("Introduce a continuación tu edad: ");
        Scanner sc = new Scanner(System.in);
        edadUsuario = sc.nextInt();
        
        boolean mayorEdad;
        if (edadUsuario >= 18){
                mayorEdad = true;
        } else {
            mayorEdad = false;
        }

        System.out.println("La afirmación 'Eres mayor de edad' es " + mayorEdad);
        sc.close();
    }
}
