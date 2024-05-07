package proyectoviajecompartido.modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class AppViaje extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(AppViaje.class.getResource("Configuracion.fxml")))));
        primaryStage.show();
    }
}
