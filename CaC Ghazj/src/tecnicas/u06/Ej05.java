package tecnicas.u06;
import java.util.Scanner;
public class Ej05 {

	public static void main(String[] args) {
	
		String[] nombres = new String[leerNum("Ingrese el número de participantes.")];

		leerNombres("Ingrese el nombre del participante.",nombres);
		
		imprimirNombres(nombres);}

	static void imprimirNombres(String[] nombres) {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);	}}
	
	static void leerNombres(String mensaje,String[] nombres){
		Scanner teclado = new Scanner (System.in);
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(mensaje);
			nombres[i] = teclado.nextLine();}} 
	
	static int leerNum(String mensaje) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println(mensaje);
		int num = teclado.nextInt();
		
		return num;} 
}
