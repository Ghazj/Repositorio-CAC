package tecnicas.u04;
import java.util.Scanner;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner teclado = new Scanner (System.in);
		
			System.out.println("Ingrese dos números ");
			
		int num1 = teclado.nextInt();
		int num2 = teclado.nextInt();
		double resultado = (double)num1/num2;
		
		System.out.println(resultado);
		
	}
	
}
