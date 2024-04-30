package mapaV03;

import java.io.*;
import java.time.LocalTime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AppLaberintoV03 extends Application {
    MapaFX mapa;
    PersonajeFX personaje;
    int platosRecogidos = 0;
    boolean[][] casillasConCarne;
    LocalTime horaInicio;
    LocalTime horaFin;
    VBox vBox;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AppLaberinto");
        cargarMapa(primaryStage);
        // Guarda la hora de inicio
        horaInicio = LocalTime.now();

        // Creamos el menú.
        Menu menuArchivo = new Menu("Archivo");
        MenuItem cargarMapa = new MenuItem("Cargar mapa");
        cargarMapa.setOnAction(e -> cargarMapa(primaryStage));
        MenuItem guardarPartida = new MenuItem("Guardar partida");
        guardarPartida.setOnAction(e -> guardarPartida(primaryStage));
        MenuItem cargarPartida = new MenuItem("Cargar partida");
        cargarPartida.setOnAction(e -> cargarPartida(primaryStage));
        menuArchivo.getItems().addAll(cargarMapa, guardarPartida, cargarPartida);

        Menu menuAyuda = new Menu("Ayuda");

        MenuBar menuBar = new MenuBar(menuArchivo, menuAyuda);

        // Creamos la barra de estado.
        Label estadoBarra = new Label("Puntuación: " + platosRecogidos);

        // Crea el vBox que contiene el menú y la barra de estado.
        vBox = new VBox(menuBar, mapa.gridPane, estadoBarra);
        // Crea la escena y sus eventos de teclado
        Scene scene = new Scene(vBox);

        personaje = new PersonajeFX(mapa.getFilInicio(), mapa.getColInicio());
        personaje.setImagen(new Image("mapaV03/img/personaje.png"));
        mapa.dibujarPersonaje(personaje);

        // Generar y dibujar en el mapa N platos de carne
        // Genera un mapa con un 10% de casillas con carne
        casillasConCarne = casillasConCarne(mapa, contarCasillasVacias(mapa) / 10);

        dibujarPlatosDeCarne(mapa, casillasConCarne);


        scene.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
            // Mueve el personaje en la dirección indicada por la tecla pulsada
            mapa.moverPersonaje(personaje, e.getCode());

            int f = personaje.filJugador;
            int c = personaje.colJugador;
            System.out.println("Personaje en: " + f + ", " + c);

            // Comprueba si el personaje está en una casilla con carne
            if (casillasConCarne[f][c]) {
                System.out.println("¡Has recogido un plato de carne en " + f + ", " + c);
                platosRecogidos++;
                casillasConCarne[f][c] = false;
                estadoBarra.setText("Puntuación: " + platosRecogidos);
            }

            // Comprueba si el personaje ha llegado al final del laberinto
            if (mapa.esFin(f, c)) {
                horaFin = LocalTime.now();
                long segundosTranscurridos = horaFin.toSecondOfDay() - horaInicio.toSecondOfDay();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("¡Has ganado!");
                alert.setHeaderText("¡Enhorabuena!");
                alert.setContentText("¡Has recogido " + platosRecogidos + " platos de carne! \n" + "Has tardado "
                        + segundosTranscurridos + " segundos en llegar al final.");

                alert.showAndWait();
                // Al cerrar la ventana, cerrar la aplicación
                primaryStage.close();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void cargarPartida(Stage primaryStage) {
        try (BufferedReader in = new BufferedReader(new FileReader("ultimaPartidaGuardada.txt"))){
            String linea = in.readLine();
            int i = 0;
            while (linea != null) {
                i++;
                linea = in.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private void guardarPartida(Stage primaryStage) {
        try (FileWriter out = new FileWriter("ultimaPartidaGuardada.txt")){
            out.write(mapa.numFil);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void cargarMapa(Stage primaryStage) {
        String[] mapaStr = {
                "XXXXXXXXXXXXXXXXXXXXXXXXX",
                "S                 X     X",
                "X XXXXXXXXX X X X X X X X",
                "X         X X X X X X X X",
                "X XXXXXXX X X X X X X X X",
                "X X       X X X X X X X X",
                "X X XXXXX X X X X   X X X",
                "X X X     X X X X X X X X",
                "X X X XXX X X X X X X X X",
                "X X X X   X X X X X X X X",
                "X X X XXXXX X X X X X X X",
                "X X X       X X X X X   X",
                "X X XXXXXXXXX X X X X X X",
                "X X           X X X X X X",
                "X XXXXXXXXXXX X X X X X X",
                "X             X X X X X X",
                "XXXXXXXXXXXXX X X X X X F" };

        if (mapa == null) {
            mapa = new MapaFX(mapaStr);
        } else {
            String rutaInicial = ".";

            // Crea y muestra una ventana FileChooser para elegir el fichero y obtiene un
            // String con la ruta completa.
            FileChooser fileChooser = new FileChooser();
            fileChooser.setInitialDirectory(new File(rutaInicial));
            File fichero = fileChooser.showOpenDialog(primaryStage);
            String nombreFichero = fichero.getAbsolutePath();

            try (BufferedReader in = new BufferedReader(new FileReader(nombreFichero))){
                String linea = in.readLine();
                int i = 0;
                while (linea != null) {
                    mapaStr[i] = linea;
                    i++;
                    linea = in.readLine();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            vBox.getChildren().remove(mapa.gridPane);
            mapa = new MapaFX(mapaStr);
            vBox.getChildren().add(1, mapa.gridPane);

            personaje.setColJugador(mapa.getColInicio());
            personaje.setFilJugador(mapa.getFilInicio());
            personaje.setImagen(new Image("mapaV03/img/personaje.png"));
            mapa.dibujarPersonaje(personaje);
            casillasConCarne = casillasConCarne(mapa,contarCasillasVacias(mapa) / 10);
            dibujarPlatosDeCarne(mapa, casillasConCarne);
        }
    }

    /**
     * Dibuja los platos de carne en el mapa.
     * TODO: Incorporar este método a la clase Mapa
     * 
     * @param mapa  Mapa
     * @param carne Matriz booleana con valores true en las casillas con plato de
     *              carne
     */
    private void dibujarPlatosDeCarne(MapaFX mapa, boolean[][] carne) {
        for (int i = 0; i < mapa.numFil; i++)
            for (int j = 0; j < mapa.numCol; j++)
                if (carne[i][j])
                    mapa.dibujarImagen(new Image("mapaV03/img/carne.jpg"), i, j);
    }

    /**
     * Comprueba si una casilla es vacía.
     * TODO: Incorporar este método a la clase Mapa
     * 
     * @param m Mapa
     * @param f Fila
     * @param c Columna
     * @return true si la casilla es vacía, false en caso contrario
     */
    static boolean esCasillaVacia(Mapa m, int f, int c) {
        return !m.esFin(f, c) && !m.esInicio(f, c) && !m.esMuro(f, c);
    }

    /**
     * Cuenta las casillas vacías de un mapa.
     * TODO: Incorporar este método a la clase Mapa??
     * 
     * @param m Mapa
     * @return Número de casillas vacías
     */
    static int contarCasillasVacias(Mapa m) {
        int contador = 0;
        for (int i = 0; i < m.numFil; i++)
            for (int j = 0; j < m.numCol; j++)
                if (esCasillaVacia(m, i, j))
                    contador++;
        return contador;

    }

    /**
     * Genera una matriz booleana con valores true donde aleatoriamente se han
     * distribuido numPlatos de carne.
     * TODO: Incorporar este método a la clase Mapa
     * 
     * @param m         Mapa
     * @param numPlatos Número de platos de carne
     * @return Matriz booleana con valores true en las casillas con plato de carne
     */
    static boolean[][] casillasConCarne(Mapa m, int numPlatos) {
        boolean[][] casillasConCarne = new boolean[m.numFil][m.numCol];
        while (numPlatos > 0) {
            int f = (int) (Math.random() * m.numFil);
            int c = (int) (Math.random() * m.numCol);
            if (esCasillaVacia(m, f, c) && !casillasConCarne[f][c]) {
                casillasConCarne[f][c] = true;
                numPlatos--;
            }
        }
        return casillasConCarne;
    }

}