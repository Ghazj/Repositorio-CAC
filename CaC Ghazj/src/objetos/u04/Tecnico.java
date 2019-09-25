package objetos.u04;

public class Tecnico extends Empleado   {

	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	public String toString() {
		return "Empleado: " + getNombre() + " --> Operario --> Técnico.";
		
	} 

}
