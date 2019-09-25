package objetos.u04;

public class MainBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta(95719783,10000);
		System.out.println(c1);
		c1.depositar(40000);
		System.out.println(c1);
		c1.extraer(25000);
		System.out.println(c1);
		System.out.println("\n");
		
		Cuenta c2 = new Cuenta(99999999,"juan",22,"M",0);
		
		
		
		
		
		
		
		
		
	}

}
