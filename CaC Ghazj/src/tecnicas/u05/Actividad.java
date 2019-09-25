package tecnicas.u05;

import java.util.Scanner;

public class Actividad {

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
		return resultado;
	}
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	
		
	String nombre;
	String pass;
	double num1;
	double num2;
	String operador;
	
		
		nombre = leerTexto("Ingrese Usuario: ");
		
		//System.out.println(" ");
			
		pass = leerTexto("Ingrese su clave");

		//System.out.println(" ");
		
		boolean condition = login(nombre,pass);	
		
		if (condition == true) {
			
			num1 = leerNum("Ingrese num1: ");
		//	System.out.println(" ");
			
			num2 = leerNum("Ingrese num2: ");
		//	System.out.println(" ");
			
		/*	System.out.println("Ingresar + para sumar");
			System.out.println("Ingresar - para restar");
			System.out.println("Ingresar * para multiplicar");
			System.out.println("Ingresar / para dividir"); */
			
			operador = leerTexto("Ingrese operador [+,-,*,/]");
			
			double resultado = calcular(num1,num2,operador);
			System.out.println(resultado);
		}
	}
	
			static String leerTexto(String mensaje){
				Scanner teclado = new Scanner (System.in);
				System.out.println(mensaje);
				String texto = teclado.nextLine();
				
				return texto;
			} 
			
			static double leerNum(String mensaje) {
				Scanner teclado = new Scanner (System.in);
				System.out.println(mensaje);
				double num = teclado.nextDouble();
				
				return num;
			} 
	
}
