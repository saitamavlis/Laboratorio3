import java.util.Comparator;

public class JuguestesPorPrecio implements Comparator<Juguete> {

	@Override
	public int compare(Juguete o1, Juguete o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrecio() * 100 - o2.getPrecio() * 100);
	}

}
