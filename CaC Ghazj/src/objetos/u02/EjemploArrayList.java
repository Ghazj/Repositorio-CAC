package objetos.u02;

import java.util.ArrayList;

public class EjemploArrayList {

	public static void main(String[] args) {

		ArrayList <String> nombres = new ArrayList<>();
		nombres.add("Jesuscristo");
		nombres.add("Zeus");
		nombres.add(1,"Hades");
		
		
		for (String var : nombres) {
			System.out.println(var);
		}
	/*	for (int i = 0;i < nombres.size();i++) {
			System.out.println(nombres.get(i));
		}
		for (Object obj : nombres) {
			System.out.println(obj);
		} */
		
		nombres.remove("Hades");
		
		for (String var : nombres) {
			System.out.println(var);
		}
		
		nombres.remove(1);
		
		for (String var : nombres) {
			System.out.println(var);
		}
		
		
	}

}
