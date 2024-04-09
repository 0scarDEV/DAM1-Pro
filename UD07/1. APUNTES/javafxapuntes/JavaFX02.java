package javafxapuntes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/* Óscar Fernández Pastoriza */
public class JavaFX02 extends Application {
    /* Actividad 2. Crear una ventana con un campo de texto (TextField) y un botón que, al hacer clic imprima el texto por consola.
    Amplía para que imprima el texto en una etiqueta (Label) en la pantalla. */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Actividad 2");

        TextField txtText = new TextField("Escribe algo...");
        Label lblLabel = new Label(txtText.getText());
        Button btnBoton = new Button("Imprimir");
        btnBoton.setOnAction(event -> lblLabel.setText(txtText.getText()));
        VBox vbox = new VBox(txtText, btnBoton, lblLabel);

        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}