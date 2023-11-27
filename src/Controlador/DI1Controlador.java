package Controlador;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DI1Controlador implements Initializable {
	//declaro los objetos creados en la vista
	@FXML
	private Button boton;
	@FXML
	private Label salida;
	@FXML
	private TextField entrada;
	
	 // Lista observable para almacenar usuarios
    private ObservableList<Usuario> listaUsuarios = FXCollections.observableArrayList();

	
    @FXML
    private TableView<Usuario> tablaUsuarios;
    @FXML
    private TableColumn<Usuario, String> columnaNombre;
    @FXML
    private TableColumn<Usuario, String> columnaApellido1;
    @FXML
    private TableColumn<Usuario, String> columnaApellido2;
	
	
    public void handleButtonAction(ActionEvent event) {
        //Compruebo que el botón funcione
    	System.out.println("Guardar nombre");
    	/* EJERCICIO !
    	 * //Tomo la entrada del TextField entrada como "nombre"
    	 
    	String nombre = entrada.getText();
    	//Cambio el texto del label salida con el texto
    	salida.setText("¡Hola, "+ nombre + "!");
    	*/
        // Obtener el nombre completo del TextField
        String nombreCompleto = entrada.getText();

        // Crear un objeto Usuario
        Usuario usuario = new Usuario(nombreCompleto);
        
        // Agregar el usuario a la lista
        listaUsuarios.add(usuario);

        // Actualizar la tabla
        actualizarTablaUsuarios();
        
     // Mostrar un saludo personalizado
        salida.setText("¡Hola, " + usuario.getNombre() + " " + usuario.getApellido1() +" " + usuario.getApellido2() + "!");
 
    }
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("Inicializo controlador");
	}
	
    private void actualizarTablaUsuarios() {
        // Vincular la lista observable a la tabla y sus columnas
        tablaUsuarios.setItems(listaUsuarios);
        columnaNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        columnaApellido1.setCellValueFactory(cellData -> cellData.getValue().apellido1Property());
        columnaApellido2.setCellValueFactory(cellData -> cellData.getValue().apellido2Property());
    }
    
    public void handleEliminarButtonAction(ActionEvent event) {
        // Obtener el usuario seleccionado
        Usuario usuarioSeleccionado = tablaUsuarios.getSelectionModel().getSelectedItem();

        // Verificar que se haya seleccionado un usuario
        if (usuarioSeleccionado != null) {
            // Eliminar el usuario de la lista
            listaUsuarios.remove(usuarioSeleccionado);

            // Actualizar la tabla
            actualizarTablaUsuarios();
            
            salida.setText("Eliminado usuario " + usuarioSeleccionado.getNombre() + " " + usuarioSeleccionado.getApellido1() +" " + usuarioSeleccionado.getApellido2());

            
        } else {
            // Mostrar un mensaje de advertencia si no se selecciona un usuario
        	salida.setText("Por favor, seleccione un usuario para eliminar.");
        }
    }

    
}
