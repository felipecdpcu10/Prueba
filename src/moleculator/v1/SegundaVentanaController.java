/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moleculator.v1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author Diego
 */
public class SegundaVentanaController implements Initializable {

    @FXML
    private Label titulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /* CREACIÓN DE LA VENTANA Y DE LOS CONTENEDORES PRINCIPALES */
        
        // Contenedor principal donde se alojarán todos los elementos
        Group root = new Group();  
        // Creación de una zona de dibujo (canvas) de 200 x 150 puntos
        Canvas canvas = new Canvas(200, 150);
        // Obtención del contexto gráfico del canvas anterior que permitirá
        //  realizar posteriormente los dibujos
        GraphicsContext gc = canvas.getGraphicsContext2D();
        // Se añade el canvas al contenedor principal (root)
        root.getChildren().add(canvas);
        // Creación del área (scene) correspondiente al contenido que tendrá la 
        //  ventana, de 600 x 400 puntos, con color gris claro, indicando que el
        //  elemento root va a ser el contenedor principal de este espacio
        Scene scene = new Scene(root, 600, 400, Color.LIGHTGRAY);
        // Se asocia la ventana (scene) al parámetro primaryStage (escenario
        //  principal). El parámetro primaryStage se recibe en este método start
        Stage stage = new Stage();
        stage.setScene(scene);
        // Título que se aparecerá en la ventana
        stage.setTitle("Dibujando formas con JavaFX");
        // Orden para que se muestre la ventana        
        stage.show();

        /* DIBUJO DE LAS FORMAS */
        
        /* Se utiliza el objeto gc (GraphicsContext) que se ha obtenido
            anteriormente a partir del canvas de se ha creado */
        
        // Dibujo de un rectángulo vacío (strokeRect) que va a ocupar todo
        //  el espacio del canvas
      
        // Dibujar un círculo a partir de la posición (10,60) de ancho 30 y alto 30
        gc.fillOval(10, 60, 30, 30);
        // Dibujar un círculo sin relleno
        gc.strokeOval(60, 60, 30, 30);
        
    }    
    
}
