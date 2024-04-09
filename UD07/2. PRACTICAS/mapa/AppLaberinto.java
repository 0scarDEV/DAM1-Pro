package mapa;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLaberinto extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        MapaFX mapa = new MapaFX(2, 3);
        mapa.setCoordEntrada(0, 0);
        mapa.setCoordSalida(1, 2);


        int[][] mapaaa = {
                {1, 0, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 1}
        };
        MapaFX mapa2 = new MapaFX(mapaaa);
        mapa2.setCoordEntrada(0, 0);
        mapa2.setCoordSalida(1, 2);


        Scene scene = new Scene(MapaFX.generarPanel(mapa2));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
