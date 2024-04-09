package javafxapuntes;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/* Óscar Fernández Pastoriza */
public class JavaFX09 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        ImageView image1 = new ImageView();
        ImageView image2 = new ImageView();

        HBox hbox = new HBox(image1, image2);

        Scene scene = new Scene(hbox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
