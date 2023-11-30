package pruebas;

public class Persona {

	public class Ropa {
		static String torso = "sudadera";
	}
    // Atributos
    String nombre;
    byte edad = 25; //Asignando un valor se asigna por defecto.
    double estatura; //(en metros)
	Ropa torso = "jersey";

    final String dni = "";

    // Constructores

    Persona() {
    }

    Persona(String nombre, byte edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

    public static void main(String[] args) {
        Persona p1 = new Persona();
        System.out.println(p1.nombre);
        p1.nombre = "Oscar";
        System.out.println(p1.nombre);
        System.out.println(p1.edad);
		int num = 4;
        Persona p = new Persona("Yoel", (byte)35);
        System.out.println(p.nombre);
        System.out.println(p.edad);
		sout(p.torso);
    }
}