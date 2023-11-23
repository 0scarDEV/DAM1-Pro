package ejerciciosmath;
import java.math.BigDecimal;
// Óscar Fernández Pastoriza
public class Precision {
    public static void main(String[] args) {
        double unCentimo = 0.01;
        double suma = unCentimo + unCentimo + unCentimo + unCentimo + unCentimo + unCentimo;
        System.out.println("Cálculo con tipos primitivos: " + suma);

        BigDecimal centimo = new BigDecimal("0.01");
        BigDecimal sumaPrecisa = centimo.add(centimo).add(centimo).add(centimo).add(centimo).add(centimo);

        System.out.println("Cálculo preciso: " + sumaPrecisa);
    }
}