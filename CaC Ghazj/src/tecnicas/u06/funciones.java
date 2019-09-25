package tecnicas.u06;
import java.util.Scanner;
public class funciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);

	}
	//leer texto (String)
	static String leerTexto(String mensaje){
		Scanner teclado = new Scanner (System.in);
		System.out.println(mensaje);
		String texto = teclado.nextLine();
		
		return texto;} 
	//lee número (int-Double)
	static double leerNum(String mensaje) {
		Scanner teclado = new Scanner (System.in);
		System.out.println(mensaje);
		double num = teclado.nextDouble();
		
		return num;} 
	//Logeo
	static boolean login (String nombre, String pass) {
		
		boolean condition; 
		int i = 0;
		
		do {
			i++;
			
			
			
		if ((nombre.equals("ADMIN")) && pass.equals("1234"))  {
			
			condition = true;
			
			System.out.println("Bienvenido");
			
			System.out.println(" ");
			
		} else {
			System.out.println("Datos invalidos");
			condition = false;
		} 
		
		} while (i < 4);
		
			return condition;	
		}
	//Calculadora	
	static double calcular(double num1, double num2, String operador) {
			
			double resultado;
			
			switch (operador) {
			case "+":
				resultado= num1+num2;
			
				break;
			case "-":
				resultado= num1-num2;
				
				break;
			case "*":
				resultado= num1*num2;
			
				break;
			case "/":
				resultado= num1/num2;
			
				break;

			default:
				System.out.println("ingrese operador valido");
				resultado = 0;
			}
			return resultado;}
	//Leer Strings y guardar en Array.
	static void leerNombres(String mensaje,String[] nombres){
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(mensaje);
			nombres[i] = teclado.nextLine();}} 
	//Imprime datos de una array (Este en Strings. modificar en caso.)
	static void imprimirNombres(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);	}}
	//Localiza el dato de una array. (Este en Strings. modificar en caso.)
	static int localizador(String nombre,String array[]) {
		int obj = -1;
		for (int i = 0; i < array.length;i++) {
			if (nombre.equals(array[i])) {
				obj = i;
				return obj;
			} 
		}
			return obj;}
}

