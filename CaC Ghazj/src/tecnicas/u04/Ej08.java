package tecnicas.u04;
import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese su edad.");
		int edad = teclado.nextInt();
		
		System.out.println("Ingrese su género. 1.- Para masculino, 2.- Para femenino.");
		int genero = teclado.nextInt();
		
		switch (genero) {
			case 1:
				
				if (genero >= 65) {
					System.out.println("SI puede jubilarse");
				} else {
					System.out.println("NO puede jubilarse");
				}
				
				break;
				
			case 2:
				
				if (genero >= 60) {
					System.out.println("SI puede jubilarse");
				} else {
					System.out.println("NO puede jubilarse");
				}
				
				break;
		
			default:
				System.out.println("Ingrese una opción válida");
		}
		
		
		
		
		
		
	}

}
