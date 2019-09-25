package objetos.u03;
import java.util.Scanner;
import java.util.ArrayList;
public class MainU03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Ej08class numeros = new Ej08class();
		
		numeros.llenarArray();
		
		System.out.println(numeros.toString());

		System.out.println("Elige posicion y numeros a reemplazar.");
		int posicion = teclado.nextInt()-1;
		int elemento = teclado.nextInt();
		numeros.reemplazar(posicion, elemento);
		
		System.out.println(numeros.toString());
		
		
		
	}

	
	
}
