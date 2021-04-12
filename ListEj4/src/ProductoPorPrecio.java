import java.util.Comparator;

public class ProductoPorPrecio implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return (int)(o1.precio*100-o2.precio*100);
	}

}
