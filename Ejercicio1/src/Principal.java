import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Principal {
	static int dni = 0;
	static boolean userOk = false;
	static Usuario[] users = new Usuario[3];

	public static void main(String[] args) {
		for (int i = 0; i <= 2; i++) {
			String nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
			String apellido = JOptionPane.showInputDialog("Ingrese Apellido: ");
			dni = 0;
			while (dni == 0) {
				try {
					dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese DNI: "));
				} catch (InputMismatchException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					dni = 0;
				}
			}
			users[i] = new Usuario(nombre, apellido, dni);
			userOk = false;
			while (!userOk) {
				String nombreUser = JOptionPane.showInputDialog("Ingrese Nombre de usuario: ");
				if (nombreUser == null || nombreUser.length() > 15) {
					JOptionPane.showMessageDialog(null, "El nombre de usuario debe contener hasta 15 caracteres. ");
					continue;
				}
				if (VerificoNombre(nombreUser, i)) {
					users[i].setNombreUser(nombreUser);
					userOk = true;
					JOptionPane.showMessageDialog(null, nombreUser + " guardado con éxito.");
				} else {
					JOptionPane.showMessageDialog(null,
							nombreUser + " ya fue seleccionado por otro usuario, intente nuevamente.");
				}
			}
		}
		JOptionPane.showMessageDialog(null, MuestaUsuarios());
	}

	private static String MuestaUsuarios() {
		String mensaje = "";

		for (Usuario a : users) {
			mensaje += a.toString() + "\n";
		}

		return mensaje;
	}

	private static boolean VerificoNombre(String nombreUser, int i) {
		boolean sepuede = true;
		/*
		 * Usuario acomprobar = new Usuario("nombre", "apellido",1);
		 * acomprobar.setNombreUser(nombreUser); for(Usuario a:users) {
		 * if(a.getNombreUser()!=null&&a.compareTo(acomprobar)==0) { sepuede=false; } }
		 */if (users[i].getNombreUser() == null) {

			for (int a = 0; a < i; a++) {
				if(nombreUser.equals(users[a].getNombreUser()))
					sepuede=false;
			}

		}
		return sepuede;
	}

}
