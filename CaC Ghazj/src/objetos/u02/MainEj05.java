package objetos.u02;

public class MainEj05 {

	public static void main (String[] args) {
		
		//Title, author, year of release, format, digital.
		DiscoMusical thriller = new DiscoMusical("Thriller", "Michael Jackson", 1982, "pop", true);
		DiscoMusical back = new DiscoMusical("Back in Black", "ACDC", 1980, "rock", true);
		DiscoMusical dark = new DiscoMusical("Dark side of the moon", "Pink Floyd", 1973, "art rock", true);
		DiscoMusical hola = new DiscoMusical();
		DiscoMusical primero = new DiscoMusical();
		
		primero.setAutor("AAA");
		primero.setAnioEdicion(2018);
		primero.setDigital(true);
		primero.setFormato("Maqueta");
		primero.setTitulo("000");
		
	//	System.out.println(thriller.toString());
		
	
		
		DiscograficaArrayListBis ope = new DiscograficaArrayListBis("IA", 2002, 2);
		
		ope.AgregarDisco(thriller);
		ope.AgregarDisco(primero);
		
		System.out.println(ope.existe(hola));
		System.out.println(ope.buscar(primero));
		
	/*	System.out.println(ope.toString());
		System.out.println("");
		
		DiscograficaArrayListBis good = new DiscograficaArrayListBis("IA", 2002, 2);
				
				good.AgregarDisco(dark);
				good.AgregarDisco(back);
	
		System.out.println(good.toString());
		System.out.println("");

		
		System.out.println(good.buscarDisco());
		System.out.println(""); */

	}
}
