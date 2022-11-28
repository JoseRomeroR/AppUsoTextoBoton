/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package appusotextoboton;

import Componentes.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

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

        CampoArriba.setOnAction((ActionEvent event) -> {

            LabelTexto.setText("Has grabado : " + CampoArriba.getText());

        });
        CampoAbajo.setOnAction((ActionEvent event) -> {

            LabelTexto.setText("Has grabado : " + CampoAbajo.getText());

        });

    }

}
