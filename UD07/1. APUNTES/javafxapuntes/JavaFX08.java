package javafxapuntes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
/* Óscar Fernández Pastoriza */
public class JavaFX08 extends Application {
    /* Actividad 8. Crear una ventana que muestre un tablero de ajedrez, es decir una cuadrícula de 8 x 8 “casillas” blancas y “negras” cuadradas. */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX08");
        GridPane tablero = new GridPane(8,8);
        for (int i = 0; i < tablero.getColumnCount(); i++) {
            for (int j = 0; j < tablero.getRowCount(); j++) {
                Rectangle rectangle = new Rectangle(50, 50);
                if ((i + j) % 2 == 0) {
                    rectangle.setFill(Color.WHITE);
                } else {
                    rectangle.setFill(Color.BLACK);
                }
                tablero.add(rectangle, j, i);
            }
        }

        Scene scene = new Scene(tablero, 50 * 8, 50 * 8);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}