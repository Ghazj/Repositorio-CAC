package tecnicas.u04;
import java.util.Scanner;
public class Ej09dos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner (System.in);

	System.out.println("Ingrese la calificación del estudiante.");
	int calificacion = teclado.nextInt();
	int caso = 0;
	
	if ((calificacion > 0) && (calificacion <= 3)){
		caso = 1;
	}
	else {
		if ((calificacion > 3) && (calificacion <= 6)){
			caso = 2;
		}
		else {
			if ((calificacion > 6) && (calificacion <= 8)){
				caso = 3;
			}
			else {
				if ((calificacion > 8) && (calificacion <= 10)){
					caso = 4;
				}
			}
		}
	}
	switch (caso) {
		case 1:
			System.out.println("Ha desaprobado.");
			break;
		case 2:
			System.out.println("Ha obtenido un aprobado.");
			break;
		case 3:
			System.out.println("Ha obtenido una calificación notable.");
			break;
		case 4:
			System.out.println("Ha obtenido una calificación sobresaliente.");
			break;
		default:
			System.out.println("Ingrese una nota válida.");
		
		}
	}

}
