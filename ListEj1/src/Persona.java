
public class Persona implements Comparable<Persona> {
String nombre, apellido;
int anoDeNacimiento;
public Persona(String nombre, String apellido, int anoDeNacimiento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.anoDeNacimiento = anoDeNacimiento;
}
@Override
public String toString() {
	return "Nombre y apellido: " + nombre + " " + apellido + ", nacido en " + anoDeNacimiento;
}
@Override
public int compareTo(Persona p) {
	return Integer.compare(this.anoDeNacimiento, p.anoDeNacimiento);
}
}
