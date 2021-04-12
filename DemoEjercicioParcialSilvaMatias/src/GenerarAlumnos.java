
public class GenerarAlumnos {

	private Alumno alumno;
	public Alumno generaAlumno() {
		//Genera nombre alumno aleatorio
		String[] nombres = { "Andrea", "David", "Baldomero", "Balduino", "Baldwin", "Baltasar", "Barry", "Bartolo",
				"Bartolomé", "Baruc", "Baruj", "Candelaria", "Cándida", "Canela", "Caridad", "Carina", "Carisa",
				"Caritina", "Carlota", "Baltazar"};
		int numero = (int) (Math.random() * 19);
		String nombre=nombres[numero];
		
		//Genera apellido alumno aleatorio
		String[] apellidos = { "Gomez", "Guerrero", "Cardenas", "Cardiel", "Cardona", "Cardoso", "Cariaga", "Carillo",
				"Carion", "Castiyo", "Castorena", "Castro", "Grande", "Grangenal", "Grano", "Grasia", "Griego",
				"Grigalva" };
		numero = (int) (Math.random() * 17);
		String apellido=apellidos[numero];
	
		//Genera dni alumno aleatorio
		long dni = (long)(Math.random()*(45000000-30000000)+30000000);
		
		//Crea alumno
		alumno = new Alumno(dni,apellido, nombre);
		return alumno;
	}
	
	
}
