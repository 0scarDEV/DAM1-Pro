package examenud05;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;
/* Óscar Fernández Pastoriza */
public class AppLixoDeLuxo {
    static User username = null;
    static ComparadorFechaPublicacion cPubliDesc = (ComparadorFechaPublicacion) new ComparadorFechaPublicacion().reversed();
    static Objeto[] objetos = {
            new ObjetoElectronico("Laptop", "Laptop en buen estado", "Calle Principal",
                    new User("aguado"), LocalDateTime.of(2024, 2, 20, 10, 0), new User("igarcrodr"),
                    LocalDateTime.of(2024, 2, 20, 13, 0), true, "Dell", "Inspiron"),
            new ObjetoElectronico("Teléfono móvil", "Teléfono en buen estado", "Parque Central",
                    null, LocalDateTime.of(2024, 2, 10, 20, 0), null, null, false, "Samsung", "Galaxy S20"),
            new Ropa("Camisa", "Camisa de algodón", "Avenida Central",
                    new User("aguado"), LocalDateTime.of(2024, 3, 3, 12, 0), null, null, false, "M"),
            new Ropa("Pantalones", "Pantalones vaqueros", "Plaza Mayor",
                    null, LocalDateTime.of(2024, 2, 21, 10, 0), null, LocalDateTime.of(2024, 2, 21, 12, 0), true, "32"),
            new Mueble("Silla", "Silla de madera", "Biblioteca Pública",
                    null, LocalDateTime.of(2024, 2, 28, 10, 0), null, null, false, "Madera", 80, 40, 40, 8),
            new Mueble("Mesa", "Mesa de centro", "Parque",
                    null, LocalDateTime.of(2024, 1, 31, 10, 0), null, null, false, "Madera", 100, 60, 60, 15),
            new Libro("Harry Potter", "Libro de fantasía", "Casa Abandonada",
                    null, LocalDateTime.of(2024, 2, 20, 10, 0), new User("aguado"),
                    LocalDateTime.of(2024, 2, 20, 12, 0), true, "Harry Potter", "J.K. Rowling"),
            new Libro("El Señor de los Anillos", "Libro de fantasía épica", "Callejón Oscuro",
                    new User("aguado"), LocalDateTime.of(2024, 3, 5, 10, 0), null, null, false,
                    "El Señor de los Anillos", "J.R.R. Tolkien")
    };
    private static void mostrarMenu() {
        System.out.println("LIXO DE LUXO");
        System.out.println("============");
        System.out.println();
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Iniciar sesión de usuario");
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
        Scanner sc2 = new Scanner(System.in);
        mostrarMenu();
        int opcion = sc.nextInt();
        while (opcion != 0) {
            if (username == null) {
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Usuario: ");
                        String usuario = sc2.nextLine();
                        System.out.print("Password: ");
                        String contrasenha = sc2.nextLine();
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
                        recogerObjetoAnon();
                    }
                    default -> {
                        System.out.println("Orden incorrecta. Inténtelo de nuevo.");
                    }
                }
                if (username == null) {
                    mostrarMenu();
                } else {
                    mostrarMenuLog();
                }
            } else {
                switch (opcion) {
                    case 1 -> {
                        publicarObjeto();
                    }
                    case 2 -> {
                        listarObjetos();
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
    private static void listarObjetos() {
        CompUsuario cUsuario = new CompUsuario();
        Arrays.sort(objetos, cUsuario.thenComparing(cPubliDesc));
        System.out.println("N. Nombre\t\t" + "Fecha Publicación");
        System.out.println("---------\t\t" + "------\t" + "-------\t" + "-----------------");
        int j = 0;
        for (Objeto objeto : objetos) {
            if (!objeto.recogido) {
                System.out.println((j) + ". " + objeto.nombre
                        + " \t" + objeto.fechaHoraPublicacion);
                j++;
            }
        }
    }
    private static void recogerObjeto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el objeto a retirar");
        int index = sc.nextInt();

        int j = 0;
        for (Objeto objeto : objetos) {
            if (!objeto.recogido) {
                if (j == index) {
                    objetos[index].recogido = true;
                    objetos[index].usuarioRecogida = username;
                    objetos[index].fechaHoraRecogida = LocalDateTime.now();
                }
                j++;
            }
        }
    }
    private static void recogerObjetoAnon() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el objeto a retirar");
        int index = sc.nextInt();

        int j = 0;
        for (Objeto objeto : objetos) {
            if (objeto.usuarioPublicacion == null && !objeto.recogido) {
                if (j == index) {
                    objetos[index].recogido = true;
                    objetos[index].usuarioRecogida = username;
                    objetos[index].fechaHoraRecogida = LocalDateTime.now();
                }
                j++;
            }
        }
    }
    private static void listarObjetosAnon() {
        Arrays.sort(objetos, cPubliDesc);
        System.out.println("N. Nombre\t\t" + "Fecha Publicación");
        System.out.println("---------\t\t" + "------\t" + "-------\t" + "-----------------");
        int j = 0;
        for (Objeto objeto : objetos) {
            if (objeto.usuarioPublicacion == null && !objeto.recogido) {
                System.out.println((j) + ". " + objeto.nombre
                        + " \t" + objeto.fechaHoraPublicacion);
                j++;
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
        objetos[objetos.length - 1] = new Objeto(nombre, descripcion, ubicacion, usuarioP, LocalDateTime.now(), null, null, false);
    }
}