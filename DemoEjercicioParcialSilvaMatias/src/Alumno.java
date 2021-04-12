
public class Alumno implements Comparable<Alumno> {
	private long dni;
	private String apellido, nombre;

	public Alumno(long dni, String apellido, String nombre) {
		// TODO Auto-generated constructor stub
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "dni=" + dni + ", " + apellido + ", " + nombre;
	}

	public long getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}
	public int compareTo(Alumno o) {
		return this.getApellido().compareTo(o.getApellido());
	}

}
