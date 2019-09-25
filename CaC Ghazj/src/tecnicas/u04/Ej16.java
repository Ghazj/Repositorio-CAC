package tecnicas.u04;
import java.util.Scanner;
public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número.");
		int num = teclado.nextInt();
		int cont = num;
		
		for (int i=num; i < num+10 ; i++) {
			cont++;
			System.out.println(cont);
		}		
		teclado.close();
	}
}