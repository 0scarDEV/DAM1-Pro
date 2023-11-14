package pruebas;

public class Introduccion {
    public static void main(String[] args) {
        // Creamos un objeto, persona.
        Persona persona1 = new Persona();
        System.out.println("Referencia de persona1: " + persona1);

        persona1.nombre = "Juan";
        persona1.edad = 24;
        persona1.estatura = 1.7;

        System.out.println(
                persona1.nombre + " tiene " + persona1.edad + " años y mide " + persona1.estatura + " metros.");

        // Creamos otra persona, vemos que toma el atributo "edad" por defecto y que tras enviarlo al método "sumarEdad" la edad se suma.
        Persona persona2 = new Persona();
        System.out.println("Referencia de persona2: " + persona2);
        
        persona2.nombre = "Luis";
       
        System.out.println(persona2.nombre + " tiene "  + persona2.edad + " años.");

        sumarEdad(persona2.edad, persona2);
        
        System.out.println("Ahora " + persona2.nombre + " tiene " + persona2.edad + " años.");

        // Direccionamiento de memoria
        Persona p1, p2;
        p1 = new Persona();
        p2 = p1;

        p2.nombre = "Pedro";
        System.out.println(p1.nombre);

        System.out.println(p1.nombre + " tiene " + p1.edad + " años.");
        
        // Incluimos métodos de la clase Persona.
        p1.nombre = "Pepa";
        
        p1.saludar();
        p1.cumplirAnhos();
        p1.crecer(0.1);

        System.out.println(p1.nombre + " tiene " + p1.edad + " años y mide " + p1.estatura + " metros.");
    }
    
    static int sumarEdad(int anhos, Persona p) {
        p.edad += anhos;
        return p.edad;
    }
}