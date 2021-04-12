import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Principal {
	static List<Persona> listPersonas = new ArrayList<Persona>();
	static List<Persona> ordenada =new ArrayList<Persona>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			int anio = (int) (Math.random() * (2000 - 1950) + 1950);
			Persona estaPersona = new Persona("Nombre" + i, "Apellido" + i, anio);
			listPersonas.add(estaPersona);
		}
		 for(Persona p: listPersonas){
			 ordenada.add(p);
		 }
		MostrarPersonas();
	}

	private static void MostrarPersonas() {
		
		boolean salir = false;
		int opcion = 0;
		
		Collections.sort(ordenada);
		
		
		String lista = "";
		while (!salir) {
			String opcionString = JOptionPane.showInputDialog("1 - Ordenado\n2 - Sin Ordenar\n3 - Salir");
			try {
				opcion = Integer.parseInt(opcionString);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Debe ingresar un número.");
				//opcion=0;
			}
			switch (opcion) {
			case 1:
				Iterator<Persona> itor = ordenada.iterator();
				while (itor.hasNext()) {
					lista+=itor.next()+"\n";
				}
				JOptionPane.showMessageDialog(null, lista);
				lista="";
				break;
			case 2:
				Iterator<Persona> it = listPersonas.iterator();
				while (it.hasNext()) {
					lista+=it.next()+"\n";
				}
				JOptionPane.showMessageDialog(null, lista);
				lista="";
				break;
			case 3:
				salir = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
		}

	}

}
