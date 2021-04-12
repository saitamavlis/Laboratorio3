import java.util.Comparator;

public class ProductoPorColor implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}
}
