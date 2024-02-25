package interfacesejercicios.EP0936;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class Main {
    static double[] funcionTabla(double[] t, Funcion f) {
        double[] res = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            res[i] = f.aplicar(t[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        double[] t = {4, 16, 25, 36, 49, 64};
        Funcion f = new Funcion() {
            @Override public double aplicar(double n) {
                return Math.sqrt(n);
            }
        };

        System.out.println(Arrays.toString(funcionTabla(t, f)));
    }
}
