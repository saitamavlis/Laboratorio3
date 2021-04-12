
public class Juguete implements Comparable<Juguete> {
	String tipo, nombre;
	int idJuguete;
	double precio;

	public Juguete(String tipo, String nombre, int idJuguete, double precio) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.idJuguete = idJuguete;
		this.precio = precio;
	}

	@Override
	public int compareTo(Juguete j) {
		return this.getNombre().compareTo(j.getNombre());
	}

	@Override
	public boolean equals(Object obj) {
		boolean resultado = false;
		if (obj instanceof Juguete) {
			if (this.getTipo().toUpperCase().equals(((Juguete) obj).getTipo().toUpperCase()))
				resultado = true;
		}
		return resultado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdJuguete() {
		return idJuguete;
	}

	public void setIdJuguete(int idJuguetel) {
		this.idJuguete = idJuguetel;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tipo: " + tipo + ", nombre:" + nombre + ", Id:" + idJuguete + ", precio:" + String.format("%.2f",precio);
	}

}
