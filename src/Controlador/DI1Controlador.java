package Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DI1Controlador implements Initializable {
	@FXML
	private Button boton;
	@FXML
	private Label salida;
	@FXML
	private TextField entrada;
	
	
    public void handleButtonAction(ActionEvent event) {
        //Compruebo que el botón funcione
    	System.out.println("Guardar nombre");
    	String nombre = entrada.getText();
    	salida.setText("¡Hola, "+ nombre + "!");
    }
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializo controlador");
	}

}
