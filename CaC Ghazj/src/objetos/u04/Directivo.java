package objetos.u04;

public class Directivo extends Empleado   {

	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return "Empleado: " + getNombre() + " --> Directivo.";
		
	} 

}
