package ejerciciosResueltos;

/* Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre del titular, así como el saldo. Las operaciones típicas con una cuenta corriente son:
 * Crear una cuenta: se necesita el DNI y nombre del titular. El saldo inicial será 0.
 * Sacar dinero: el método debe indicar si ha sido posible llevar a cabo la operación, si existe saldo suficiente.
 * Ingresar dinero: se incrementa el saldo.
 * Mostrar información: muestra información disponible de la cuenta corriente.
*/

public class CuentaCorriente {
    String dni;
    String titular;
    double saldo;

    CuentaCorriente(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
    }

    void mostrar() {
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Con DNI: " + dni);
        System.out.println("El saldo actual es de " + saldo + " euros.");
    }

    void ingresarDinero(double importe) {
        saldo += importe;
    }

    boolean sacarDinero(double importe) {
        boolean retiradaOk = false;

        if (saldo >= importe) {
            saldo -= importe;
            retiradaOk = true;
        } else {
            retiradaOk = false;
        }

        return retiradaOk;
    }

    public static void main(String[] args) {
        CuentaCorriente cuenta1;

        cuenta1 = new CuentaCorriente("12345678X", "Óscar");
        //Mostramos la información.
        cuenta1.mostrar();
        //Ingresamos dinero y mostramos información.
        cuenta1.ingresarDinero(10);
        cuenta1.mostrar();
        //Retiramos dinero y mostramos información.
        System.out.println(cuenta1.sacarDinero(5));
        cuenta1.mostrar();
    }
}