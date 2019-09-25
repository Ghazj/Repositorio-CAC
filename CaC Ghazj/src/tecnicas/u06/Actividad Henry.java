package unidad5;

import java.util.Scanner;

public class Actividad {

	static boolean login (String nombre, String pass) {
	
	boolean condition = false; 
	
	if ((nombre.equals("ADMIN")) && pass.equals("1234"))  {
		
		condition = true;
		
		System.out.println("Bienvenido");
		
		System.out.println(" ");
		
	} else {
		System.out.println("Datos invalidos");	
	}
		return condition;
	}
	
	static double calcular(double num1, double num2, String operador) {
		
		double resultado=0;
		
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
		}
		return resultado;
	}
	
	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner teclado = new Scanner (System.in);
		
	String nombre;
	String pass;
	int num1;
	int num2;
	String operador;
	
		System.out.println("Ingrese su usuario");
		System.out.print("usuario: ");
		nombre = teclado.nextLine();
		
		System.out.println(" ");
		
		System.out.println("Ingrese su clave");
		System.out.print("clave: ");
		pass = teclado.nextLine();

		System.out.println(" ");
		
		boolean condition = login(nombre,pass);	
		
		if (condition == true) {
			
			System.out.print("numero 1: ");
			num1 = teclado.nextInt();
			System.out.println(" ");
			
			System.out.print("numero 2: ");
			num2 = teclado.nextInt();
			System.out.println(" ");
			
			System.out.println("Ingresar + para sumar");
			System.out.println("Ingresar - para restar");
			System.out.println("Ingresar * para multiplicar");
			System.out.println("Ingresar / para dividir");
			operador = teclado.next();
			
			double resultado = calcular(num1,num2,operador);
			System.out.println(resultado);
		}
	}
}
