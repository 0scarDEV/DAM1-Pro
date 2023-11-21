package E0709;
/*
 * Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente. Para ello, implementar una clase Bombilla con una variable privada que indique si está encendida o apagada, así como un método que nos diga el estado de una bombilla concreta. Además, queremos poner un interruptor general, de forma que si éste se apaga, todas las bombillas quedan apagadas. Cuando el interruptor general se activa, las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes. Cada bombilla se enciende y se apaga individualmente, pero solo responde que está encendida si su interruptor particular está activado y además hay luz general.
 */
public class Bombilla {
    private static boolean estado = false;
    static boolean interruptorGeneral;

    public static void apagarInterruptorGeneral() {
        interruptorGeneral = false;
    }

    public static void encenderInterruptorGeneral() {
        interruptorGeneral = true;
    }

    public void encender() {
        estado = true;
    }

    public void apagar() {
        estado = false;
    }

    public void consultar() {
        if (interruptorGeneral && estado) {
            System.out.println("Encendida");
        } else {
            System.out.println("Apagada");
        }
        
    }

    public static void main(String[] args) {
        Bombilla bCocina = new Bombilla();
        Bombilla bSalon = new Bombilla();

        Bombilla.encenderInterruptorGeneral();

        bCocina.consultar();
        bSalon.consultar();

        Bombilla.apagarInterruptorGeneral();

        bCocina.consultar();
        bSalon.consultar();

        bSalon.encender();
        bSalon.consultar();
    }
}