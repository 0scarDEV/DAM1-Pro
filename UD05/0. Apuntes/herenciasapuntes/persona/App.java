package herenciasapuntes.persona;

public class App {
    public static void main(String[] args) {

        Persona p = new Persona("Marta", (byte) 35, 1.70);

        Empleado e = new Empleado("Sancho", (byte) -25, 1.80, 1725.49);

        Cliente c = new Cliente("Juan", (byte) 40, 1.75, 12345);

        Estudiante es = new Estudiante("Marcos", 6, 7, 8);

        Persona[] gente = new Persona[4];
        gente[0] = p;
        gente[1] = e;
        gente[2] = c;
        gente[3] = es;

        for (Persona x : gente) {
            System.out.println(x);
        }

        Cliente c2 = new Cliente("Juan", (byte) 40, 1.75, 12345);

        System.out.println(c == c2);
        System.out.println(c.equals(c2));
    }
}
