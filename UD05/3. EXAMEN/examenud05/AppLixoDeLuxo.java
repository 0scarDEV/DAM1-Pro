package examenud05;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class AppLixoDeLuxo {
    static User username = null;
    static Objeto[] objetos = new Objeto[0];
    private static void mostrarMenu() {
        System.out.println("LIXO DE LUXO");
        System.out.println("============");
        System.out.println();
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println(" 1. Iniciar sesión de usuario");
        System.out.println("2. Publicar objeto encontrado");
        System.out.println("2. Publicar objeto encontrado");
        System.out.println("3. Listar objetos publicados anónimamente");
        System.out.println("4. Recoger objeto");
        System.out.println("0. SALIR");
        System.out.println();
        System.out.println("Seleccione una opción:");
    }
    private static void mostrarMenuLog() {
        System.out.println("=== MENÚ DE USUARIO ("+username+") ===");
        System.out.println();
        System.out.println("1. Publicar objeto encontrado");
        System.out.println("2. Listar objetos publicados");
        System.out.println("3. Recoger objeto");
        System.out.println("0. SALIR");
        System.out.println();
        System.out.println("Seleccione una opción:");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 0) {
            if (username == null) {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Usuario: ");
                        String usuario = sc.nextLine();
                        System.out.print("Password: ");
                        String contrasenha = sc.nextLine();
                        User user = User.loginUsuario(usuario, contrasenha);
                        if (user != null) {
                            username = user;
                        } else {
                            System.out.println("ERROR");
                        }
                    }
                    case 2 -> {
                        publicarObjeto();
                    }
                    case 3 -> {
                        listarObjetosAnon();
                    }
                    case 4 -> {
                        recogerObjeto();
                    }
                    default -> {
                        System.out.println("Orden incorrecta. Inténtelo de nuevo.");
                    }
                }
                mostrarMenu();
            } else {
                switch (opcion) {
                    case 1 -> {
                        publicarObjeto();
                    }
                    case 2 -> {
                        Objeto.mostrarObjetos(objetos);
                    }
                    case 3 -> {
                        recogerObjeto();
                    }
                    default -> {
                        System.out.println("Orden incorrecta. Inténtelo de nuevo.");
                    }
                }
                mostrarMenuLog();
            }
            opcion = sc.nextInt();
        }
        System.out.println("¡Hasta pronto!");
    }
    private static void recogerObjeto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el objeto a retirar");
        int index = sc.nextInt();
        objetos[index].recogido = true;
        objetos[index].usuarioRecogida = username;
        objetos[index].fechaHoraRecogida = LocalDateTime.now();
    }
    private static void listarObjetosAnon() {
        objetos = Objeto.sortFechaPublicacion(objetos);
        int[] index = new int[0];
        for (int i = 0; i < objetos.length; i++) {
            System.out.println("N. Nombre\t\t" + "Fecha Publicación");
            System.out.println("---------\t\t" + "------\t" + "-------\t" + "-----------------");
            int j = 0;
            if (objetos[i].usuarioPublicacion == null) {
                System.out.println((j + 1) + ". " + objetos[i]);
                index = Arrays.copyOf(index, index.length + 1);
                index[index.length - 1] = i;
            }
        }
    }
    private static void publicarObjeto() {
        Scanner sc = new Scanner(System.in);
        User usuarioP = null;
        if (username != null) {
            usuarioP = username;
        }
        objetos = Arrays.copyOf(objetos, objetos.length + 1);
        System.out.println("Introduce el objeto: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la descripcion: ");
        String descripcion = sc.nextLine();
        System.out.println("Introduce la ubicación: ");
        String ubicacion = sc.nextLine();
        Objeto ob = new Objeto(nombre, descripcion, ubicacion, usuarioP, LocalDateTime.now(), null, null, false);
    }
}