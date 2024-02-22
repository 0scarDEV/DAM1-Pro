package herenciaejercicios.EP0813;
/* Óscar Fernández Pastoriza
* EP0813. La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir el peso que transportan sus empleados solo utiliza cajas de cartón. El volumen de éstas se calcula como el 80% del volumen real, con el fin de evitar que se deformen y se rompan. Otra característica de las cajas de cartón es que sus medidas siempre están en centímetros. Por último, la empresa, para controlar costes, necesita saber cuál es la superficie total de cartón utilizado para construir todas las cajas.
* Escribe la clase CajaCarton heredando de la clase Caja. */
public class CajaCarton extends herenciaejercicios.EP0812.Caja {
    public CajaCarton(int ancho, int alto, int fondo) {
        super(ancho, alto, fondo, Unidad.cm);
    }
    @Override
    public double getVolumen() {
        double cubicos;

        cubicos = (this.ancho / 100.0) * (this.alto / 100.0) * (this.fondo / 100.0);

        return cubicos;
    }
}