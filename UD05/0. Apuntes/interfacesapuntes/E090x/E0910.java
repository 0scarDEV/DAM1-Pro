package interfacesapuntes.E090x;
import java.util.Arrays;
import java.util.Comparator;
public class E0910 {
    public static void main(String[] args) {
        final int MAX_SIZE = 20;
        Integer[] numeros = new Integer[MAX_SIZE];
        for (int i = 0; i < MAX_SIZE; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        Comparator ordenDescendente = new Comparator() {
            @Override public int compare(Object o1, Object o2) {
                return (Integer) o2 - (Integer) o1;
            }
        };
        Arrays.sort(numeros, ordenDescendente);
        System.out.println(Arrays.toString(numeros));
    }
}