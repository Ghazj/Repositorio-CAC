package tecnicas.u06;
import java.util.Scanner;
public class Ej15 {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
	
	int posicion = 0;
	
	String nombre = leerNombres("Ingrese el nombre a buscar");
		
	String clientes[]= {"Pérez Jimenez","Pinochet","Donald Trump","Franco","Che Guevara"}; 
		
	posicion = localizador(nombre,clientes);
		
	System.out.println(posicion);
	System.out.println("Buen trabajo<3");
	
	}

	
	static int localizador(String nombre,String array[]) {
		
		int obj = -1;
		
		for (int i = 0; i < array.length;i++) {
			if (nombre.equals(array[i])) {
				obj = i;
				return obj;
			} 
		}
			return obj;
	}
	
	static String leerNombres(String mensaje){
		Scanner teclado = new Scanner (System.in);
		System.out.println(mensaje);
		return teclado.nextLine();}

}
