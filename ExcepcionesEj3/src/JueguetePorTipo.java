import java.util.Comparator;

public class JueguetePorTipo implements Comparator<Juguete> {

	@Override
	public int compare(Juguete o1, Juguete o2) {
		// TODO Auto-generated method stub
		return o1.getTipo().compareTo(o2.getTipo());
	}

}
