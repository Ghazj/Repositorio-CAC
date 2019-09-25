package objetos.u04;

public class Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoCAC ECAC1 = new EmpleadoCAC("Roberto","El Cabeza",69,true,10000);
		System.out.println(ECAC1);
		System.out.println("");
		System.out.println(ECAC1.aumentarSalario(30));
		System.out.println("");
		System.out.println(ECAC1);
		System.out.println("");
		
		
		Programador p1 = new Programador("Jorgen","ceduloso",20,false,20000);
		
		System.out.println(p1);
		
		
	}

}
