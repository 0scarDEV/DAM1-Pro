package pruebas;
public class PruebaAlumnado {
    public static void main(String[] args) {
        /* Declaración e inicialización de un array de String de 20 alementos
   que almacena los nombres del alumnado del módulo de Programación de DAM1.
*/
        String[] alumnos = {"Aarón", "Adrián Q", "Marcelo", "Adrián R", "Adrián T",
                "Alberto", "Brais", "César", "Diego", "Eduardo", "Gabriel",
                "Giuseppe", "Gonzalo", "Iago", "Maicol", "Martín", "Nicolás",
                "Raúl", "Roberto", "Sergio"};
// Mostramos todos los nombres uno a uno.
        for (int i = 0; i < alumnos.length; i++){
            System.out.println(alumnos[i]);
        }

// Declaración de un array de enteros para almacenar notas
        int[] notas;
// Creación del array "notas" con una longitud igual a la del número de alumnos.
        notas = new int[alumnos.length];

// Declaración de otros arrays
        int[] notas1, notas2;
        String[] nombres = alumnos;

        notas1 = notas;

        nombres = alumnos;

// Salida por pantalla
        System.out.println("notas: " + notas + " - " + notas.length);
        System.out.println("notas1: " + notas1 + " - " + notas1.length);
        System.out.println("Alumnos: " + alumnos + " - " +  alumnos[4]);
        System.out.println("Nombres: " + nombres + " - " + nombres[4]);


    }
}