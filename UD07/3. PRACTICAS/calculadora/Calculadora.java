package calculadora;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class Calculadora extends Application {
    String operador1 = "", operador2 = "";
    Double valorRes;
    Label lblResultado = new Label("Resultado: ");
    Character operacion = null;

    EventHandler<ActionEvent> asignarValor = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Button boton = (Button) event.getSource();
            if (operacion == null) {
                operador1 += boton.getText();
            } else {
                operador2 += boton.getText();
            }
        }
    };
    EventHandler<ActionEvent> asginarOperacion = event -> {
        Button boton = (Button) event.getSource();
        switch (boton.getText()) {
            case "+" -> operacion = '+';
            case "-" -> operacion = '-';
            case "*" -> operacion = '*';
            case "/" -> operacion = '/';
        }
    };
    EventHandler<ActionEvent> operar = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Double op1 = Double.parseDouble(operador1);
            Double op2 = Double.parseDouble(operador2);
            switch (operacion) {
                case '+' -> valorRes = op1 + op2;
                case '-' -> valorRes = op1 - op2;
                case '*' -> valorRes = op1 * op2;
                case '/' -> valorRes = op1 / op2;
            }
            lblResultado.setText("Resultado: " + valorRes);

            try (BufferedWriter out = new BufferedWriter(new FileWriter("log.txt",true))) {
                out.write(operador1 + " " + operacion + " " + operador2 + " = " + valorRes);
                out.newLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            operador1 = String.valueOf(valorRes);
            operador2 = "";
            operacion = null;
        }
    };
    EventHandler<ActionEvent> decimar = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Button boton = (Button) event.getSource();
            if (operacion == null && !operador1.endsWith(".")) {
                operador1 += boton.getText();
            } else if (!operador2.endsWith(".")) {
                operador2 += boton.getText();
            }
        }
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btnSiete = new Button("7");
        btnSiete.setOnAction(asignarValor);
        btnSiete.setMinSize(100, 50);
        Button btnOcho = new Button("8");
        btnOcho.setOnAction(asignarValor);
        btnOcho.setMinSize(100, 50);
        Button btnNueve = new Button("9");
        btnNueve.setOnAction(asignarValor);
        btnNueve.setMinSize(100, 50);
        Button btnMulti = new Button("*");
        btnMulti.setMinSize(100, 50);
        btnMulti.setOnAction(asginarOperacion);
        HBox fila1 = new HBox(btnSiete, btnOcho, btnNueve, btnMulti);

        Button btnCuatro = new Button("4");
        btnCuatro.setOnAction(asignarValor);
        btnCuatro.setMinSize(100, 50);
        Button btnCinco = new Button("5");
        btnCinco.setOnAction(asignarValor);
        btnCinco.setMinSize(100, 50);
        Button btnSeis = new Button("6");
        btnSeis.setOnAction(asignarValor);
        btnSeis.setMinSize(100, 50);
        Button btnSumar = new Button("+");
        btnSumar.setOnAction(asginarOperacion);
        btnSumar.setMinSize(100, 50);
        HBox fila2 = new HBox(btnCuatro, btnCinco, btnSeis, btnSumar);

        Button btnUno = new Button("1");
        btnUno.setOnAction(asignarValor);
        btnUno.setMinSize(100, 50);
        Button btnDos = new Button("2");
        btnDos.setOnAction(asignarValor);
        btnDos.setMinSize(100, 50);
        Button btnTres = new Button("3");
        btnTres.setOnAction(asignarValor);
        btnTres.setMinSize(100, 50);
        Button btnRestar = new Button("-");
        btnRestar.setOnAction(asginarOperacion);
        btnRestar.setMinSize(100, 50);
        HBox fila3 = new HBox(btnUno, btnDos, btnTres, btnRestar);


        Button btnDiv = new Button("/");
        btnDiv.setOnAction(asginarOperacion);
        btnDiv.setMinSize(100, 50);
        Button btnCero = new Button("0");
        btnCero.setOnAction(asignarValor);
        btnCero.setMinSize(100, 50);
        Button btnPunto = new Button(".");
        btnPunto.setOnAction(decimar);
        btnPunto.setMinSize(100, 50);
        Button btnIgual = new Button("=");
        btnIgual.setOnAction(operar);
        btnIgual.setMinSize(100, 50);
        HBox fila4 = new HBox(btnDiv, btnCero, btnPunto, btnIgual);

        VBox vBox = new VBox(fila1, fila2, fila3, fila4, lblResultado);

        primaryStage.setScene(new Scene(vBox));
        primaryStage.show();
    }
}
