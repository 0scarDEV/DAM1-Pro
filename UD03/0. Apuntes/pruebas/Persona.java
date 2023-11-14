package pruebas;

public class Persona {

    // Atributos
    String nombre;
    byte edad = 25; //Asignando un valor se asigna por defecto.
    double estatura; //(en metros)

    final String dni = "";

    // Métodos
    void saludar() {
        System.out.println("Hola, me llamo " + nombre);
    }
    
    void cumplirAnhos() {
        edad++;
    }

    void crecer(double metros) {
        estatura = estatura + metros;
    }
}