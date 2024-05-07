package proyectoviajecompartido.modelo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AppViajeController {
    @FXML
    private Button btnCrearViaje;
    public Viaje crearViaje() {
        try {
            Viaje viaje = new Viaje(getConductor(), LocalDateTime.of(getDate(), getTime()), getPuntoOrigen(), getPuntoDestino(), getNumPlazas());
            System.out.println("Viaje creado");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText(viaje + "\n" + viaje.urlOpenStreetMaps());
            alert.showAndWait();
            return viaje;
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Revisa los datos del formulario");
            alert.showAndWait();
            return null;
        }
    }

    @FXML
    private DatePicker dateFecha;
    public LocalDate getDate() {
        return dateFecha.getValue();
    }

    @FXML
    private TextField txtConductor;
    public User getConductor() {
        System.out.println(User.loginUsuario(txtConductor.getText(),"oscarferpas_1") != null ? "Funciona" : "No funciona");
        return new User(txtConductor.getText());
    }

    @FXML
    private TextField txtUbiSalidaLon;
    @FXML
    private TextField txtUbiSalidaLat;
    public PuntoGeografico getPuntoOrigen() {
        return new PuntoGeografico("Salida",  Double.parseDouble(txtUbiSalidaLat.getText()), Double.parseDouble(txtUbiSalidaLon.getText()));
    }

    @FXML
    private TextField txtNumPlazas;
    public Integer getNumPlazas() {
        return Integer.parseInt(txtNumPlazas.getText());
    }

    @FXML
    private TextField txtHora;
    @FXML
    private TextField txtMinuto;
    public LocalTime getTime() {
        return LocalTime.of(Integer.parseInt(txtHora.getText()) , Integer.parseInt(txtMinuto.getText()));
    }

    @FXML
    private TextField txtUbiLlegadaLon;
    @FXML
    private TextField txtUbiLlegadaLat;
    public PuntoGeografico getPuntoDestino() {
        return new PuntoGeografico("Salida",  Double.parseDouble(txtUbiLlegadaLat.getText()), Double.parseDouble(txtUbiLlegadaLon.getText()));
    }
}
