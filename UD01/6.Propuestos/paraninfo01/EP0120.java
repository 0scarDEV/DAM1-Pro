package paraninfo01;
/*
 * Autor: Óscar Fernández Pastoriza
 * Descripción: Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando el nombre cualificado de las clases, en lugar de utilizar ninguna importación.
 */
public class EP0120 {
    public static void main(String[] args) {
        // Declaración de variables y constantes
        double numero, raiz;
        // En este ejercicio usamos la clase Scanner sin importarla previamente.
        java.util.Scanner sc;
        sc = new java.util.Scanner(System.in);

        // Entrada de datos
        System.out.print("Introduce un número real: ");
        numero = sc.nextDouble();
        
        // Proceso
        raiz = Math.sqrt(numero);
        
        // Salida
        System.out.println("Raíz cuadrada: " + raiz);

        sc.close();
    }
}
