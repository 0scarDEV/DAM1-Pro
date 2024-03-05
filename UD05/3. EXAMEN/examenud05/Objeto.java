package examenud05;
import java.time.LocalDateTime;
import java.util.Arrays;
/* Óscar Fernández Pastoriza */
public class Objeto implements Comparable {
    String nombre;
    String descripcion;
    String ubicacion;
    User usuarioPublicacion;
    LocalDateTime fechaHoraPublicacion;
    User usuarioRecogida;
    LocalDateTime fechaHoraRecogida;
    boolean recogido;

    public Objeto(String nombre, String descripcion, String ubicacion, User usuarioPublicacion, LocalDateTime fechaHoraPublicacion,
                  User usuarioRecogida,
                  LocalDateTime fechaHoraRecogida, boolean recogido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.usuarioPublicacion = usuarioPublicacion;
        this.fechaHoraPublicacion = fechaHoraPublicacion;
        this.usuarioRecogida = usuarioRecogida;
        this.fechaHoraRecogida = fechaHoraRecogida;
        this.recogido = recogido;
    }
    public static void mostrarObjetos(Objeto[] objetos) {
        System.out.println("N. Nombre\t\t" + "Recog.\t" + "Usuario\t" + "Fecha Publicación");
        System.out.println("---------\t\t" + "------\t" + "-------\t" + "-----------------");
        for (int i = 0; i < objetos.length; i++) {
            System.out.println((i+1) + ". " + objetos[i].nombre
                                    + " \t" + objetos[i].recogido
                                    + " \t" + objetos[i].usuarioPublicacion
                                    + " \t" + objetos[i].fechaHoraPublicacion);
        }
    }
    @Override
    public int compareTo(Object o) {
        Objeto ob = (Objeto) o;
        return this.nombre.compareTo(ob.nombre);
    }
    public static Objeto[] sortFechaPublicacion(Objeto[] objetos) {
        Objeto[] res = objetos;
        Arrays.sort(res, new ComparadorFechaPublicacion());
        return res;
    }
    public static Objeto[] sortFechaRecogida(Objeto[] objetos) {
        Objeto[] res = objetos;
        Arrays.sort(res, new ComparadorFechaRecogidaPublicacion());
        return res;
    }
    public static Objeto[] sortRecogidosUsuariosFecha(Objeto[] objetos) {
        Objeto[] res = objetos;
        Arrays.sort(res, new ComparadorRecogidosUsuariosFecha());
        return res;
    }
    public void mostrarDetalles() {
        System.out.println();
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Fecha y Hora de Publicación: " + fechaHoraPublicacion);
        if (usuarioPublicacion != null) {
            System.out.println("Usuario Publicación: " + usuarioPublicacion);
        }
        System.out.println("Recogido: " + (recogido ? "Si" : "No"));
        if (recogido) {
            System.out.println("Fecha y Hora de Recogida: " + fechaHoraRecogida);
        }
        if (usuarioRecogida != null) {
            System.out.println("Usuario Recogida: " + usuarioRecogida);
        }
        System.out.println();
    }

    @Override public String toString() {
        return nombre +
                ", descripcion='" + descripcion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", usuarioPublicacion=" + usuarioPublicacion +
                ", fechaHoraPublicacion=" + fechaHoraPublicacion +
                ", usuarioRecogida=" + usuarioRecogida +
                ", fechaHoraRecogida=" + fechaHoraRecogida +
                ", recogido=" + recogido +
                '}';
    }
}