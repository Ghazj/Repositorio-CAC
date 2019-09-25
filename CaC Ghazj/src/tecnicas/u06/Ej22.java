package tecnicas.u06;
import java.util.Scanner;
public class Ej22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String texto = teclado.nextLine();
		String aux;
		
		aux = texto.substring(0,1);
		aux = aux.toUpperCase();
		
		texto = texto.substring(1);
		texto = texto.toLowerCase();
		
		System.out.println(aux+texto+".");
	}

}
