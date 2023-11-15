package ejerciciosResueltos;

/* Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las operaciones típicas con una cuenta corriente son:
 * Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 * Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
 * Ingresar dinero: se incrementa el saldo.
 * Mostrar información: muestra información disponible de la cuenta corriente.
*/

public class CuentaCorriente {
    // Atributos
    private String dni;
    private String titular;
    private double saldo;
    private static String banco;
    private Gestor gestor;

    // Constructores
    public CuentaCorriente(String dni, String titular) {
        this(dni, titular, 0);
    }

    public CuentaCorriente(String dni, double saldo) {
        this(dni, "Unknown", saldo);
    }

    public CuentaCorriente(String dni, String titular, double saldo) {
        this.dni = dni;
        this.titular = titular;
        this.saldo = saldo < 0 ? 0 : saldo;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
    
    // Métodos
    // c1.transferir(c2, 100)
    public boolean transferir(CuentaCorriente cuentaDestino, double importe) {
        boolean transferir = false;
        if (saldo > importe) {
            saldo -= importe;
            cuentaDestino.saldo += importe;
            transferir = true;
        }
        return transferir;
    }

    // CuentaCorriente.transferir(c1, c2, 100)
    public static void transferir(CuentaCorriente cuentaOrigen, CuentaCorriente cuentaDestino, double importe) {
        if (cuentaOrigen.saldo >= importe) {
            cuentaOrigen.saldo -= importe;
            cuentaDestino.saldo += importe;
        }
    }


    boolean sacarDinero(double importe) {
        boolean retiradaOk = false;
        if (saldo >= importe) {
            saldo -= importe;
            retiradaOk = true;
        }
        return retiradaOk;
    }

    public void mostrar() {
        System.out.println();
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Con DNI: " + dni);
        System.out.println("El saldo actual es de " + saldo + " euros.");
        //System.out.println("Con Gestor: " + gestor.nombre + " con teléfono " + gestor.telefono);
        System.out.println();
    }

    void ingresarDinero(double importe) {
        saldo += importe;
    }

    public static void main(String[] args) {
        CuentaCorriente cuenta1;

        cuenta1 = new CuentaCorriente("12345678X", "Óscar");
        Gestor g1 = new Gestor("Yoel", "+34 666 66 66 66");
        cuenta1.gestor = g1;
        //Mostramos la información.
        cuenta1.mostrar();
        //Ingresamos dinero y mostramos información.
        cuenta1.ingresarDinero(10);
        cuenta1.mostrar();
        //Retiramos dinero y mostramos información.
        System.out.println("¿Ha sido posible retirar el dinero?" + cuenta1.sacarDinero(5));
        cuenta1.mostrar();
    }
}