package tecnicas.u06;
import java.util.Random;
public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[][] = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 3; j++) {
			
				numeros[i][j] = (int)Math.random()*((9 + 1 + 1) + 9);
				System.out.print(numeros[i][j]);
			}
			System.out.println(""); //saltar linea.
		}
		
	}

}
