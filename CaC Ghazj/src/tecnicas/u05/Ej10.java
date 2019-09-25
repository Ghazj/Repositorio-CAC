package tecnicas.u05;

import java.util.Scanner;

public class Ej10 {

		static String obtenerMesEnTexto(int mesNum) {
			
			String resul = "";
			
			if ((mesNum > 0) & (mesNum < 12)) {
			
				switch (mesNum) {
				
				case 1:
					resul = "Enero";
				break;
				
				case 2:
					resul = "Febrero";
				break;
				
				case 3:
					resul = "Marzo";
				break;
					
				case 4:
					resul = "Abril";
				break;
				
				case 5:
					resul = "Mayo";
				break;
			
				case 6:
					resul = "Junio";
				break;
				
				case 7:
					resul = "Julio";
				break;
				
				case 8:
					resul = "Agosto";
				break;
				
				case 9:
					resul = "Septiembre";
				break;
				
				case 10:
					resul = "Octubre";
				break;
				
				case 11:
					resul = "Noviembre";
				break;
				
				case 12:
					resul = "Diciembre";
				break;
				}
			}
			else {
				
				resul = "Ingrese un mes válido.";
				
			}
	
			
			return resul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese un mes es números.");
		int mesNum = teclado.nextInt();
		teclado.close();
		
		
		String mes = obtenerMesEnTexto(mesNum);
		
		System.out.println(mes);
		
	}

}
