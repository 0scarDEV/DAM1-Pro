package stringsparaninfo;
import java.util.Scanner;
/* Óscar Fernández Pastoriza
EP0615. Escribe un programa que lea por teclado el título y el contenido de una página web. La aplicación generará por consola un documento HTML donde el título será un encabezado de primer nivel (<h1>) y el resto del contenido será un párrafo (<p>).
 */
public class EP0615 {
    public static void main(String[] args) {
        System.out.print("Introduce el encabezado deseado: ");
        String encabezado = new Scanner(System.in).nextLine();

        System.out.print("Introduce el contenido deseado: ");
        String contenido = new Scanner(System.in).nextLine();

        System.out.println(generarDocumentoHTML(encabezado, contenido));
    }
    private static String generarDocumentoHTML(String titulo, String contenido) {
        // Utilizando formato de cadena para construir el documento HTML
        String documentoHTML = String.format("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "    <h1>%s</h1>\n" +
                "    <p>%s</p>\n" +
                "</body>\n" +
                "</html>", titulo, contenido);

        return documentoHTML;
    }
}
