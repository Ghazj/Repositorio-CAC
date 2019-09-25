package tecnicas.u04;
import java.util.Scanner;

public class Ej08dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese su edad.");
		int edad = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Ingrese su género. 'M'.- Para masculino, 'F'.- Para femenino.");
		String genero = teclado.nextLine();
		teclado.close();
	if (((genero.equals("M")) && (edad >= 65)) || ((genero.equals("F")) && (edad >= 60))) {
		System.out.println("SI se puede jubilar");
		}	
	else {
		System.out.println("NO se puede jubilar");
		}
	}
}
