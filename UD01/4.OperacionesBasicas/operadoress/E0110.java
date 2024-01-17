package operadoress;

import java.util.Scanner;

public class E0110 {
    public static void main(String args[]) {
        boolean permiso;
        Scanner sc = new Scanner(System.in);
        
        boolean estaLloviendo;
        System.out.print("Introduce mediante 'true' si está lloviendo o 'false' si NO está lloviendo: ");
        estaLloviendo = sc.nextBoolean();

        boolean tareas;
        System.out.print("Introduce mediante 'true' si tienes tareas pendientes o 'false' si NO tienes tareas pendientes: ");
        tareas = sc.nextBoolean();

        boolean recado;
        System.out.print("Introduce mediante 'true' si hay que hacer un recado o 'false' si NO tienes que hacer recados: ");
        recado = sc.nextBoolean();
        
        permiso = recado || (!tareas && !estaLloviendo) ;
        
        System.out.println("Puedes salir de casa: " + permiso);
        sc.close();
      }
}
