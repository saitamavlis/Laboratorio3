import java.util.Comparator;

public class CatedraXAula implements Comparator<Catedra>{

	@Override
	public int compare(Catedra o1, Catedra o2) {
		// TODO Auto-generated method stub
		return o1.getNroAula()-o2.getNroAula();
	}
	

}
