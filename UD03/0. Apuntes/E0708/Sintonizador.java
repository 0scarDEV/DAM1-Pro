package E0708;

/* E0708. Definir la clase que permita controlar un sintonizador digital de emisoras FM. El controlador tendrá una interfaz que permitirá subir (up) o bajar(down) la frecuencia en (en saltos de 0,5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display). 
  * Supondremos que el rango de frecuencias oscila entre los 80 MHz y los 108 MHz y que, al inicio, el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por defecto.
  * Si durante una operación de subida o bajada se sobrepasa uno de los dos límites, la frecuencia sintonizada debe pasar a ser la del extremo contrario. 
  * Escribir un pequeño programa (o clase de pruebas) Para probar su funcionamiento.

  * Ampliar la clase:
    1. Para que permita guardar las frecuencias de hasta 3 emisoras y recuperarlas cuando se desee.
    2. Establece los atributos como privados y genera el setter y getter del atributo frecuencia. Ten en cuenta en el setter que la frecuencia no exceda los límites. Intenta no repetir código. 
    3. Añade dos métodos que permitan una sintonización más fina subiendo y bajando la frecuencia en intervalos de 0,1 MHz
    4. Prueba a generar una excepción cuando se intente establecer un valor de frecuencia no válido.
*/

public class Sintonizador {
    final static double FRECUENCIA_MAX = 108;
    final static double FRECUENCIA_MIN = 80;
    final static double FRECUENCIA_SALTO_DEFECTO = 0.5;
    final static double FRECUENCIA_SALTO_FINA = 0.1;
    private double frecuencia;
    private double mem1 = FRECUENCIA_MIN, mem2 = FRECUENCIA_MIN, mem3 = FRECUENCIA_MIN;

    public Sintonizador() {
        this(80);
    }
    
    public Sintonizador(double frecuencia) {
        try {
          setFrecuencia(frecuencia);  
        } catch (IllegalArgumentException e) {
            throw e;
        } 
    }

    public void up() {
        this.frecuencia += FRECUENCIA_SALTO_DEFECTO;
        if (frecuencia > FRECUENCIA_MAX) {
            this.frecuencia = FRECUENCIA_MIN;
        }
    }

    public void down() {
        this.frecuencia -= FRECUENCIA_SALTO_DEFECTO;
        if (frecuencia < FRECUENCIA_MIN) {
            this.frecuencia = FRECUENCIA_MAX;
        }
    }

    public void upFina() {
        this.frecuencia += FRECUENCIA_SALTO_FINA;
        if (frecuencia > FRECUENCIA_MAX) {
            this.frecuencia = FRECUENCIA_MIN;
        }
    }

    public void downFina() {
        this.frecuencia -= FRECUENCIA_SALTO_FINA;
        if (frecuencia < FRECUENCIA_MIN) {
            this.frecuencia = FRECUENCIA_MAX;
        }
    }
    
    public void display() {
        System.out.println("Frecuencia = " + frecuencia + " MHz.");
    }

    public void guardarMemoria(int mem) {
        switch (mem) {
            case 1 -> {
                mem1 = this.frecuencia;
            }
            case 2 -> {
                mem2 = this.frecuencia;
            }
            case 3 -> {
                mem3 = this.frecuencia;
            }
        }
    }
    
    public void cargarMemoria(int mem) {
        switch (mem) {
            case 1 -> {
                this.frecuencia = mem1;
            }
            case 2 -> {
                this.frecuencia = mem2;
            }
            case 3 -> {
                this.frecuencia = mem3;
            }
        }
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        if (frecuencia < FRECUENCIA_MIN) {
            throw new IllegalArgumentException("ERROR. FRECUENCIA DEMASIADO BAJA, DEBE SER MAYOR O IGUAL QUE 80");
            // this.frecuencia = FRECUENCIA_MIN;
        } else if (frecuencia > FRECUENCIA_MAX) {
            throw new IllegalArgumentException("ERROR. FRECUENCIA DEMASIADO ALTA, DEBE SER MENOR O IGUAL QUE 108");
            // this.frecuencia = FRECUENCIA_MAX;
        } else {
            this.frecuencia = frecuencia;
        }
    }

    public static void main(String[] args) {
        Sintonizador s1 = new Sintonizador();
        
        System.out.println("Frecuencia inicial: ");
        s1.display();

        System.out.println("Ahora guardaremos la frecuencia de S1 en el espacio de memoria 1: ");
        s1.guardarMemoria(1);

        System.out.println("Cambiamos la frecuencia de S1 a través del setter.");
        s1.setFrecuencia(90.5);
        s1.display();

        System.out.println("Tratamos de devolver la frecuencia.");
        s1.cargarMemoria(1);
        s1.display();

        try {
            Sintonizador s3 = new Sintonizador(50);
            s3.display();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}