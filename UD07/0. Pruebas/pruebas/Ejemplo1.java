package pruebas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class Ejemplo1 extends Application{
        @Override public void start(Stage primaryStage) throws Exception {
            // En la ventana le asignamos el título
            primaryStage.setTitle("Título");
            // Creamos un bot�n con el texto "Púlsame"
            Button btn1 = new Button("Púlsame");
            // Si queremos que al pulsar pase algo:
            btn1.setOnMouseClicked(null);
            // Creamos una escena que contiene el botón creado.
            Scene scene = new Scene(btn1);
            // A�adimos la escena a la ventana de usuario.
            primaryStage.setScene(scene);
            // Mostramos la ventana con lo anterior.
            primaryStage.show();
        }
        public static void main(String[] args) {
            launch(args);
        }
}