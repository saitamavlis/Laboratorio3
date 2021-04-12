
public class Persona implements Comparable<Persona> {
String nombre, apellido;
int nroDocumento;

	public Persona(String nombre, String apellido, int nroDocumento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nroDocumento = nroDocumento;
}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getNroDocumento() {
		return nroDocumento;
	}
	@Override
	public String toString() {
		return  nombre + ", " + apellido + ", documento: " + nroDocumento ;
	}
	
	@Override
	public boolean equals(Object obj){
		boolean retorno=false;
		Persona p=null;
		if(obj instanceof Persona) {
			p=(Persona)obj;
		if(this.getNombre().equals(p.getNombre()))
			retorno =true;
		}
		
		return retorno;
	}

}
