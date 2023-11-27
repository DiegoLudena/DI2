package Modelo;

public class Usuario {
	    private String nombre;
	    private String apellido;

	    public Usuario(String nombreCompleto) {
	        // Dividir el nombre completo en nombre y apellido
	        String[] partes = nombreCompleto.split(" ");
	        if (partes.length > 0) {
	            this.nombre = partes[0];
	        }
	        if (partes.length > 1) {
	            this.apellido = partes[1];
	        }
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }
}
