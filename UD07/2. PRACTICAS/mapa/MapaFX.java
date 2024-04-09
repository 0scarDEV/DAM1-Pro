package mapa;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MapaFX extends Mapa {
    public MapaFX(int filas, int columnas) {
        super(filas, columnas);
    }
    public MapaFX(int[][] mapa) {
        super(mapa);
    }
    static GridPane generarPanel(MapaFX mapa) {
        // Crear GridPane
        GridPane panel = new GridPane();

        // Llenar el GridPane con celdas vacías
        for (int i = 0; i < mapa.getFilas(); i++) {
            for (int j = 0; j < mapa.getColumnas(); j++) {
                Rectangle rect = new Rectangle(50, 50); // Tamaño de cada celda
                rect.setFill(Color.WHITE); // Color inicial de cada celda
                rect.setStroke(Color.BLACK); // Borde de cada celda

                // Si la casilla tiene un cero, ponerla de blanco.
                if (mapa.getMapa()[i][j] == 0) {
                    rect.setFill(Color.WHITE);
                }
                // Si la casilla tiene un uno, ponerla de negro.
                if (mapa.getMapa()[i][j] == 1) {
                    rect.setFill(Color.BLACK);
                }
                // Si es la casilla de salida, ponerla de verde.
                if (mapa.coordEntrada != null && i == mapa.coordEntrada[0] && j == mapa.coordEntrada[1]) {
                    rect.setFill(Color.GREEN);
                }
                // Si es la casilla de destino, ponerla de amarillo.
                if (mapa.coordSalida != null && i == mapa.coordSalida[0] && j == mapa.coordSalida[1]) {
                    rect.setFill(Color.YELLOW);
                }

                panel.add(rect, j, i);
            }
        }
        return panel;
    }
}
