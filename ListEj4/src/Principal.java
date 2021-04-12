import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Producto> lista=new ArrayList<Producto>();
		lista.add(new Producto("Rojo", "Tornillo", 10, 15));
		lista.add(new Producto("AZul", "Clavo", 5, 22));
		lista.add(new Producto("Verde", "Tarugo", 17, 12));
		lista.add(new Producto("Amarillo", "Martillo", 55, 72));
		lista.add(new Producto("Negro", "Destornillador", 60, 59));
		
		Collections.sort(lista);
		JOptionPane.showMessageDialog(null, "Por nombre: \n"+Mostrar(lista));
		Collections.sort(lista, new ProductoPorColor());
		JOptionPane.showMessageDialog(null, "Por color: \n"+Mostrar(lista));
		Collections.sort(lista, new ProductoPorPrecio());
		JOptionPane.showMessageDialog(null, "Por precio: \n"+Mostrar(lista));
		Collections.sort(lista, new ProductoPorPeso());
		JOptionPane.showMessageDialog(null, "Por peso: \n"+Mostrar(lista));
	}

	private static String Mostrar(List<Producto> lista) {
		// TODO Auto-generated method stub
		String texto="";
		Iterator it = lista.iterator();
		while(it.hasNext()) {
			texto+=it.next()+"\n";
		}
		return texto;
	}

}
