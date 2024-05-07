package empresaCRUD;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AppController {
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;
    @FXML
    private TextField idTxt;
    @FXML
    private TextField nombreTxt;
    @FXML
    private TextField webTxt;
    @FXML
    private ListView<Empresa> lista;
    @FXML
    private MenuItem abrirArchivo;

    @FXML
    void abrirArchivo(ActionEvent event) {
        String rutaInicial = ".";

        /*
        // Crea y muestra una ventana FileChooser para elegir el fichero y obtiene un
        // String con la ruta completa.
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(rutaInicial));
        File fichero = fileChooser.showOpenDialog(primaryStage);
        String nombreFichero = fichero.getAbsolutePath();

        try (BufferedReader in = new BufferedReader(new FileReader(nombreFichero))){
            String linea = in.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

         */
    }
    @FXML
    void eliminarEmpresa(ActionEvent event) {
        Empresa empresa = new Empresa(Integer.parseInt(idTxt.getText()), nombreTxt.getText(), webTxt.getText());
        if (lista.getItems().contains(empresa)) {
            lista.getItems().remove(empresa);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "La empresa no existe.");
            alert.showAndWait();
        }
    }

    @FXML
    void modificarEmpresa(ActionEvent event) {
        Empresa empresa = new Empresa(Integer.parseInt(idTxt.getText()), nombreTxt.getText(), webTxt.getText());
        if (lista.getItems().contains(empresa)) {
            lista.getItems().set(lista.getItems().indexOf(empresa), empresa);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "No puedes modificar una empresa que no existe.");
            alert.showAndWait();
        }
    }

    @FXML
    void nuevaEmpresa(ActionEvent event) {
        Empresa empresa = new Empresa(Integer.parseInt(idTxt.getText()), nombreTxt.getText(), webTxt.getText());
        if (lista.getItems().contains(empresa)) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "El ID de empresa ya existe, prueba a modificar la empresa.");
            alert.showAndWait();
        } else {
            lista.getItems().add(empresa);
        }
    }
}
