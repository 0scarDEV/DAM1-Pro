package ficherostextoapuntes.E1001;

import java.util.Scanner;

public class LeerEnteros {
    /* E1001. Escribir el método
        Integer leerEntero()
    que pide un entero por consola, lo lee del teclado y lo devuelve. Si la cadena introducida
    por consola no tiene el formato correcto, muestra un mensaje de error y vuelve a pedirlo. */
    static Integer leerEntero() {
        Scanner sc = new Scanner(System.in);
        Integer n = null;
        boolean flag;
         do {
             try {
                 System.out.print("Introduce un entero: ");
                 n = sc.nextInt();
                 flag = false;
             } catch (Exception e) {
                 System.out.println("Error.");
                 sc.nextLine(); // Vaciar el buffer
                 flag = true;
             }
         } while (flag);

         return n;
    }

    public static void main(String[] args) {
        System.out.println(leerEntero());
    }
}
