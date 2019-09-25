package tecnicas.u04;
	import java.util.Scanner;
public class Ej02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		int num1;
		int num2;
		int cociente;
		double resto;
		
		System.out.println("Ingrese un número.");
		num1= teclado.nextInt();
		
		System.out.println("Ingrese un número divisor.");
		num2= teclado.nextInt();
		
		//cociente = Math.floorDiv(num1,num2);
		cociente = num1 / num2;
		resto = num1 % num2;
		
		System.out.println(cociente);
		System.out.println(resto);
	}

}
