package clasesapuntes;
public class Pila {
    private Lista elementos;

    public Pila() {
        elementos = new Lista();
    }
    public void apilar(Integer e) {
        elementos.addFin(e);
    }
    public Integer desapilar() {
        return elementos.eliminarEnLista(elementos.numElementos() - 1);
    }

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.apilar(3);
        pila.apilar(2);
        pila.apilar(1);

        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
        System.out.println(pila.desapilar());
    }
}