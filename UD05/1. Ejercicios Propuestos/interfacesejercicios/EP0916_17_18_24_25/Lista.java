package interfacesejercicios.EP0916_17_18_24_25;
import java.util.Arrays;
import java.util.Comparator;

/* Óscar Fernández Pastoriza */
public class Lista implements Cola, Pila {
    /* EP0917. Escribir un programa donde se use una lista para elementos Object para encolar y desencolar objetos de distintos tipos, mostrándolos por pantalla. */
    private Object[] elementos;
    public Lista() {
        elementos = new Object[0];
    }
    public int length(){
        return elementos.length;
    }
    public void addInicio(Object e){
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        for(int i = elementos.length - 1; i > 0; i--){
            elementos[i] = elementos[i - 1];
        }
        elementos[0] = e;
    }
    public void addFinal(Object e){
        elementos = Arrays.copyOf(elementos, elementos.length + 1);
        elementos[elementos.length - 1] = e;
    }
    public void addPosicion(Object e, int pos){
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
    public Object delPosicion(int pos){
        Object e = elementos[pos];
        for(int i = pos; i < elementos.length - 1; i++){
            elementos[i] = elementos[i+1];
        }
        elementos = Arrays.copyOf(elementos, elementos.length - 1);
        return e;
    }
    public Object getPosicion(int pos){
        return elementos[pos];
    }
    public int buscar(Object e){
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
    public void encolar(Object e){
        addFinal(e);
    }
    public Object desencolar(){
        return delPosicion(0);
    }
    // IMPLEMENTACIÓN DE LA INTERFAZ PILA
    public void apilar(Object e){
        addFinal(e);
    }
    public Object desapilar(){
        return delPosicion(length() - 1);
    }
    /* EP0924. Implementar en la clase Lista para elementos Object las funciones sobrecargadas: */
    /* void ordenar(), que ordena la lista con el orden natural de sus elementos. */
    public void ordenar() {
        Arrays.sort(elementos);
    }
    /* void ordenar(Comparator c), que la ordena con el criterio que establezca c. Aquí tendremos que ser muy cuidadosos con que todos los elementos insertados sean del mismo tipo. */
    public void ordenar(Comparator c) {
        Arrays.sort(elementos, c);
    }

    public static void main(String[] args) {
        /* EP0925. Usar la Lista de la Actividad de aplicación EP0924 para insertar cadenas de caracteres y ordenarlos por orden alfabético. */
        Lista l1 = new Lista();
        String cad11 = "AAAAAAAAAAAAAAA";
        String cad12 = "BBBBBBBBBBB";
        String cad13 = "CCCCCCCCC";
        String cad14 = "DDDDDDD";

        l1.addInicio(cad14);
        l1.addInicio(cad12);
        l1.addInicio(cad13);
        l1.addInicio(cad11);

        l1.ordenar(new ComparadorNombre());
    }
}