package objetos.u02;

public class Ej01 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Jorgen", 1.54, 21, "Femenino");
		
		Persona p2 = new Persona();
		
		p2.setNombre("Roberto");
		p2.setAltura(1.75);
		p2.setEdad(24);
		 
		System.out.println(p2.getAltura());
		
		
		
		
		
	}
	
}
