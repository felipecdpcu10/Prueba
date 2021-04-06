
package moleculator.v1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField atomo;
    @FXML
    private TextField enlaces;
    @FXML
    ////////////////
    private Label crearatomo;
    @FXML
    //////////
    private Button btncrear;
    @FXML
    private TextField resultado;
    
    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void acciondelboton(ActionEvent event) throws IOException {
        
        try{
            String nom_atomo= this.atomo.getText();
            int nro_enlaces =Integer.parseInt(this.enlaces.getText());
        
            this.resultado.setText(nom_atomo+" "+nro_enlaces);
        }catch (NumberFormatException e){
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText(null);
            alerta.setTitle("Error");
            alerta.setContentText("Formato incorrecto");
            alerta.showAndWait();
        }
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SegundaVentana.fxml"));
        Parent root = loader.load();
        SegundaVentanaController controlador = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
        
    }
    
}
