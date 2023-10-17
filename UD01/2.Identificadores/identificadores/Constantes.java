package identificadores;

public class Constantes {
    public static void main(String[] args) {

/* Declaramos las constantes: */
        final byte NUMERO_ALUMNOS = 32;
        final short NUM_TOTAL_SESIONES_PROGRAMACION = 288;
        final byte NUM_SESIONES_SEMANAL_PROGRAMACION = 9;
        final byte NUM_MESES_AÑO = 12;

/* Imprimimos los datos en formato texto: */
        System.out.println("A continuación son mostradas las solicitudes:");
        System.out.println("El número de alumnos matriculados en el módulo de programación según el aula virtual es de " + NUMERO_ALUMNOS);
        System.out.println("El módulo de programación durante el curso lectivo tiene " + NUM_TOTAL_SESIONES_PROGRAMACION + " sesiones totales");
        System.out.println("El módulo de programación durante una semana tiene " + NUM_SESIONES_SEMANAL_PROGRAMACION + " sesiones");
        System.out.println("Un año tiene " + NUM_MESES_AÑO + " meses");
    }
}