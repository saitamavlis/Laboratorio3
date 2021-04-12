import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<Persona> personas = new ArrayList<Persona>();
	static String encontrados = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgregarPersonas();
		for (Persona p : personas) {
			System.out.println(p.toString());
		}
		String nombre = JOptionPane.showInputDialog("Ingrese un nombre a buscar");
		try {
			BuscarNombre(nombre);

		} catch (Excepcion e) {
			JOptionPane.showMessageDialog(null, "Excepcion: " + e.getMessage());
		}
		if (!encontrados.equals(null)) {
			JOptionPane.showMessageDialog(null, "Encontrados:\n" + encontrados);
		} 
	}

	private static String BuscarNombre(String nombre) throws Excepcion {
		// TODO Auto-generated method stub

		Persona abuscar = new Persona(nombre, "apellido", 00000000);
		boolean encontrado = false;
		Collections.sort(personas);
		if (personas.contains(abuscar)) {
			encontrado = true;
			for (Persona p : personas) {
				if (p.equals(abuscar)) {
					encontrados += p.toString() + "\n";
				}
			}
		}

		if (encontrado) {
			throw new Excepcion("Encontrado");
		} else {
			throw new Excepcion("No existe en la lista");
		}

	}

	private static void AgregarPersonas() {
		// TODO Auto-generated method stub
		int numero;
		for (int i = 0; i < 20; i++) {
			String[] nombres = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
					"Once", "Doce", "Trece", "Catorce", "Quince" };
			numero = (int) (Math.random() * 14);
			String nombre = nombres[numero];

			// Genera apellido alumno aleatorio
			String[] apellidos = { "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Septimo", "Octavo",
					"Noveno", "Decimo" };
			numero = (int) (Math.random() * 9);
			String apellido = apellidos[numero];

			// Genera dni alumno aleatorio
			int dni = (int) (Math.random() * (45000000 - 20000000) + 20000000);
			Persona estaPersona = new Persona(nombre, apellido, dni);
			personas.add(estaPersona);
		}

	}
}
