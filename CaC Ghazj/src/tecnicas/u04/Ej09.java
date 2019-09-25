package tecnicas.u04;
import java.util.Scanner;
public class Ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner (System.in);

	System.out.println("Ingrese la calificación del estudiante.");
	int calificacion = teclado.nextInt();
	
	switch (calificacion) {
		case 1:
			System.out.println("Ha desaprobado.");
			break;
		case 2:
			System.out.println("Ha desaprobado.");
			break;
		case 3:
			System.out.println("Ha desaprobado.");
			break;
		case 4:
			System.out.println("Ha obtenido un aprobado.");
			break;
		case 5:
			System.out.println("Ha obtenido un aprobado.");
			break;
		case 6:
			System.out.println("Ha obtenido un aprobado.");
			break;
		case 7:
			System.out.println("Ha obtenido una calificación notable.");
			break;
		case 8:
			System.out.println("Ha obtenido una calificación notable.");
			break;
		case 9:
			System.out.println("Ha obtenido una calificación sobresaliente.");
			break;
		case 10:
			System.out.println("Ha obtenido una calificación sobresaliente.");
			break;
			
		default:
			System.out.println("Ingrese una nota válida.");
		
		}
	}

}
