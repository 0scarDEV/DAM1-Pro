package mapaV02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.time.Duration;
import java.time.LocalTime;

public class AppLaberintoV02 extends Application {
    MapaFX mapa;
    PersonajeFX personaje;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("AppLaberinto");

        String[] mapaStr1 = {
                "XXXXXXXXXXXXXX",
                "S          X X",
                "XX XXXXXXX X X",
                "X          X X",
                "X  X XXXXXXX X",
                "X  X         X",
                "XXXXXXXXXXXX F"
        };

        String[] mapaStr2 = {
            "XXXXXXXXXXXXXXXXXXXXXXX",
            "S X       X X   X     X",
            "X X XXX X X   X X X X X",
            "X X   X X X X X X X X X",
            "X XXX X X X X X X X X X",
            "X X   X X X X X X X X X",
            "X X XXX X X X X X X X X",
            "X X     X X X X X X X X",
            "X XXXXX X   X X   X X X",
            "X       X X X X X X X X",
            "X XXXXX X X X X X X X X",
            "X X     X X X X X X X X",
            "X X XXX X X X X X X X X",
            "X X   X X X X X X X X X",
            "X XXX X X X X X X X X F" };
        
        String[] mapaStr = {
                "XXXXXXXXXXXXXXXXXXXXXXXXX",
                "S           X     X     X",
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

        mapa = new MapaFX(mapaStr);
        personaje = new PersonajeFX(mapa.getFilInicio(), mapa.getColInicio());
        personaje.setImagen(new Image("mapaV02/img/personaje.png"));
        mapa.dibujarPersonaje(personaje);

        LocalTime inicio = LocalTime.now();
        mapa.generarComida();

        Scene scene = new Scene(mapa.gridPane);

        scene.setOnKeyPressed(e -> mapa.moverPersonaje(personaje, e.getCode(), inicio));

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}