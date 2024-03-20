package javafxapuntes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Actividad3 extends Application {
    /* Actividad 3. Crear una ventana con dos campos de texto y un botón que, al hacer clic, muestre la suma de los números ingresados en un tercer campo de texto o en una etiqueta. */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Actividad 3");

        TextField txtOperando1 = new TextField("0");
        TextField txtOperando2 = new TextField("0");

        Button btnSuma = new Button("Sumar");
        Label lbl = new Label();

        btnSuma.setOnAction(event -> {
                try {
                    Double num1 = Double.valueOf(txtOperando1.getText());
                    Double num2 = Double.valueOf(txtOperando2.getText());
                    lbl.setText(String.valueOf(num1 + num2));
                } catch (Exception e) {
                    lbl.setText("Valores introducidos no válidos, inténtalo de nuevo.");
                }
            }
        );

        VBox vBox = new VBox(txtOperando1, txtOperando2, btnSuma, lbl);
        Scene scene = new Scene(vBox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
