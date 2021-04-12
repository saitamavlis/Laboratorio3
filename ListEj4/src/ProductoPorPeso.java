import java.util.Comparator;

public class ProductoPorPeso implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		// TODO Auto-generated method stub
		return (int) (o1.peso*100-o2.peso*100);
	}

}
