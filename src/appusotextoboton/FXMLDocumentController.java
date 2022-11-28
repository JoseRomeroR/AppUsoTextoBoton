/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotextoboton;

import Componentes.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Kyle7
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private CampoTextoBoton CampoArriba;
    @FXML
    private CampoTextoBoton CampoAbajo;
    @FXML
    private Label LabelTexto;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        CampoArriba.setText("Grabar");
       
         
        
        
    }    



    @FXML
    private void GrabarArriba(MouseEvent event) {
           LabelTexto.setText("Se ha grabado " + CampoArriba.getText());
    }

    @FXML
    private void GrabarAbajo(MouseEvent event) {
             LabelTexto.setText("Se ha grabado " + CampoAbajo.getText());
    }
    
}
