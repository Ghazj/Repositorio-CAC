package tecnicas.u04;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese el primer número.");
		int a = teclado.nextInt();
		System.out.println("Ingrese el segundo número.");
		int b = teclado.nextInt();
		
		do {
			
			if (b == 0) {
				System.out.println("El segundo valor no puede ser cero. ingrese el segundo número nuevamente.");
				b = teclado.nextInt();}
			
		} while(b == 0);
		
		int r = a/b;
		System.out.println("el resultado de la división es: "+r);
		
		teclado.close();
		
	}

}
