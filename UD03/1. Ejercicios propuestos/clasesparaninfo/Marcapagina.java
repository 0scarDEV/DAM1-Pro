package clasesparaninfo;
/* Óscar Fernández Pastoriza
 * EP0711. Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un libro. Deberá disponer de métodos para incrementar la página leída, para obtener información de la última página que se ha leído y para comenzar desde el principio una nueva lectura del mismo libro.
 */
public class Marcapagina {
    int pagina = 1;

    public void incrementarPag() {
        pagina = pagina + 1;
    }
    public void incrementarPag(int incremento) {
        pagina = pagina + incremento;
    }
    public int infoLastPage(){
        int lastPage = pagina;
        return lastPage;
    }
    public void newLectura() {
        this.pagina = 1;
    }

    public static void main(String[] args) {
        Marcapagina mp1 = new Marcapagina();
        System.out.println("Al crear el marcapáginas señala la página " + mp1.pagina);
        
        System.out.println("Ahora incrementamos la página una vez.");
        mp1.incrementarPag();
        System.out.println("Ahora el marcapáginas señala la página " + mp1.pagina);
        
        System.out.println("Ahora incrementamos la página 6 veces.");
        mp1.incrementarPag(6);
        System.out.println("Ahora el marcapáginas señala la página " + mp1.pagina);

        System.out.println("La última página leída es la " + mp1.infoLastPage());

        System.out.println("Ahora releeremos el libro.");
        mp1.newLectura();
        System.out.println("Ahora el marcapáginas señala la página " + mp1.pagina);
    }
}