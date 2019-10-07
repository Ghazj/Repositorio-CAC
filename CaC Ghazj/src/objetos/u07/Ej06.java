package objetos.u07;
import java.util.Scanner;
public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		caracterEn("hola",teclado.nextInt());

	}

	static void caracterEn(String cadena,int num){
		//Scanner teclado = new Scanner(System.in);
		//int aux1 = teclado.nextInt();
		try {
			System.out.println(cadena.charAt(num));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Exception");
		} catch (Exception e1) {
			System.out.println("Ha ocurrido un error");
		}
			
			
	}
}
