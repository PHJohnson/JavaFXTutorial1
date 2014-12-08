/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourfirstproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Phil
 */
public class FXMLDocumentController implements Initializable {
   
 @FXML
 private Button helloButton; 
 @FXML
 private Label ourLabel;
 @FXML
 private void printHello(ActionEvent e)
 {
        System.out.println("Hello World!");
        ourLabel.setText("Hello World!");
 }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
