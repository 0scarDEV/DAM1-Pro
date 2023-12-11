package clasesparaninfo;

/* Óscar Fernández Pastoriza
 * EP0714. Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al realizar una compra, con el menor número de monedas y billetes posibles.
 */
public class EP0714 {
    double dineroRecibido, precioTotal, cambio;
    private int b50, b20, b10, b5, m2e, m1e, m50c, m20c, m10c, m5c, m2c, m1c;
    public EP0714(double dineroRecibido, double precioTotal) {
        this.dineroRecibido = dineroRecibido;
        this.precioTotal = precioTotal;
        this.cambio = 0;
    }

    private void operaciones(){
        double b50Sobrante, b20Sobrante, b10Sobrante, m2eS, m1eS, m50cS, m20cS, m5cS;
        double billetesSobrantes, monedasSobrantes;
        this.cambio = dineroRecibido - precioTotal;

        // Hacemos las operaciones:
        b50 = (int) (cambio / 50); // Pasamos el importe total en billetes de 50.
        b50Sobrante = (cambio % 50); // Calculamos el importe que sobra de la operación anterior.

        b20 = (int) (b50Sobrante / 20); // Calculamos el importe en billetes de 20.
        b20Sobrante = b50Sobrante % 20; // Calculamos el importe que sobra de la operación anterior.

        b10 = (int) (b20Sobrante / 10); // Calculamos el importe en billetes de 10.
        b10Sobrante = b20Sobrante % 10; // Calculamos el importe que sobra de la operación anterior.

        b5 = (int) (b10Sobrante / 5); // Calculamos el importe en billetes de 5.
        billetesSobrantes = (((cambio % 50) % 20) % 10) % 5; // Calculamos el importe que sobra.
        billetesSobrantes = Math.round(billetesSobrantes * 100.0) / 100.0;

        m2e = (int) (billetesSobrantes / 2); // Calculamos el importe en monedas de 2.
        m2eS = billetesSobrantes % 2; // Calculamos el importe que sobra.

        m1e = (int) (m2eS); // Calculamos el importe en monedas de 1.
        m1eS = m2eS % 1; // Calculamos el importe que sobra.

        m50c = (int) (m1eS / 0.5); // Calculamos el importe en monedas de 50cent.
        m50cS = m1eS % 0.5; // Calculamos el importe que sobra.

        m20c = (int) (m50cS / 0.2); // Calculamos el importe en monedas de 20cent.
        m20cS = m50cS % 0.2; // Calculamos el importe que sobra.

        m10c = (int) (m20cS / 0.1); // Calculamos el importe en monedas de 10cent.
        monedasSobrantes = ((((billetesSobrantes % 2) % 1) % 0.5) % 0.2) % 0.1; // Calculamos el importe que sobra.
        monedasSobrantes = Math.round(monedasSobrantes * 100.0) / 100.0;

        m5c = (int) (monedasSobrantes / 0.05); // Calculamos el importe en monedas de 5cent.
        m5cS = monedasSobrantes % 0.05; // Calculamos el importe que sobra.

        m2c = (int) (m5cS / 0.02); // Calculamos el importe en monedas de 2cent.
        m1c = (int) (m5cS % 0.02); // Calculamos el importe en monedas de 1cent.
    }

    public void getCambio() {
        this.operaciones();

        // Mostramos una salida.
        System.out.println("Se retirarán " + this.cambio + " euros:");
        System.out.println(this.b50 + " billetes de 50 euros.");
        System.out.println(this.b20 + " billetes de 20 euros.");
        System.out.println(this.b10 + " billetes de 10 euros.");
        System.out.println(this.b5 + " billetes de 5 euros.");
        System.out.println(this.m2e + " monedas de 2 euros.");
        System.out.println(this.m1e + " monedas de 1 euro.");
        System.out.println(this.m50c + " monedas de 50 centimos.");
        System.out.println(this.m20c + " monedas de 20 centimos.");
        System.out.println(this.m10c + " monedas de 10 centimos.");
        System.out.println(this.m5c + " monedas de 5 centimos.");
        System.out.println(this.m2c + " monedas de 2 centimos.");
        System.out.println(this.m1c + " monedas de 1 centimos.");
    }

    public static void main(String[] args) {
        EP0714 vuelta1 = new EP0714(50, 50);
        vuelta1.getCambio();
    }
}