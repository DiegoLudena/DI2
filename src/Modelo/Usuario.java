package Modelo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Usuario {
    private StringProperty nombre = new SimpleStringProperty();
    private StringProperty apellido1 = new SimpleStringProperty();
    private StringProperty apellido2 = new SimpleStringProperty();


    public Usuario(String nombreCompleto) {
        // Dividir el nombre completo en nombre y apellido
        String[] partes = nombreCompleto.split(" ");
        if (partes.length > 0) {
            this.nombre.set(partes[0]);
        }
        if (partes.length > 1) {
            this.apellido1.set(partes[1]);
        }
        if (partes.length > 2) {
            this.apellido2.set(partes[2]);
        }
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getApellido1() {
        return apellido1.get();
    }

    public StringProperty apellido1Property() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1.set(apellido1);
    }
    public String getApellido2() {
        return apellido2.get();
    }

    public StringProperty apellido2Property() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2.set(apellido2);
    }
}