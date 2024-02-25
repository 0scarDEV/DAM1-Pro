package interfacesejercicios.EP0935;

public class Persona implements Cliente, Empleado {
    final String DNI;
    String nombre;
    boolean cliente;
    boolean empleado;
    int numHorasTrabajadas;
    double saldo;
    public Persona(String DNI, String nombre, boolean cliente, boolean empleado) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.cliente = cliente;
        this.empleado = empleado;
    }
    @Override
    public double getSaldo() {
        return saldo;
    }
    @Override
    public void incrementarSaldo(double incremento) {
        saldo += incremento;
    }
    @Override
    public int getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }
    @Override
    public void incrementarHorasTrabajadas(int incremento) {
        numHorasTrabajadas += incremento;
    }
}