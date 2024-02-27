package interfacesejercicios.EP0935;

public class Persona implements Cliente, Empleado {
    final String dni;
    String nombre;
    boolean esCliente;
    boolean esEmpleado;
    int numHorasTrabajadas;
    double saldo;
    public Persona(String dni, String nombre, boolean cliente, boolean empleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.esCliente = cliente;
        this.esEmpleado = empleado;
    }
    @Override
    public double getSaldo() {
        if (esCliente) {
            return saldo;
        } {
            return -1;
            // throw new IllegalAccessException("Esta persona no es cliente.");
        }
    }
    @Override
    public void setSaldo(double saldo) {
        if (esCliente) {
            this.saldo = saldo;
        }
    }
    @Override
    public void incrementarSaldo(double incremento) {
        if (esCliente) {
            saldo += incremento;
        }
    }

    @Override
    public int getNumHorasTrabajadas() {
        if (esEmpleado) {
            return numHorasTrabajadas;
        } {
            return -1;
            // throw new IllegalAccessException("Esta persona no es cliente.");
        }
    }
    @Override
    public void setHorasTrabajadas(int horas) {
        if (esEmpleado) {
            this.numHorasTrabajadas = horas;
        }
    }
    @Override
    public void incrementarHorasTrabajadas(int incremento) {
        if (esEmpleado) {
            numHorasTrabajadas += incremento;
        }
    }

    @Override public String toString() {
        String str = "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'';
        if (esEmpleado) {
            str += ", numHorasTrabajadas=" + numHorasTrabajadas;
        }
        if (esCliente) {
            str += ", saldo=" + saldo;
        }
        str += "}";
        return str;
    }
}