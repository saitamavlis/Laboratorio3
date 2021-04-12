import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Catedra implements Comparable<Catedra>{
	private int nroAula;
	private String catedra;
	/* private Alumno alumno; */
	List<Alumno> listaAlumnosCatedra = new ArrayList<Alumno>();

	public Catedra(String catedra, int nroAula) {
		// TODO Auto-generated constructor stub
		this.catedra = catedra;
		this.nroAula = nroAula;
	}

	public int getNroAula() {
		return nroAula;
	}

	public void setNroAula(int nroAula) {
		this.nroAula = nroAula;
	}

	public String getCatedra() {
		return catedra;
	}

	public List<Alumno> getListaAlumnosCatedra() {
		return listaAlumnosCatedra;
	}

	public void AddAlumno(Alumno alumno) {
		listaAlumnosCatedra.add(alumno);
	}

	@Override
	public String toString() {
		String texto="\nCatedra: "+catedra+". Aula: "+nroAula +". Lista de Alumnos:";
		Collections.sort(listaAlumnosCatedra);
		Iterator<Alumno> iT = listaAlumnosCatedra.iterator();
		while (iT.hasNext()) {
			texto+="\n"+iT.next().toString();
		}

		return texto;
	}
	
	public int compareTo(Catedra cat) {
	return this.getCatedra().compareTo(cat.getCatedra());
	}

}
