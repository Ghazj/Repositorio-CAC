package cine;

public class MainCine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Butaca bu1 = new Butaca(1,1);
		
		System.out.println(bu1);
		bu1.ocupar();
		System.out.println(bu1);*/
		
		Sala sala1 = new Sala(10,10,22,1);
		/*System.out.println("");
		System.out.println(sala1);*/
		
		sala1.inicializarSala();
		
		sala1.toStringButacas();
		
		System.out.println(sala1.getButaca(3,7).ocupar());
		
		System.out.println("------------------------------------------------");
		
		
		
		
		
	
		
		
		
		sala1.toStringButacas();
		
	}

}
