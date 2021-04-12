import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
//import java.util.InputMismatchException;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<Juguete> listJuguetes = new ArrayList<Juguete>();

	public static void main(String[] args) {
		AgregarJuguetes();
		MostarLista();
		
		boolean salir = false;
		while (!salir) {
			String opcion = JOptionPane.showInputDialog("1-Alta\n2-Baja\n3-listado por tipo"
					+ "\n4-listado alfabético por nombre\n5-listado por precio\n6-Contar Tipo\n7-fin");
			try {
				int nroOpcion = Integer.parseInt(opcion);
				
				switch (nroOpcion) {
				case 1:
					Alta();
					break;
				case 2:
					//try {
						Baja();
					/*}catch(NumberFormatException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}catch(IndexOutOfBoundsException ee) {
						JOptionPane.showMessageDialog(null, ee.getMessage());
					}*/
					break;
				case 3:
					Collections.sort(listJuguetes, new JueguetePorTipo());
					MostarLista();
					break;
				case 4:
					Collections.sort(listJuguetes);
					MostarLista();
					break;
				case 5:
					Collections.sort(listJuguetes, new JuguestesPorPrecio());
					MostarLista();
					break;
				case 6:
					try {
						CantidadPorTipo(JOptionPane.showInputDialog("Ingre el tipo a contar"));
					}catch(NoExisteExcep e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case 7:
					salir=true;
					break;
				}
				
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Debes insertar un número" + e.getMessage());
			}

		}

	}

	private static void CantidadPorTipo(String tipo) throws NoExisteExcep{
		Juguete aBuscar = new Juguete(tipo, null, 0, 0);
		int cantidad=0;
		for(Juguete j: listJuguetes) {
			if(j.equals(aBuscar))
				cantidad++;
		}
		if(cantidad==0)
			throw new NoExisteExcep("No existe "+tipo+" en la lista");
		else 
			JOptionPane.showMessageDialog(null, "Se encontraron "+cantidad+" del tipo "+tipo);
		
	}

	private static void MostarLista() {
		// TODO Auto-generated method stub
		
		Iterator it =listJuguetes.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	private static void Baja() {
		String id=JOptionPane.showInputDialog("Ingrese el ID del juguete a borrar.");
		try {
			int idIndex=Integer.parseInt(id)-1;
			//listJuguetes.size();
			JOptionPane.showMessageDialog(null, "Se borró: "+listJuguetes.remove(idIndex).toString());
			
			
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debes insertar un número" + e.getMessage());
		}catch(IndexOutOfBoundsException ee){
			JOptionPane.showMessageDialog(null, "Fuera de rango" + ee.getMessage());
		}
		
		
	}

	private static void Alta() {
		String tipo = JOptionPane.showInputDialog("Tipo: ");
		int id=listJuguetes.size()+1;
		String nombre=tipo+id;
		double precio = Math.random() * (4500 - 200) + 200;
		Juguete jugueteAgregar = new Juguete(tipo, nombre, id, precio);
		if(listJuguetes.add(jugueteAgregar))
			JOptionPane.showMessageDialog(null, "Juguete "+jugueteAgregar.getNombre()+" agregado con exito.");
		else
			JOptionPane.showMessageDialog(null, "Error al cargar Juguete.");
	}

	private static void AgregarJuguetes() {
		int numero;
		for (int i = 0; i < 1000; i++) {
			String nombre="";
			
			String[] tipos = { "Autos","Juegos de mesa","Muñecas","Encastrables"};
			numero = (int) (Math.random() * 4);
			String tipo = tipos[numero];
			int id =i+1;
			
			nombre=tipo+id;
			
			double precio = Math.random() * (4500 - 200) + 200;
			Juguete esteJuguete = new Juguete(tipo, nombre, id, precio);
			listJuguetes.add(esteJuguete);
		}
		
	}

}
