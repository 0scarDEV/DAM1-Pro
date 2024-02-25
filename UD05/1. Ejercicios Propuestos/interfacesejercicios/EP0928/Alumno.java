package interfacesejercicios.EP0928;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Alumno implements Comparable {
    /* EP0928. Crea una nueva clase para almacenar datos de alumnos (nombre, apellido, edad, nota media). Implementa al menos un constructor con todos los atributos. Redefine el método toString() de la clase Object para imprimir los alumnos con todos sus datos.
    * Implementa la interfaz Comparable para ordenarlos por Apellido como criterio natural.
    * Implementa comparadores para ordenar también por los otros atributos. */
    String nombre;
    String apellidos;
    byte edad;
    double notaMedia;
    public Alumno(String nombre, String apellidos, int edad, double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = (byte) edad;
        this.notaMedia = notaMedia;
    }
    @Override
    public String toString() {
        return nombre + " " + apellidos + " tiene " + edad  + " años, su nota media es " + notaMedia;
    }
    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        return apellidos.compareTo(a.apellidos);
    }
    static Comparator comparadorNombre = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Alumno a1 = (Alumno) o1;
            Alumno a2 = (Alumno) o2;
            return a1.nombre.compareTo(a2.nombre);
        }
    };
    static Comparator comparadorEdad = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Alumno a1 = (Alumno) o1;
            Alumno a2 = (Alumno) o2;
            return a1.edad - a2.edad;
        }
    };
    static Comparator comparadorNotaMediaAsc = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Alumno a1 = (Alumno) o1;
            Alumno a2 = (Alumno) o2;
            return Double.compare(a1.notaMedia, a2.notaMedia);
        }
    };
    static Comparator comparadorNotaMediaDesc = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            Alumno a1 = (Alumno) o1;
            Alumno a2 = (Alumno) o2;
            return Double.compare(a2.notaMedia, a1.notaMedia);
        }
    };
    /* Crea un pequeño programa principal con datos de al menos 3 alumnos y un pequeño menú que los muestre ordenados por distintos criterios, ascendentemente y descendentemente. */
    public static void main(String[] args) {
        // Declaración de variables y constantes
        Alumno[] alumnado = new Alumno[3];
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Entrada de datos
        alumnado[0] = new Alumno("Alba", "López", 23, 7.5);
        alumnado[1] = new Alumno("Juan", "Fernández", 33, 8.5);
        alumnado[2] = new Alumno("María", "Cobas", 20, 6);

        // Proceso
        System.out.println("ALUMNADO");
        System.out.println("========");
        System.out.println("1. Ordenar por apellido");
        System.out.println("2. Ordenar por nota media ascendente");
        System.out.println("3. Ordenar por nota media descendente");
        System.out.println("4. Ordenar por edad");
        opcion = sc.nextInt();

        // Salida
        switch(opcion){
            case 1: Arrays.sort(alumnado); break;
            case 2: Arrays.sort(alumnado, comparadorNotaMediaAsc); break;
            case 3: Arrays.sort(alumnado, comparadorNotaMediaDesc); break;
            case 4: Arrays.sort(alumnado, comparadorEdad); break;
        }
        System.out.println(Arrays.deepToString(alumnado));
    }
}