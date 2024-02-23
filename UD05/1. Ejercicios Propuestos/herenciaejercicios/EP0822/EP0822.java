package herenciaejercicios.EP0822;
/* Óscar Fernández Pastoriza
* EP0822. La clase Object dispone del método finalize(), que se ejecuta justo antes de que el recolector de basura destruya un objeto. Escribe un programa que, mediante la creación masiva de objetos no referenciados y el overriding del método finalize(), compruebe el funcionamiento del recolector de basura. */
public class EP0822 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Recolectando objeto " + this);
        super.finalize();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            Object obj = new Object();
            obj = null; // Hacemos que el objeto sea no referenciado
        }
    }
}