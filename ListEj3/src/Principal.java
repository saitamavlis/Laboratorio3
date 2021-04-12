import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

import javax.swing.JOptionPane;


public class Principal {

	static List<Cliente> arraylistClientes = new ArrayList<Cliente>();
	static List<Cliente> linkedlistClientes = new LinkedList<Cliente>();
	static List<Cliente> vectorClientes = new Vector<Cliente>();
	static List<Cliente> stackClientes = new Stack<Cliente>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Tiempo ArrayList: "+CreaList(arraylistClientes)+"\nTiempo LinkedList: "+
		CreaList(linkedlistClientes)+"\nTiempo Vector: "+CreaList(vectorClientes)+"\nTiempo Stack: "+CreaList(stackClientes));
		JOptionPane.showMessageDialog(null, "Tiempo recorrido ArrayList: "+RecorreList(arraylistClientes)+"\nTiempo recorrido LinkedList: "+
		RecorreList(linkedlistClientes)+"\nTiempo recorrido Vector: "+RecorreList(vectorClientes)+"\nTiempo recorrido Stack: "+RecorreList(stackClientes));
	}
	private static String RecorreList(List<Cliente> lista) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		for(Iterator<Cliente> it = lista.iterator();it.hasNext();) {
			Cliente esteCliente =(Cliente)it.next();
		}
		long fin = System.currentTimeMillis();
		return (fin-inicio)+" milisegundos";
		
	}
	private static String CreaList(List<Cliente> lista) {
		// TODO Auto-generated method stub
		long inicio = System.currentTimeMillis();
		for(int i=0;i<=1000000;i++) {
			lista.add(new Cliente (i,i,"nombre"+i));
		}
		long fin = System.currentTimeMillis();
		return (fin-inicio)+" milisegundos";
	}

}
