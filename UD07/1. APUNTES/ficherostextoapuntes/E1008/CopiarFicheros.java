package ficherostextoapuntes.E1008;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
public class CopiarFicheros extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        String rutaInicial = "UD07/1. APUNTES/ficherostextoapuntes";

        // Crea y muestra una ventana FileChooser para elegir el fichero y obtiene un
        // String con la ruta completa.
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(rutaInicial));
        File fichero = fileChooser.showOpenDialog(primaryStage);
        String nombreFichero = fichero.getAbsolutePath();

        try (
            BufferedWriter out = new BufferedWriter(new FileWriter("UD07/1. APUNTES/ficherostextoapuntes/E1008/copia_de_" + fichero.getName()));
            BufferedReader in = new BufferedReader(new FileReader(nombreFichero));
        ){
            String linea = in.readLine();
            while (linea != null) {
                out.write(linea);
                out.newLine();

                linea = in.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            // Cierra la aplicación
            Platform.exit();
        }
    }
}
