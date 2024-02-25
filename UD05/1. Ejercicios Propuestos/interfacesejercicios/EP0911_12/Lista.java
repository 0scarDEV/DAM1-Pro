package interfacesejercicios.EP0911_12;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class Lista implements Cola, Pila {
    /* EP0911. Implementar la clase Lista para almacenar elementos de tipo String. */
    private String[] elementos;
    public Lista() {
        elementos = new String[0];
    }
    public int length(){
        return elementos.length;
    }
    public void addInicio(String e){
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        for(int i = elementos.length - 1; i > 0; i--){
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = e;
    }
    public void addFinal(String e){
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
    }
    public void addPosicion(String e, int pos){
        if (pos >= 0 && pos <= elementos.length) {
            // Amplío el array
            elementos = Arrays.copyOf(elementos, elementos.length + 1);

            // Hago hueco al nuevo elemento
            for(int i = elementos.length - 1; i > pos; i--){
                elementos[i] = elementos[i - 1];
            }
            // Inserto el nuevo elemento
            elementos[pos] = e;
        }
    }
    public void mostrar(){
        System.out.println(Arrays.toString(elementos));
    }
    public void addLista(Lista lista){
        elementos = Arrays.copyOf(elementos, elementos.length + lista.length());
        for (int i = 0; i < lista.length(); i++){
            elementos[elementos.length - lista.length() + i] = lista.elementos[i];
        }
    }
    public String delPosicion(int pos){
        String e = elementos[pos];
        for(int i = pos; i < elementos.length - 1; i++){
            elementos[i] = elementos[i+1];
        }
        elementos = Arrays.copyOf(elementos, elementos.length - 1);
        return e;
    }
    public String getPosicion(int pos){
        return elementos[pos];
    }
    public int buscar(String e){
        int i = 0;
        boolean encontrado = false;

        while (i < elementos.length && !encontrado){
            if (elementos[i] == e) {
                encontrado = true;
            }
            i++;
        }

        if (encontrado) {
            return i - 1;
        } else {
            return - 1;
        }
    }
    public static Lista concatena(Lista l1, Lista l2) {
        Lista l3 = new Lista();

        l3.addLista(l1);
        l3.addLista(l2);

        return l3;
    }

    /* EP0912. Definir las interfaces Cola y Pila para objetos String e implementarlos en la clase Lista definida en la Actividad de aplicación EP0911. */
    // IMPLEMENTACIÓN DE LA INTERFAZ COLA
    public void encolar(String e){
        addFinal(e);
    }
    public String desencolar(){
        return delPosicion(0);
    }
    // IMPLEMENTACIÓN DE LA INTERFAZ PILA
    public void apilar(String e){
        addFinal(e);
    }
    public String desapilar(){
        return delPosicion(length() - 1);
    }
}