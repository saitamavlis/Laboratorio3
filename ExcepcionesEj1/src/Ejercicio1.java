import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		ArrayList<Integer> enteros = new ArrayList<Integer>();
		while (i > 0) {
			i--;
			try {
				SumarIngreso(enteros);
			} catch (Exception e) {
				JOptionPane.showConfirmDialog(null, "Valor no numerico "+e.getMessage());
				i=0;
			}
		}
		MostrarResultado(enteros);
	}

	private static void MostrarResultado(ArrayList<Integer> enteros) {
		// TODO Auto-generated method stub
		int suma=0;
		for (Iterator iterator = enteros.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Valor: " + integer);
			suma=+integer;
		}
		System.out.println("Suma: "+suma);
	}

	private static void SumarIngreso(ArrayList<Integer> enteros) throws Exception{
		// TODO Auto-generated method stub
		enteros.add(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero")));
	}

}
