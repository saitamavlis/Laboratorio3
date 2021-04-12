
public class Usuario {
	String nombre, apellido, nombreUser=null;
	int dni;

	public Usuario(String nombre, String apellido, int dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombreUser() {
		return nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	@Override
	public String toString() {
		return "Nombre:" + nombre + ", apellido: " + apellido + ", nombreUser: " + nombreUser + ", dni: " + dni
				;
	}

}
