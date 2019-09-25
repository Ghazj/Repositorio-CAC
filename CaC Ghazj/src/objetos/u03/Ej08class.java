package objetos.u03;
import java.util.Scanner;
import java.util.ArrayList;

public class Ej08class {
	Scanner teclado = new Scanner(System.in);
	
	ArrayList<Integer> numeros = new ArrayList<>();
	
	public Ej08class() {
		
	}
		
	public void llenarArray() {	
	for (int i = 0; i<6; i++) {
			numeros.add(i);
	}
}
		
		public void reemplazar(int index,int elemento) {
			
			numeros.set(index, elemento);
		}
	
		public String toString() {
			return numeros.toString();
		}
		
		
}
