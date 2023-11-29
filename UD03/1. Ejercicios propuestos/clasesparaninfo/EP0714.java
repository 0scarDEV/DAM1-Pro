package clasesparaninfo;

/* Óscar Fernández Pastoriza
 * EP0714. Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al realizar una compra, con el menor número de monedas y billetes posibles. 
 */
public class EP0714 {
    // A continuación declaramos variables:
    int importe;
    int b50, b20, b10, b5;
    int dineroSobrante50, dineroSobrante20, dineroSobrante10, dineroSobrante5;
    String dineroSobrante;

    void calculos() {
        // Hacemos las operaciones:

        b50 = importe / 50; // Pasamos el importe total en billetes de 50.
        dineroSobrante50 = importe % 50; // Calculamos el importe que sobra de la operación anterior.

        b20 = dineroSobrante50 / 20; // Calculamos el importe en billetes de 20.
        dineroSobrante20 = dineroSobrante50 % 20; // Calculamos el importe que sobra de la operación anterior.

        b10 = dineroSobrante20 / 10; // Calculamos el importe en billetes de 10.
        dineroSobrante10 = dineroSobrante20 % 10; // Calculamos el importe que sobra de la operación anterior.

        b5 = dineroSobrante10 / 5; // Calculamos el importe en billetes de 5.

        // Comprobamos si se puede retirar todo el importe.
        dineroSobrante5 = dineroSobrante10 % 5; // Calculamos el importe que sobra.
        dineroSobrante = (dineroSobrante5 > 0)
                ? (dineroSobrante5 + " euros no se retirarán por no haber billetes tan pequeños.")
                : "";
    }

    void prueba() {
        // Mostramos una salida.
        System.out.println("Se retirarán " + (importe - dineroSobrante5) + " euros:");
        System.out.println(b50 + " billetes de 50 euros.");
        System.out.println(b20 + " billetes de 20 euros.");
        System.out.println(b10 + " billetes de 10 euros.");
        System.out.println(b5 + " billetes de 5 euros.");
        System.out.println(dineroSobrante);
    }
}