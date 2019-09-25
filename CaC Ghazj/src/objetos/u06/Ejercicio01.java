package objetos.u06;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String eleccion="hola";
		String precio="";
		String artículo="";
		
		do  {
			JOptionPane.showInputDialog("Ingresa un artículo");
		precio = JOptionPane.showInputDialog("Ingresa el valor de este");
		eleccion = JOptionPane.showInputDialog("Desea ingresar otro artículo? [S/N]");
		} while (eleccion == "S" || eleccion == "s");
		
		
		JOptionPane.showConfirmDialog(null, "hola");
		
		
		
		JOptionPane.showMessageDialog(null,eleccion);
		
			
	}

}
