import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class EJ_JOPtion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean salir = false;
      String opcion;
      
      do {
    	  opcion=JOptionPane.showInputDialog("    MENU   \n1 Opcion 1\n2 Opcion 2\n3 Salir\nSeleccione una opcion");
    	  try {
    		  int nroOpcion = Integer.parseInt(opcion);
    		  switch(nroOpcion) {
    		  case 1:
    			  break;
    		  case 2:
    			  break;
    		  case 3:
    			  salir=true;
    			  break;
    			  default:
    				  JOptionPane.showMessageDialog(null, "Opcion no válida");
    		  }
    	  }catch(NumberFormatException e) {
    		  JOptionPane.showMessageDialog(null, "Solo se permiten Números");
    	  }
      }while(!salir);
	}

}
