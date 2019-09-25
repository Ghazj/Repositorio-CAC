package tecnicas.u06;
import java.util.Scanner;
public class Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
int[] numeros = new int[5];
		
/*numeros[0] = leerNum("Ingrese un número.");
numeros[1] = leerNum("Ingrese un número.");
numeros[2] = leerNum("Ingrese un número.");
numeros[3] = leerNum("Ingrese un número.");
numeros[4] = leerNum("Ingrese un número.");*/
		
for (int i = 0; i < numeros.length; i++) {
	numeros[i] = leerNum("Ingrese un número.");
}		

for (int i = 0; i < numeros.length; i++) {
	System.out.print(numeros[i]);}

}
	static int leerNum(String mensaje) {
		Scanner teclado = new Scanner (System.in);
		System.out.println(mensaje);
		int num = teclado.nextInt();
		
		return num;
}
}