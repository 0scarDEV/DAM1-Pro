package clasesparaninfo;
/* Óscar Fernández Pastoriza
 * EP0712. Implementa una clase que permita resolver ecuaciones de segundo grado. Los coeficientes pueden indicarse en el constructor y modificarse a posteriori. Es fundamental que la clase disponga de un método que devuelva las distintas soluciones y de un método que nos informe si el discriminante es positivo.
 */
public class EP0712 {
    double a, b, c;
    private boolean esDiscriminantePositivo;
    double solucion1, solucion2;
    
    public EP0712(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void verSoluciones() {
        this.solucion1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        this.solucion2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println(solucion1 + " " + solucion2);
    }

    public boolean discriminantePositivo() {
        if ((Math.pow(b, 2) - 4 * a * c) > 0) {
            esDiscriminantePositivo = true;
        } else {
            esDiscriminantePositivo = false;
        }
        return esDiscriminantePositivo;
    }
    
    
    public class Solucion {public Solucion(double solucion1, double solucion2) {}}
    public static void main(String[] args) {
        EP0712 raizcuadrada = new EP0712(6, 10, -1);
        System.out.println(raizcuadrada.discriminantePositivo());
    }
}