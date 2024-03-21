package javafxapuntes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX04 extends Application {
    /* Actividad 4. Crear una ventana con un campo de texto y un botón que, al hacer clic, cambie el color de fondo de la ventana (o de una etiqueta) al color especificado en el campo de texto. */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Actividad 4");

        TextField txtColor = new TextField();
        Button btnCambioColor = new Button("Cambia el color!");
        Label lbl = new Label("                   ");
        btnCambioColor.setOnAction(event -> {
            lbl.setStyle("-fx-background-color: \"" + txtColor.getText() + "\";");
        });

        VBox vBox = new VBox(txtColor, btnCambioColor, lbl);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
