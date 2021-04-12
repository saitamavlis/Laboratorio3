
public class Producto implements Comparable<Producto> {
	String color, nombre;
	float peso, precio;

	@Override
	public int compareTo(Producto o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}

	public Producto(String color, String nombre, float peso, float precio) {
		super();
		this.color = color;
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Color: "+ color + ", nombre:" + nombre + ", peso:" + peso + ", precio:" + precio;
	}

}
