package apuntes;

import ejerciciosResueltos.CuentaCorriente;

public class Pruebas {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("xxxxxxxxxxxxxxx", -50);
        CuentaCorriente c2 = new CuentaCorriente("zzzzzzzzzzzzzzz", 10000);
        
        c2.transferir(c1, 500);
        c1.mostrar();
        c2.mostrar();

        CuentaCorriente.transferir(c2, c1, 750);
        c1.mostrar();
        c2.mostrar();
    }
}